/**
 * JGridMap V 0.9.1 2012/08/10
 *  
 * The JGridMap class provides a fast and easy-to-use interface to
 * display elements in a 2D and, to some extend, even in a 3D array.
 * You just have to assign colors or images to numbers and pass
 * an array containing these numbers. The JGridMap is then displaying
 * the respective colors on the screen.
 * JGridMap is very fast, provides pan and zoom by dragging the mouse
 * or using the mousewheel. Moreover, JGridMap provides interfaces for
 * detecting mouseclicks in the grid.
 * 
 * This code is released under the GNU Lesser General Public License 
 * Version 3
 * http://www.gnu.org/licenses/lgpl-3.0.txt
 * 
 * JGridMap was developed at the University of Klagenfurt, Austria.
 * 
 * @author Thomas Dittrich, Tobias Ibounig, Wilfried Elmenreich, Tobi, Kristofer Schweiger
 */

package jGridMap;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.Timer;
import javax.swing.event.MouseInputAdapter;

public final class JGridMap extends JScrollPane implements PaintBoardInterface {

	/**
	 * The scroll mode (zooming) used in the JGM:
	 */
	public enum ZoomScrollMode {

		/** allows mouse wheel zoom, even during dragging **/
		ScrollAndDragScroll,
		/** no dragging **/
		NoObjectDrag,
		/** no dragging, no scrolling **/
		NoScroll
	}
	
	/**
	 * Defines how the JGM will be resized (zoom) if the window size changes.
	 */
	public enum AutomaticResizeMode {
		NoAutomaticResize,
		AutomaticResize
	}
	
	
	/**
	 * Generates a new JGridMap
	 * 
	 * @param w  
	 *					Width of the panel in pixels
	 * @param h  
	 *					Height of the panel in pixels
	 * @param gw 
	 *					Width of the grid in cells
	 * @param gh 
	 *					Height of the grid in cells
	 * @param gd 
	 *					Depth, number of stacked grids
	 */
	public JGridMap(int w, int h, int gw, int gh, int gd) {
		super(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		initScale(w, h, gw, gh);

		addComponentListener(new ComponentAdapter() {

			public void componentResized(ComponentEvent e) {
				updateScale();
			}
		});
	
		
		paintBoard = new PaintBoard(gw, gh, this);
		//paintBoard.setToolTipText("I'm a tooltip 2!");
		setGridSize(gw, gh, gd);

		paintBoard.addMouseWheelListener(new WheelListener());
		paintBoard.addMouseListener(new MouseButtonListener());
		paintBoard.addMouseMotionListener(new MouseButtonListener());

		paintBoard.addKeyListener(new KeyStrokeListener());
		dragable[0] = false;
		setViewportView(paintBoard);
		
		setToolTipperDefault();	//TODO
		System.out.println("> JGridMap: "+w+"/"+h+" => "+gw+"/"+gh);
	}
	
	/**
	 * Initialization and re-initialization of JGM
	 * @param -> same as in Constructor.
	 */
	public void reSize(int w, int h, int gw, int gh, int gd){
		
		initScale(w, h, gw, gh);
		paintBoard.reInit(gw, gh);
		setGridSize(gw, gh, gd);
	}
	
	/**
	 * Initialize the scale factor for the grid.
	 * Needed for correct visualization and zoom.
	 * 
	 * @param -> same as in Constructor.
	 */
	private void initScale(int w, int h, int gw, int gh){
		scale = Math.min(w / gw, h / gh);
		oldScale = scale;
		startScale = scale;
	}
	
	public PaintBoard paintBoard;
	private ZoomScrollMode scrollMode = ZoomScrollMode.ScrollAndDragScroll;
	private AutomaticResizeMode resizeMode = AutomaticResizeMode.AutomaticResize;
	private static final long serialVersionUID = -2040984841937302369L;
	private int scale = 10;
	private int startScale;
	private int oldScale = scale;
	private int gridHeight = 0;
	private int gridWidth = 0;
	private int gridDepth = 0;
	private double threeDScale= 2.0/3.0;
	private int[][] data2D;
	private int[][][] data3D;
	private boolean data3DEnable = false;
	private BufferedImage[] colorscale = new BufferedImage[1];
	private boolean[] dragable = new boolean[1];
	//private boolean threeD = false;
	private boolean gridLinesVisible = false;
	private Point scrollBarPosStartDrag = new Point();
	private Point mousePosStartDrag = new Point();
	private Point startDragCell = new Point(0, 0);
	private Point currentDragCell = new Point(0, 0);
	private Color gridColor = Color.DARK_GRAY;
	private Color backgroundColor = Color.WHITE;
	private boolean isBeeingDraged = false;
	private boolean leftClick = true;
	private boolean drawDrag = false;
	private GraphicsConfiguration gfx_config = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
	private JGridMapEventSource eventSrc = new JGridMapEventSource(this);
	private MouseEvent lastPressEvent;
	private MouseEvent lastReleaseEvent;
	private boolean wasDoubleRelease = true;
	private boolean doubleClick = true;
	/**
	 * Creates a mapping from an index to a color. Drag feature is off by default.
	 * 
	 * @param index
	 *          an integer > 0
	 * @param c
	 *          color to be assigned to this index
	 */
	public void addColorToScale(int index, Color c) {
		addColorToScale(index, c, false);
	}

	/**
	 * Creates a mapping from an index to a color
	 * 
	 * @param index
	 *          an integer > 0
	 * @param color
	 *          color to be assigned to this index
	 * @param isDragable
	 *          enables mouse drag animation for this object
	 */
	public void addColorToScale(int index, Color color, boolean isDragable) {
		addToScale(index, createBufferedImageFromColor(color), isDragable);
	}

	/**
	 * Creates a mapping from an index to an image
	 * 
	 * @param index
	 *          an integer > 0
	 * @param filename
	 *          path and filename to the respective image file
	 */
	public void addImageToScale(int index, String filename) {
		addImageToScale(index, filename, false);
	}

	/**
	 * Creates a mapping from an index to an image
	 * 
	 * @param index
	 *          an integer > 0
	 * @param filename
	 *          path and filename to the respective image file
	 * @param isDragable
	 *          enables mouse drag animation for this object
	 */
	public void addImageToScale(int index, String filename, boolean isDragable) {
		try {
			BufferedImage img = createBufferedImageFromFile(filename);
			addBufferedImageToScale(index, img, isDragable);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Add an image to an specified index.
	 * Can be used for changing/overwriting the image to index mapping.
	 */
	public void addBufferedImageToScale(int index, BufferedImage img, boolean isDragable){
		addToScale(index, img, isDragable);
	}
	
	/**
	 * Create an image.
	 * @return BufferedImage which can be potentially graphically accelerated 
	 * @throws IOException
	 */
	public BufferedImage createBufferedImageFromFile(String filename) throws IOException{
		BufferedImage img = toCompatibleImage(ImageIO.read(new File(filename)));
		return img;
	}
	
	/**
	 * 'Convert' a color to a 1x1 image
	 * 
	 * @param color
	 * @return an 1x1 image with the color, which can be potentially graphically accelerated 
	 */
	public BufferedImage createBufferedImageFromColor(Color color) {
		BufferedImage image = toCompatibleImage(new BufferedImage(1, 1, BufferedImage.TYPE_INT_RGB));
		Graphics2D g2d = image.createGraphics();
		g2d.setPaint(color);
		g2d.fillRect(0, 0, image.getWidth(), image.getHeight());
		g2d.dispose();
		return image;
	}
	
	/**
	 * Deletes the mapping for a particular index
	 * @param index 
	 */
	public void removeFromScale(int index) {
		if (index > 0 && index < colorscale.length) {
			colorscale[index] = null;
		}
	}

	/** set a defined toolTipper (may be null) **/
	public ToolTipper setToolTipper(ToolTipper toolTipper){
		return paintBoard.setToolTipper(toolTipper);
	}
	/** set/activate the default toolTipper **/
	public ToolTipper setToolTipperDefault(){
		return paintBoard.setToolTipper(new DefaultToolTipper());
	}
	
	
	/**
	 * Sets a single value in the grid
	 * 
	 * @param x
	 *          cell index on x axis
	 * @param y
	 *          cell index on y axis
	 * @param d
	 *          value to be set
	 */
	public void setData(int x, int y, int d) {
		if (y < data2D.length && x < data2D[y].length) {
			data2D[y][x] = d;
			data3DEnable = false;
		}
	}

	/**
	 * Sets a single value in the grid for 3D mode
	 * 
	 * @param x
	 *          cell index on x axis
	 * @param y
	 *          cell index on y axis
	 * @param z
	 *          grid index
	 * @param d
	 *          value to be set
	 */
	public void setData(int x, int y, int z, int d) {
		if (z < data3D.length && y < data3D[z].length && x < data3D[z][y].length) {
			data3D[z][y][x] = d;
			data3DEnable = true;
		}
	}

	/**
	 * Pass a full two-dimensional array (copy) to JGridMap.
	 * 
	 * @param d [y][x]
	 *          Two-dimensional integer-array, columns and rows must match the
	 *          grid
	 */
	public void setData(int[][] d) {
		for (int y = 0; y < gridHeight; y++) {
			System.arraycopy(d[y], 0, data2D[y], 0, gridWidth);
		}
		data3DEnable = false;
	}
	
	/**
	 * Like setData(...), but array is not copied.
	 * @param d [y][x]
	 */
	public void setDataDirect(int[][] d) {
		this.data2D = d;
		data3DEnable = false;
	}

	/**
	 * Pass a full three-dimensional array to JGridMap
	 * 
	 * @param d [z][y][x]
	 *          Three-dimensional integer-array, columns and rows must match the
	 *          grid, last parameter is number stacked grids
	 */
	public void setData(int[][][] d) {
		
		data3D = new int[data3D.length][][];
		for (int z = 0; z < data3D.length; z++) {
			
			data3D[z] = new int[data3D[z].length][];
			for (int y = 0; y < data3D[z].length; y++) {
				
				int lengthZX = data3D[z][y].length;
				data3D[z][y] = Arrays.copyOf(d[z][y], lengthZX);
			}
		}
		
		data3DEnable = true;
	}
	
	/**
	 * Like setData(...), but array is not copied.
	 * @param d [z][y][x]
	 */
	public void setDataDirect(int[][][] d) {
		data3D = d;
		data3DEnable = true;
	}

	/**
	 * Sets the size of the grid. Any existing dataset will be replaced by an
	 * empty array.
	 * 
	 * @param gridWidth
	 *          number of grid cells in width
	 * @param gridHeight
	 *          number of grid cells in height
	 * @param gridDepth
	 *          number of stacked grids (for 3D mode)
	 */
	public void setGridSize(int gridWidth, int gridHeight, int gridDepth) {
		Dimension dim = new Dimension(gridWidth * scale + 1, gridHeight * scale + 1);
		paintBoard.setSize(dim);
		paintBoard.setPreferredSize(dim);
		this.gridWidth = gridWidth;
		this.gridHeight = gridHeight;
		this.gridDepth = gridDepth;
		this.data2D = new int[gridHeight][gridWidth];
		this.data3D = new int[gridDepth][gridHeight][gridWidth];
	}

	/**
	 * Returns the color of the grid lines
	 * 
	 * @return gridColor
	 */
	public Color getLineGridColor() {
		return gridColor;
	}

	/**
	 * Sets the color of the grid.
	 * 
	 * @param gridColor
	 */
	public void setGridColor(Color gridColor) {
		this.gridColor = gridColor;
	}

	/**
	 * Returns the background color (visible when array value is 0).
	 * 
	 * @return gridColor
	 */
	public Color getBackgroundColor() {
		return backgroundColor;
	}

	/**
	 * Sets the color of the background (visible when array value is 0).
	 * 
	 * @param backgroundColor 
	 */
	public void setBackgroundColor(Color backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	/**
	 * Checks if 3D mode is enabled
	 * @return 
	 */
	public boolean is3D() {
		return data3DEnable;
	}

	/**
	 * Returns the current scale (depending on zoom level)
	 * @return 
	 */
	public int getZoomScale() {
		return scale;
	}

	/**
	 * Sets the current scale (influences zoom level)
	 * 
	 * @param newscale
	 */
	public void setZoomScale(int newscale) {
		scale = newscale;
	}

	/**
	 * Returns the current scale (depending on zoom level)
	 */
	public double get3DScale() {
		return threeDScale;
	}

	/**
	 * Sets the current scale (influences zoom level)
	 * 
	 * @param newscale
	 */
	public void set3DScale(double threeDScale) {
		this.threeDScale = threeDScale;
	}	

	/**
	 * Returns the number of grid layers (relevant for 3D mode)
	 * @return 
	 */
	public int getGridDepth() {
		return gridDepth;
	}

	/**
	 * Returns the dimension of the grid (width by height)
	 * @return 
	 */
	public Dimension getGridSize() {
		return new Dimension(gridWidth, gridHeight);
	}

	/**
	 * Enables/disables the double click detection and event. If enabled, a single
	 * mouse click event is delayed until a potential double click would have done
	 * place. Enabling the double click induces lag in the detection of single
	 * clicks
	 * @param enabled 
	 */
	public void setDoubleClickDetection(boolean enables) {
		doubleClick = enables;
	}

	/**
	 * True if doubleClickDetection is enabled
	 * @return 
	 */
	public boolean getDoubleClickDetection() {
		return doubleClick;
	}

	/**
	 * @return the scrollMode
	 */
	public ZoomScrollMode getScrollMode() {
		return scrollMode;
	}

	/**
	 * @param scrollMode
	 *          the scrollMode to set
	 */
	public void setScrollMode(ZoomScrollMode scrollMode) {
		this.scrollMode = scrollMode;
	}
	
	/**
	 * @param resizeMode
	 *          the resizeMode to set
	 */
	public void setResizeMode(AutomaticResizeMode resizeMode) {
		this.resizeMode = resizeMode;
	}

	/**
	 * Returns the width of the grid in cells
	 * @return 
	 */
	public int getGridWidth() {
		return gridWidth;
	}

	/**
	 * Returns the height of the grid in cells
	 * @return 
	 */
	public int getGridHeight() {
		return gridHeight;
	}

	/**
	 * Checks if the grid lines are displayed
	 * @return 
	 */
	public boolean isGridLinesVisible() {
		return gridLinesVisible;
	}

	/**
	 * Switches grid lines on or off
	 * 
	 * @param visible
	 *          if true
	 */
	public void setGridLines(boolean visible) {
		this.gridLinesVisible = visible;
	}

	/**
	 * Uses the scales in combination with the updateUI function of the superclass (ScrollPanel)
	 * to adjust the size.
	 */
	private void updateScale() {
		startScale = (int) Math.min(getSize().getWidth() / gridWidth, getSize().getHeight() / gridHeight);
		boolean doResize = false;
		
		switch(resizeMode){
		case NoAutomaticResize: doResize=false; break;
		case AutomaticResize: doResize=startScale!=scale; break;
		default: throw new RuntimeException("Undefined case for switch on Enum.");
		}
		
		if (doResize) {
			scale = startScale;
			oldScale = scale;
			updateUI();
		}
	}

	/**
	 * Creates a mapping from an index to an image
	 * 
	 * @param index
	 *          an integer > 0
	 * @param image
	 *          image to be assigned to this index
	 * @param isDragable
	 *          enables mouse drag animation for this object
	 */
	private void addToScale(int index, BufferedImage image, boolean isDragable) {
		
		if (index > 0) { //position 0 is reserved for GridData
			if (index >= colorscale.length) {			
						BufferedImage[] temp = new BufferedImage[index+1];
						System.arraycopy(colorscale, 0, temp, 0, colorscale.length);
						colorscale = temp;
						boolean[] temp2 = new boolean[index+1];
						System.arraycopy(dragable, 0, temp2, 0, dragable.length);
						dragable = temp2;				
			}
			colorscale[index] = image;
			dragable[index] = isDragable;
		}
		else{
			System.err.println("Index must have a positive value. Index was not mapped to image.");		
			//throw new RuntimeException("Index must have a positive value.");
		}
	}
	
	/**
	 * For even better performance internal lists can be prepared for the maximum
	 * index which is planned for usage.
	 * Only affects performance.
	 * @param maxIndex
	 */
	public void prepareListsForMaximumIndex(int maxIndex){
		if (maxIndex >= colorscale.length) {
			BufferedImage[] temp = new BufferedImage[maxIndex + 1];
			System.arraycopy(colorscale, 0, temp, 0, colorscale.length);
			colorscale = temp;
			boolean[] temp2 = new boolean[maxIndex + 1];
			System.arraycopy(dragable, 0, temp2, 0, dragable.length);
			dragable = temp2;
		}
	}

	/**
	 * Convert Picture to one that can be potentially graphically accelerated
	 * see here
	 * http://stackoverflow.com/questions/196890/java2d-performance-issues
	 * @param image
	 * @return
	 */
	private BufferedImage toCompatibleImage(BufferedImage image) {
		if (image.getColorModel().equals(gfx_config.getColorModel())) {
			return image;
		}
		BufferedImage new_image = gfx_config.createCompatibleImage(
				image.getWidth(), image.getHeight(), image.getTransparency());
		Graphics2D g2d = (Graphics2D) new_image.getGraphics();
		g2d.drawImage(image, 0, 0, null);
		g2d.dispose();
		return new_image;
	}

	private void refreshSize() {
		paintBoard.setSize(new Dimension(gridWidth*scale + 1, gridHeight*scale + 1));
		paintBoard.setPreferredSize(new Dimension(gridWidth*scale + 1, gridHeight*scale + 1));
		setViewportView(paintBoard);
	}

	
	/**
	 * KeyBoardListener listen to KeyStrokes
	 * @author Sabrina
	 * mouselistener must register an action on the grid first, before the KeyStrokeListener gets enough focus from the keyboard to act
	 */
	public class KeyStrokeListener implements  KeyListener{
		
	
		
		@Override
		public void keyTyped(KeyEvent e) { 

		}

		@Override
		public void keyPressed(KeyEvent e) {
			 
			if(e.isControlDown()){
				if(e.getKeyCode() == KeyEvent.VK_A){
					eventSrc.triggerKeyBoardEvent(KeyBoardEventType.markAll);
				} else if(e.getKeyCode() == KeyEvent.VK_C){
					eventSrc.triggerKeyBoardEvent(KeyBoardEventType.copy); 
				} else if(e.getKeyCode() == KeyEvent.VK_S){
					eventSrc.triggerKeyBoardEvent(KeyBoardEventType.save);
				} else if(e.getKeyCode() == KeyEvent.VK_V){
					eventSrc.triggerKeyBoardEvent(KeyBoardEventType.paste);
				} else if(e.getKeyCode() == KeyEvent.VK_Y){
					eventSrc.triggerKeyBoardEvent(KeyBoardEventType.redo);
				} else if(e.getKeyCode() == KeyEvent.VK_Z){
					eventSrc.triggerKeyBoardEvent(KeyBoardEventType.undo);
				} else if((e.getKeyCode() == KeyEvent.VK_X)){
					eventSrc.triggerKeyBoardEvent(KeyBoardEventType.cutoff);
				}else if((e.getKeyCode() == KeyEvent.VK_N)&&(e.isAltDown())){
					eventSrc.triggerKeyBoardEvent(KeyBoardEventType.newGrid);
				} else eventSrc.triggerKeyBoardEvent(KeyBoardEventType.markMore_ON);
			} else if(e.getKeyCode() == KeyEvent.VK_DELETE){
				eventSrc.triggerKeyBoardEvent(KeyBoardEventType.delete);
			} //else eventSrc.triggerKeyBoardEvent(KeyBoardEventType.markMore_OFF);

		}

		@Override
		public void keyReleased(KeyEvent e) {
			
			eventSrc.triggerKeyBoardEvent(KeyBoardEventType.markMore_OFF);
			
		}


		
	}
	
	/**
	 * 
	 * Mouse WheelListener
	 *change the scale of the grid, when the wheel of the mouse has been activated
	 */
	private class WheelListener implements MouseWheelListener {

		@Override
		public void mouseWheelMoved(MouseWheelEvent m) {
			int wheelRotation = -m.getWheelRotation();
			int mouseX = m.getX();
			int mouseY = m.getY();
			m.consume();
			if ((scrollMode == ZoomScrollMode.ScrollAndDragScroll) || scrollMode == ZoomScrollMode.NoObjectDrag) {
				setZoomScale((getZoomScale() + wheelRotation) >= startScale ? (getZoomScale() + wheelRotation) : startScale);
				refreshSize();
				int xScrollBarPos = Math.min(
						getHorizontalScrollBar().getValue()
						+ (int) ((double) mouseX * ((double) scale
								/ (double) oldScale - 1.0)), getHorizontalScrollBar().getMaximum());
				int yScrollBarPos = Math.min(
						getVerticalScrollBar().getValue()
						+ (int) ((double) mouseY * ((double) scale
								/ (double) oldScale - 1.0)), getVerticalScrollBar().getMaximum());
				paintBoard.repaint();

				getHorizontalScrollBar().setValue(xScrollBarPos);
				getVerticalScrollBar().setValue(yScrollBarPos);

				oldScale = scale;
			}
		}
	}

	private boolean checkIfDragable() {
		int x = startDragCell.x;
		int y = startDragCell.y;
		
		if (data3DEnable) {
			boolean objectExists = false;
//			for (int z = 0; z < data3D.length; z++) {//no need to look to the other overlays. on z = 0 are the obj. thats all we want
				if (data3D[0][y][x] != 0) { 
					objectExists = true;
					if (dragable[ data3D[0][y][x] ] != true) {
						return false;
					}
				}
//			}
			return objectExists;
		
		} else {
			if (dragable[ data2D[y][x] ] != true) {
				return false;
			}
			return true;
		}
	}

	private class MouseButtonListener extends MouseInputAdapter {

		boolean wasDoubleClick = false;
		Timer PressTimer = null;
		Timer ReleaseTimer = null;

		@Override
		public void mousePressed(MouseEvent m) {
			if (doubleClick) {
				if (m.getClickCount() == 2) {
					doublePressed(m);
				} else {
					Integer timerinterval = ((Integer) Toolkit.getDefaultToolkit().getDesktopProperty("awt.multiClickInterval"))/100; //set timerinterval
					
					PressTimer = new Timer(timerinterval.intValue(),
							new ActionListener() {

						public void actionPerformed(ActionEvent evt) {
							if (wasDoubleClick) {
								wasDoubleClick = false; // reset flag
							} else {
								singlePressed(lastPressEvent);
							}
						}
					});

					PressTimer.setRepeats(false);
					PressTimer.start();
					lastPressEvent = m;
					if (m.getX() > 0 && m.getX() / scale < gridWidth 
							&& m.getY() > 0 && m.getY() / scale < gridHeight) {
						if (!isBeeingDraged) {
							scrollBarPosStartDrag = new Point(getHorizontalScrollBar().getValue(), getVerticalScrollBar().getValue());
							mousePosStartDrag = new Point(m.getXOnScreen(), m.getYOnScreen());
							startDragCell.x = m.getX() / scale;
							startDragCell.y = m.getY() / scale;
							currentDragCell.x = startDragCell.x;
							currentDragCell.y = startDragCell.y;
						}
					}
				}
//			} else {
//				singlePressed(m);
			}
		}

		private void doublePressed(MouseEvent m) {
			wasDoubleClick = true;
			switch (m.getButton()) {
			case MouseEvent.BUTTON1: //left button on the mouse
				leftClick = true;
				eventSrc.triggerMouseEvent(MouseEventType.leftDoublePress);
				break;
			case MouseEvent.BUTTON3: //right button on the mouse
				leftClick = false;
				eventSrc.triggerMouseEvent(MouseEventType.rightDoublePress);
				break;
			}
		}

		private void singlePressed(MouseEvent m) {
			if (m.getX() > 0 && m.getX() / scale < gridWidth && m.getY() > 0
					&& m.getY() / scale < gridHeight) {
				if (!isBeeingDraged) {
					scrollBarPosStartDrag = new Point(
							getHorizontalScrollBar().getValue(), getVerticalScrollBar().getValue());
					mousePosStartDrag = new Point(m.getXOnScreen(), m.getYOnScreen());
					startDragCell.x = m.getX() / scale;
					startDragCell.y = m.getY() / scale;
					currentDragCell.x = startDragCell.x;
					currentDragCell.y = startDragCell.y;
					switch (m.getButton()) {
					case MouseEvent.BUTTON1:
						leftClick = true; 
						eventSrc.triggerMouseEvent(MouseEventType.leftPress);
					
//						paintBoard.setFocusable(true);
						paintBoard.requestFocusInWindow();
						break;
					case MouseEvent.BUTTON3:
						leftClick = false;
						eventSrc.triggerMouseEvent(MouseEventType.rightPress);
						break;
					
					}
				}
			}
		}

		@Override
		public void mouseReleased(MouseEvent m) {
			
			System.out.println("> mouseReleased: "+m.getX()+"/"+m.getY()+" => "+m.getX() / scale+"/"+m.getY() / scale);
			
			currentDragCell.x = m.getX() / scale;
			currentDragCell.y = m.getY() / scale;
			if (currentDragCell.x < gridWidth && currentDragCell.y < gridHeight
					&& currentDragCell.x >= 0 && currentDragCell.y >= 0) {
				if (doubleClick) { //check if option that it could be a double click is true
					if (m.getClickCount() == 2) {
						wasDoubleRelease = true;
						doubleRelease(m);
					} else { //no double click
						lastReleaseEvent = m;
						Integer timerinterval = (Integer) Toolkit.getDefaultToolkit().getDesktopProperty("awt.multiClickInterval");
						wasDoubleRelease = false; 
						ReleaseTimer = new Timer(timerinterval.intValue(),
								new ActionListener() {

							public void actionPerformed(ActionEvent evt) {
								if (wasDoubleRelease) {
									wasDoubleRelease = false; // reset flag
								} else {
									// System.out.println("  and it's a single click!");
									
											singleRelease(lastReleaseEvent);												
								}
							}
						});

						ReleaseTimer.setRepeats(false);
						ReleaseTimer.start();
					}
//				} else {
//					singleRelease(m);
				}
//			} else { 
				//as long as we have the possibility to click twice, this path will never happens 
//				drawDrag = false;
//				isBeeingDraged = false;
//				setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
//				paintBoard.repaint();
			}
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			if (e.getX() > 0 && e.getX() / scale < gridWidth 
					&& e.getY() > 0 && e.getY() / scale < gridHeight) {
				isBeeingDraged = true;
				currentDragCell.x = e.getX() / scale;
				currentDragCell.y = e.getY() / scale;

				if (scrollMode != ZoomScrollMode.NoScroll && !checkIfDragable()) {
					int dX = e.getXOnScreen() - mousePosStartDrag.x;
					int dY = e.getYOnScreen() - mousePosStartDrag.y;
					int xScrollBarPos = Math.min(
							Math.max(0, scrollBarPosStartDrag.x - dX),
							getHorizontalScrollBar().getMaximum());
					int yScrollBarPos = Math.min(Math.max(0, scrollBarPosStartDrag.y - dY), getVerticalScrollBar().getMaximum());
					getHorizontalScrollBar().setValue(xScrollBarPos);
					getVerticalScrollBar().setValue(yScrollBarPos);
				}
				if (!currentDragCell.equals(startDragCell)) {
					if (scrollMode == ZoomScrollMode.ScrollAndDragScroll && leftClick
							&& checkIfDragable()) {
						drawDrag = true;
						paintBoard.repaint();
						setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
					}
				}
				if (currentDragCell.equals(startDragCell)) {
					drawDrag = false;
					paintBoard.repaint();
				}
				if (currentDragCell.x < gridWidth && currentDragCell.y < gridHeight
						&& currentDragCell.x >= 0 && currentDragCell.y >= 0 ) {
					System.out.println(currentDragCell.x + " " + currentDragCell.y);
					eventSrc.triggerMouseEvent(MouseEventType.drag);
				}
				paintBoard.repaint();
			}
		}

		
		public void singleRelease(MouseEvent m) {
			if (isBeeingDraged) {
				if (m.getButton() == MouseEvent.BUTTON1 && leftClick) {
					isBeeingDraged = false;
					eventSrc.triggerMouseEvent(MouseEventType.leftRelease);
					setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
				} else if (m.getButton() == MouseEvent.BUTTON3 && !leftClick) {
					isBeeingDraged = false;
					eventSrc.triggerMouseEvent(MouseEventType.rightRelease);
					setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
				}
				drawDrag = false;
			} else {
				if (m.getButton() == MouseEvent.BUTTON1 && leftClick) {
					eventSrc.triggerMouseEvent(MouseEventType.leftRelease);
					setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
				} else if (m.getButton() == MouseEvent.BUTTON3 && !leftClick) {
					eventSrc.triggerMouseEvent(MouseEventType.rightRelease);
					setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
				} 
			}
			paintBoard.repaint();
		}

		public void doubleRelease(MouseEvent m) {
			if (isBeeingDraged) {
				if (m.getButton() == MouseEvent.BUTTON1 && leftClick) {
					isBeeingDraged = false;
					eventSrc.triggerMouseEvent(MouseEventType.leftDoubleRelease);
				} else if (m.getButton() == MouseEvent.BUTTON3 && !leftClick) {
					isBeeingDraged = false;
					eventSrc.triggerMouseEvent(MouseEventType.rightDoubleRelease);
				}
				setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
				drawDrag = false;
			} else {
				if (m.getButton() == MouseEvent.BUTTON1 && leftClick) {
					eventSrc.triggerMouseEvent(MouseEventType.leftRelease);
				} else if (m.getButton() == MouseEvent.BUTTON3 && !leftClick) {
					eventSrc.triggerMouseEvent(MouseEventType.rightDoubleRelease);
				}
				setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			}
			paintBoard.repaint();
		}
	}

	/**
	 * Component where the Painting takes place If you set new data, call
	 * paintBoard.repaint()
	 */
	public class PaintBoard extends JPanel {

		private static final long serialVersionUID = -4007936423281940337L;
		private ToolTipper toolTipper = null;
		private final PaintBoardInterface paintBoardInterface;

		/**
		 * @param gw
		 * @param gh
		 * @param paintBoardInterface
		 */
		public PaintBoard(int gw, int gh, PaintBoardInterface paintBoardInterface) {
			super();
			this.paintBoardInterface = paintBoardInterface;
			this.reInit(gw,gh);
			this.requestFocusInWindow();
		}
		
		/** Set a component for generating tool tips in the grid **/
		public ToolTipper setToolTipper(ToolTipper tt){
			ToolTipper ret = toolTipper;
			
			if(tt != null){
				toolTipper = tt;
				paintBoard.setToolTipText("");		// activate tool tips
			}
			else{
				paintBoard.setToolTipText(null);	// de-activate tool tips
				toolTipper = null;
			}
			return ret;
		}
		
		@Override
		public String getToolTipText(){
			return null;
		}
		@Override
		public String getToolTipText(MouseEvent e){
			int zoomScale = paintBoardInterface.getZoomScale();
			Point coordinate = new Point(e.getX(), e.getY());
			Point cell = new Point(e.getX()/zoomScale, e.getY()/zoomScale);
			
			String tip = toolTipper.getTooltipText(coordinate, cell);
			return tip;
		}
		
		/**
		 * Initialization and re-initialization of the PaintBoard.
		 * @param gw
		 * @param gh
		 */
		public void reInit(int gw, int gh){
			setPreferredSize(new Dimension(gw * scale + 1, gh * scale + 1));
		}

		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D) g;

			g2d.setColor(backgroundColor);
			g2d.fillRect(0, 0, gridWidth * scale, gridHeight * scale);
			if (gridLinesVisible) {
				g2d.setColor(gridColor);
				// If we have a sqare Grid we can draw all lines within one for-loop -->
				// performance =)
				if (gridWidth == gridHeight) {
					for (int iw = 0; iw <= gridWidth; iw++) {
						g2d.drawLine(iw * scale, 0, iw * scale, gridHeight * scale);
						g2d.drawLine(0, iw * scale, gridWidth * scale, iw * scale);
					}
				} else {
					for (int iw = 0; iw <= gridWidth; iw++) {
						g2d.drawLine(iw*scale, 0,  iw*scale, gridHeight*scale);
					}
					for (int ih = 0; ih <= gridHeight; ih++) {
						g2d.drawLine(0, ih*scale,  gridWidth*scale, ih*scale);
					}
				}
			}
			
			if (data3DEnable) {
				
				for (int z = 0; z < data3D.length; z++) {
					for (int y = 0; y < data3D[z].length; y++) {
						for (int x = 0; x < data3D[z][y].length; x++) {
							
							if(z==0){
								g2d.drawImage(colorscale[ data3D[0][y][x] ], 
										x*scale, y*scale,	scale, scale, null);
							}
							else if(z==4){ //mark the spot with a field, that has the size of the object
								g2d.drawImage(colorscale[ data3D[4][y][x] ], 
								x*scale, y*scale,	scale, scale, null);
							}
							else{
								double calc = Math.pow(threeDScale, z);
								int pos2 = 1 + (int) ((scale - 1) * (1 - calc) / 2);
								int scale2 = (int) ((scale - 1) * calc);
								
								g2d.drawImage(colorscale[ data3D[z][y][x] ], 
										x * scale + pos2, 
										y * scale + pos2,
										scale2, scale2,
										null);
							}
							
						}
					}
				}
				
			} else {
				for (int y = 0; y < data2D.length; y++) {
					for (int x = 0; x < data2D[y].length; x++) {
						if (data2D[y][x] > 0 && data2D[y][x] < colorscale.length) {
							g2d.drawImage(colorscale[data2D[y][x]], 
									x*scale, y*scale, scale, scale, null);
						}
					}
				}
			}
			
			if (drawDrag) {
				int y = startDragCell.y;
				int x = startDragCell.x;
				
				if (data3DEnable) {
					g2d.setColor(Color.BLUE);
					g2d.drawRect(x*scale, y*scale, scale, scale);
					
					for (int z = 0; z < data3D.length; z++) {
						
						if (data3D[z][y][x] > 0 && data3D[z][y][x] < colorscale.length) {
							double calc = Math.pow(threeDScale, z);
							int pos2 = 1 + (int) ((scale - 1) * (1 - calc) / 2);
							int scale2 = (int) ((scale - 1) * calc);
							
							g2d.drawImage(colorscale[ data3D[z][y][x] ], 
									x * scale + pos2, 
									y * scale + pos2,
									scale2, scale2,
									null);
						}
					}
				} else {
					if (data2D[y][x] > 0 && data2D[y][x] < colorscale.length) {
						g2d.setColor(Color.BLUE);
						g2d.drawRect(x*scale, y*scale, scale, scale);
						g2d.drawImage( colorscale[ data2D[y][x] ],
								x*scale, y*scale, scale, scale, null);
					}
				}
			}
		}
	}

	/**
	 * different events of keyboard inputs. 
	 * @author Sabrina
	 *
	 */
	public enum KeyBoardEventType{
		/**
		 * mark everything on the grid
		 */
		markAll,
		/**
		 * mark more objects than one, but not all
		 */
		markMore_ON,
		markMore_OFF,
		/**
		 * copy marked object
		 */
		copy,
		/**
		 * paste marked object
		 */
		paste,
		/**
		 * un-do a deleting of an object
		 */
		undo,
		/**
		 * re-do last action
		 */
		redo,
		/**
		 * save the specifications on the grid in an xml file
		 */
		save,
		/**
		 * clear the grid
		 */
		newGrid,
		/**
		 * delete a marked object
		 */
		delete,
		/**
		 * the marked object should be cutted off, to be added on another position
		 */
		cutoff,

	
	}
	
	
	/**
	 * The different events generated by JGridMap
	 */
	public enum MouseEventType {

		/**
		 * Left Mouse-Button Pressed
		 */
		leftPress,
		/**
		 * Left Mouse-Button Released
		 */
		leftRelease,
		/**
		 * Right Mouse-Button Pressed
		 */
		rightPress,
		/**
		 * Right Mouse-Button Released
		 */
		rightRelease,
		/**
		 * Mouse Dragged, enable to shift the grid and move on it. 
		 */
		drag,
		/**
		 * Left Mouse-Button DoublePressed (only if Double-Click detection is
		 * active)
		 */
		leftDoublePress,
		/**
		 * Left Mouse-Button DoubleReleased (only if Double-Click detection is
		 * active)
		 */
		leftDoubleRelease,
		/**
		 * Right Mouse-Button DoublePressed (only if Double-Click detection is
		 * active)
		 */		
		rightDoublePress,
		/**
		 * Right Mouse-Button DoubleReleased (only if Double-Click detection is
		 * active)
		 */
		rightDoubleRelease,
	}
	
	/**
		 * @author Sabrina
		 */
	public class JGridMapKeyEvent extends java.util.EventObject {

		
		private static final long	serialVersionUID	= 1L;
		private KeyBoardEventType type;

		public JGridMapKeyEvent(Object source, KeyBoardEventType type) {
			super(source);
			this.type = type;
			
		}

		public KeyBoardEventType getKeyEventType() {
			return type;
		}
		
	}

	/**
	 * 
	 */
	public class JGridMapMouseEvent extends java.util.EventObject {

		private static final long serialVersionUID = 1L;
		private MouseEventType type;
		private Point current;
		private Point origin;

		/**
		 * 
		 * @param source
		 * @param type
		 * @param current
		 * @param origin
		 */
		public JGridMapMouseEvent(Object source, MouseEventType type, Point current,
				Point origin) {
			super(source);
			this.type = type;
			this.current = current;
			this.origin = origin;
		}

		/**
		 * @return the type
		 */
		public MouseEventType getType() {
			return type;
		}

		/**
		 * @return the current
		 */
		public Point getCurrent() {
			return current;
		}

		/**
		 * @return the origin
		 */
		public Point getOrigin() {
			return origin;
		}
	}

	/**
	 * Implement this listener to capture mouse events inside the drawing area
	 */
	public interface JGridMapEventListener {

		public void handleJGridMapMouseEvent(JGridMapMouseEvent e);
		
		public void handleJGridMapKeyBoardEvent(JGridMapKeyEvent e);
		
	}

	/**
	 * 
	 */
	public class JGridMapEventSource {

		private List<JGridMapEventListener> listeners = new ArrayList<JGridMapEventListener>();
		private JGridMap wb;

		/**
		 * 
		 * @param wb
		 */
		public JGridMapEventSource(JGridMap wb) {
			this.wb = wb;
		}

		/**
		 * 
		 * @param listener
		 */
		public synchronized void addEventListener(JGridMapEventListener listener) {
			listeners.add(listener);
		}

		/**
		 * 
		 * @param listener
		 */
		public synchronized void removeEventListener(JGridMapEventListener listener) {
			listeners.remove(listener);
		}

		private synchronized void triggerMouseEvent(MouseEventType type) {
			Point origin = wb.startDragCell;
			Point current = wb.currentDragCell;
			JGridMapMouseEvent event = new JGridMapMouseEvent(this, type, current, origin);
			Iterator<JGridMapEventListener> i = listeners.iterator();
			while (i.hasNext()) {
				i.next().handleJGridMapMouseEvent(event); 
			}
		}
		
	
		private synchronized void triggerKeyBoardEvent(KeyBoardEventType type){
			JGridMapKeyEvent event = new JGridMapKeyEvent(this, type);
			Iterator<JGridMapEventListener> i = listeners.iterator();
			while (i.hasNext()) {
				i.next().handleJGridMapKeyBoardEvent(event); 
			}
			
			
		}
	}
	


	/**
	 * 
	 * @param listener
	 */
	public void addEventListener(JGridMapEventListener listener) {
		eventSrc.addEventListener(listener);
	}

	/**
	 * 
	 * @param listener
	 */
	public void removeEventListener(JGridMapEventListener listener) {
		eventSrc.removeEventListener(listener);
	}
}


/** Interface defining interactions needed by PaintBoard **/
interface PaintBoardInterface {
	/** @return the current scale (depending on zoom level) **/
	public int getZoomScale();
}

/** ToolTipper: Object generating coordinate based tool tips for the JGM/Paintboard **/
interface ToolTipper {
	/** get the specified **/
	public String getTooltipText(Point pixel, Point cell);
}

/** Simple Implementation for ToolTipper **/
class DefaultToolTipper implements ToolTipper {
	@Override
	public String getTooltipText(Point pixel, Point cell) {
		return cell.x+"/"+cell.y;
	}
}