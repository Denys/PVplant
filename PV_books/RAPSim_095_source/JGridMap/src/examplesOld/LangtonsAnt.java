package examplesOld;

import jGridMap.JGridMap;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;

/**
 * 
 * @author
 */
public class LangtonsAnt extends Applet implements ActionListener {
	private static final long	serialVersionUID	= 1L;

	Button										restartBt, slowBt, fastBt, reverseBt;
	double										targetIteration		= 0.0;
	double										speed							= 1000.01;
	double										scounter					= 0.0;

	int												iteration					= 1;
	private int								width							= 176;
	private int								height						= 176;
	boolean										turnback					= false;
	boolean										reverse						= false;

	int												direction					= 0;
	int												dx[]							= { 0, 1, 0, -1 };
	int												dy[]							= { -1, 0, 1, 0 };

	JGridMap									gridMap;
	private int								d[][];
	private int								x;
	private int								y;

	public void init() {
		gridMap = new JGridMap(width * 6, height * 6, width, height, 1);
		gridMap.setGridLines(true);
		gridMap.setGridColor(Color.LIGHT_GRAY);
		setLayout(new FlowLayout(10));

		restartBt = new Button("restart");
		slowBt = new Button("slower");
		fastBt = new Button("faster");
		reverseBt = new Button("reverse");
		add(restartBt);
		add(slowBt);
		add(fastBt);
		add(reverseBt);

		restartBt.addActionListener(this);
		slowBt.addActionListener(this);
		fastBt.addActionListener(this);
		reverseBt.addActionListener(this);

		add(gridMap);

		gridMap.addColorToScale(1, Color.black);
		gridMap.addColorToScale(2, Color.GREEN);
		gridMap.addColorToScale(3, Color.CYAN);

		initDataSet(width, height);
		gridMap.paintBoard.repaint();

		Timer timer = new Timer();
		timer.schedule((TimerTask) new Task(), 100, 1);
	}

	class Task extends TimerTask {

		public void run() {
			scounter +=speed;
			if (scounter<1.0) return;
			
			if (reverse) {
				targetIteration = iteration - scounter;
				while (iteration > targetIteration) {
					if (iteration <= 0 && !turnback)	break;
					if (!reverse) break;
					iterate();
				}
			} else { // forward mode
				targetIteration = iteration+ scounter;
				while (iteration < targetIteration) {
					if (iteration > 11100 && !turnback) break;
					if (reverse) break;
					iterate();
				}
			}
			scounter-=(int)scounter;
			repaint();
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == restartBt) {
			iteration = 1;
			targetIteration = 0.0;
			initDataSet(width, height);
			gridMap.setData(d);
			reverse = false;
		}
		if (e.getSource() == reverseBt) {
			turnback = true;
		}

		if (e.getSource() == slowBt) {
			speed /= 1.5;
		}
		if (e.getSource() == fastBt) {
			speed *= 1.5;
		}
	}

	// This method is mandatory, but can be empty.(i.e.,have no actual code).
	public void stop() {}

//	// double buffering
//	public void update(Graphics g) {
//		Graphics2D g2d = (Graphics2D) g;
//		Graphics2D offgc;
//		Image offscreen = null;
//		Rectangle box = g2d.getClipBounds();
//
//		// create the offscreen buffer and associated Graphics
//		offscreen = createImage(box.width, box.height);
//		offgc = (Graphics2D) offscreen.getGraphics();
//		// clear the exposed area
//		offgc.setColor(getBackground());
//		offgc.fillRect(0, 0, box.width, box.height);
//		offgc.setColor(getForeground());
//		// do normal redraw
//		offgc.translate(-box.x, -box.y);
//		paint(offgc);
//		// transfer offscreen to window
//		g2d.drawImage(offscreen, box.x, box.y, this);
//	}

	// Print a message on the screen (x=20, y=10).
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawString("Iteration:" + iteration, 400, 25);
	}

	public void runSimulaton(int steps) {
		targetIteration = iteration + steps;

		gridMap = new JGridMap(760, 760, width, height, 1);
		gridMap.addColorToScale(1, Color.BLACK);
		gridMap.addColorToScale(2, Color.GREEN);
		gridMap.addColorToScale(3, Color.CYAN);

		initDataSet(width, height);

		JFrame frame = new JFrame();
		frame.setBounds(0, 0, 840, 865);
		frame.add(gridMap);
		frame.setVisible(true);

		for (int i = 0; i < targetIteration; i++) {
			iterate();
			gridMap.paintBoard.repaint();
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		while (true)
			;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LangtonsAnt l = new LangtonsAnt();
		l.runSimulaton(11500);
	}

	private void initDataSet(int width, int height) {
		d = new int[width][height];
		x = width / 2;
		y = width / 2;
		direction = 0;
		d[x][y] |= 2;
	}

	private void iterate() {
		int columns = d.length;
		int rows = d[0].length;

		d[x][y] &= 0x01; // mask out ant
		// toggle cell where ant is currently standing
		d[x][y] = 1 - d[x][y];

		// update cell
		gridMap.setData(x, y, d[x][y]);

		x = (x + dx[direction] + columns) % columns;
		y = (y + dy[direction] + rows) % rows;

		if (turnback) {
			reverse = !reverse;
			direction = (direction + 2) % 4;
			turnback = false;
			d[x][y] = 1 - d[x][y];
			gridMap.setData(x, y, d[x][y]);
			return;
		}

		// change direction
		direction = (direction + 1 - 2 * d[x][y] + 4) % 4;

		// draw ant
		d[x][y] |= 2;

		// update JGridMap
		gridMap.setData(x, y, d[x][y]);

		iteration += reverse ? -1 : 1;
	}
}