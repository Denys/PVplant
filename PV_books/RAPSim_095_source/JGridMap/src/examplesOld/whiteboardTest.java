package examplesOld;

import jGridMap.SimpleDisplay;
import jGridMap.JGridMap;

import java.awt.Color;

public class whiteboardTest {

	final static int	width	= 100;
	final static int	height	= 80;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JGridMap w = new JGridMap(800, 800, width, height, 1);
		SimpleDisplay display = new SimpleDisplay("Whiteboard Test");
		display.add(w);
		display.setVisible(true);
		w.addColorToScale(1, Color.black);
		w.addColorToScale(2, Color.GREEN);

		int[][] data = new int[height][width];
		// init with random values
		for (int y = 0; y < height; y++)
			for (int x = 0; x < width; x++)
				data[y][x] = (int) (Math.random() * 2);

		while (true) {
			for (int y = 0; y < height; y++)
				for (int x = 0; x < width; x++) {
					if (data[y][x] == 0)
						continue;
					// find a random neighbour
					int y1 = (y + 1 - 2 * (int) Math.round(Math.random()) + height) % height;
					int x1 = (x + 1 - 2 * (int) Math.round(Math.random()) + width) % width;
					// switch places
					int h = data[y1][x1];
					data[y1][x1] = data[y][x];
					data[y][x] = h;
				}
			w.setData(data);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// w.setVisible(true);
			w.paintBoard.repaint();
			//w.paintBoard.paint(w.paintBoard.getGraphics());
			//w.paintBoard.update(w.paintBoard.getGraphics());
		}

	}

}
