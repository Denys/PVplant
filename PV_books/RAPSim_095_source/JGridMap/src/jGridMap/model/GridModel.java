package jGridMap.model;

import jGridMap.JGridMap;
import jGridMap.JGridMap.AutomaticResizeMode;
import jGridMap.JGridMap.ZoomScrollMode;

import java.awt.Color;

import javax.swing.ScrollPaneConstants;

import examples.snake.model.SnakeGridModel.PredefinedColor;

/**
 * The basic grid model with important parameters an default configurations.
 * Automatically creates the JGM.
 * 
 * Extend this model if more functionality is needed in the application.
 * 
 * @author Kristofer Schweiger
 */
public class GridModel {

	//public static int DEFAULT_WIDTH=500, DEFAULT_HIGHT=500, DEFAULT_CELLS_WIDTH=25, DEFAULT_CELLS_HIGHT=25;
	public static Color DEFAULT_GRID_LINE_COLOR = new Color(230, 230, 230);
	public static boolean DEFAULT_GRID_LINES = true;
	/** The JGridMapScroll mode (zoom mode), JGridMap.ScrollMode **/
	public static ZoomScrollMode DEFAULT_SCROLL_MODE = JGridMap.ZoomScrollMode.ScrollAndDragScroll;
	/** Display scroll bars, true/false **/
	public static boolean DEFAULT_ENABLE_SCROLLBARS = true;	
	/** The JGridMapScroll mode (zoom mode), JGridMap.ScrollMode **/
	public static AutomaticResizeMode DEFAULT_RESIZE_MODE = JGridMap.AutomaticResizeMode.NoAutomaticResize;	
	public static int DEFAULT_GRID_DEPTH = 1;
	public static int DEFAULT_FIELD_SIZE = 10;
	public static boolean DEFAULT_COPY_DATA_AT_REINIT = true;
	public static boolean DEFAULT_LOAD_PREDEFINED_COLORS = true;

	/** 2D grid data for JGM. **/
	public int[][] gridData;
	/** The JGM itself **/
	public JGridMap jGridMap;
	protected boolean initialized = false;

	/**
	 * Constructor: full
	 * @param widthCells  - amount of cells, width
	 * @param heightCells - amount of cells , height
	 * @param widthPixel  - initial width in pixels (total)
	 * @param heightPixel - initial height in pixels (total)
	 */
	public GridModel(int widthCells, int heightCells, int widthPixel, int heightPixel){

		initJGridMap(widthCells, heightCells, widthPixel, heightPixel);
		initGridData(widthCells, heightCells);
		initialized = true;
	}
	/**
	 * Constructor with number of cells only.
	 * Uses DEFAULT_FIELD_SIZE.
	 * @param widthCells
	 * @param heightCells
	 */
	public GridModel(int widthCells, int heightCells){
		this(widthCells,heightCells, widthCells*DEFAULT_FIELD_SIZE,heightCells*DEFAULT_FIELD_SIZE);
	}
	/**
	 * Constructor: Empty, for testing etc.
	 * Uses default values
	 */
	public GridModel(){
		this(25,25, 25*DEFAULT_FIELD_SIZE,25*DEFAULT_FIELD_SIZE);
	}

	/**
	 * Constructor: Do not initialize anything in constructor.
	 * Note: initialized should be set to true manually.
	 * @param b - value dosn't matter
	 */
	public GridModel(boolean b) {
		// Do not do anything
	}
	
	/**
	 * Initialize with other parameters.
	 * 
	 * @param nrOfCellsWidth
	 * @param nrOfCellsHeight
	 * @param gridWidth
	 * @param gridHeight
	 */
	public void reInit(int nrOfCellsWidth, int nrOfCellsHeight, int gridWidth, int gridHeight){
		initJGridMap(nrOfCellsWidth, nrOfCellsHeight, gridWidth, gridHeight);
		initGridData(nrOfCellsWidth, nrOfCellsHeight);
	}
	
	/**
	 * Initialize the JGM with default settings.
	 * Use for re-initialization (1)
	 */
	protected void initJGridMap(int nrOfCellsWidth, int nrOfCellsHeight, int gridWidth, int gridHeight){

		// --- Initialize JGM: ---
		//
		if(!initialized){
			jGridMap = new JGridMap(gridWidth, gridHeight, nrOfCellsWidth, nrOfCellsHeight, DEFAULT_GRID_DEPTH);
		}
		else{
			jGridMap.reSize(gridWidth, gridHeight, nrOfCellsWidth, nrOfCellsHeight, DEFAULT_GRID_DEPTH);
		}

		// --- Configure Grid lines: --- 
		//
		if(DEFAULT_GRID_LINES){
			jGridMap.setGridColor(DEFAULT_GRID_LINE_COLOR);
			jGridMap.setGridLines(true);
		}
		
		// --- Configure scroll mode and bars: --- 
		//
		jGridMap.setScrollMode(DEFAULT_SCROLL_MODE);
		
		if(!DEFAULT_ENABLE_SCROLLBARS){
			jGridMap.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			jGridMap.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		}
		
		// --- Configure JGM resizing, if the window size changes: --- 
		//
		jGridMap.setResizeMode(DEFAULT_RESIZE_MODE);
		
		// --- Load predefined colors; --- 
		//
		if(DEFAULT_LOAD_PREDEFINED_COLORS)
			loadPreddefinedColors();
	}
	
	/**
	 * Initialize the grid data.
	 * Use for re-initialization (2)
	 */
	protected void initGridData(int nrOfCellsWidth, int nrOfCellsHeight){
		
		if(gridData==null){
			gridData = new int[nrOfCellsHeight][nrOfCellsWidth];
			//jGridMap.setDataDirect(this.gridData);	// JGM uses data stored here.
		}
		else{
			if(gridData.length!=nrOfCellsHeight || gridData[0].length!=nrOfCellsWidth){
				int[][] gridDataOld = gridData;
				gridData = new int[nrOfCellsHeight][nrOfCellsWidth];
				if(DEFAULT_COPY_DATA_AT_REINIT)
					copyData(gridDataOld, gridData);
			}
		}

		jGridMap.setDataDirect(this.gridData);	// JGM uses data stored here.
	}
	
	/**
	 * Copy a into b.
	 * @param a
	 * @param b
	 */
	private static void copyData(int[][] a, int [][]b){
		
		int leni = Math.min(a.length, b.length);
		
		for(int i=0; i<leni; i++){
			int lenj = Math.min(a[i].length, b[i].length);
			for(int j=0; j<lenj; j++){
				b[i][j] = a[i][j];
			}
		}
	}
	
	/**
	 * Predefined colors ready for use.
	 */
	private void loadPreddefinedColors(){
		
		addColor(PredefinedColor.BLACK, Color.BLACK);
		addColor(PredefinedColor.DARK_GRAY, Color.DARK_GRAY);
		addColor(PredefinedColor.GRAY, Color.GRAY);
		addColor(PredefinedColor.LIGHT_GRAY, Color.LIGHT_GRAY);
		addColor(PredefinedColor.WHITE, Color.WHITE);
		
		addColor(PredefinedColor.RED, Color.RED);
		addColor(PredefinedColor.GREEN, Color.GREEN);	
		addColor(PredefinedColor.BLUE, Color.BLUE);	
			
		addColor(PredefinedColor.ORANGE, Color.ORANGE);
		addColor(PredefinedColor.CYAN, Color.CYAN);	
		addColor(PredefinedColor.MAGENTA, Color.MAGENTA);	
		addColor(PredefinedColor.YELLOW, Color.YELLOW);	
		addColor(PredefinedColor.PINK, Color.PINK);	
	}
	
	/** add color to index enum.ordinal() **/
	private void addColor(PredefinedColor index, Color color){
		jGridMap.addColorToScale(index.ordinal(), color);
	}

}
