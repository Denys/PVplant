package examplesOld;

import jGridMap.JGridMap;

import java.applet.Applet;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;


public class appletTest extends Applet {
	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;
	JGridMap w;
	final int COLS = 10;
	final int ROWS = 10;
	int[][] d;
	
	public void init() {
  	w = new JGridMap(600, 600, COLS, ROWS, 1);
  	setLayout(new FlowLayout(10));
  	add(w);
  	d = new int[COLS][ROWS];

		for (int r = 0; r < ROWS; r++) 
			for (int c = 0; c < COLS; c++) 
				d[r][c] = (int)(Math.random()*1.2);
		w.addColorToScale(1, Color.black);
		w.addColorToScale(2, Color.GREEN);
		w.setData(d);
  }
	
  // This method is mandatory, but can be empty.(i.e.,have no actual code).
  public void stop() { }
 
  // Print a message on the screen (x=20, y=10).
  public void paint(Graphics g) {
  	w.repaint();
  }
}
