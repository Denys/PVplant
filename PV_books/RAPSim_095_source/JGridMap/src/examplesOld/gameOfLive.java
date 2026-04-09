package examplesOld;

import jGridMap.SimpleDisplay;
import jGridMap.JGridMap;
import jGridMap.util.NESRandom;

import java.awt.Color;
import java.util.Random;


/**
 * 
 * @author 
 */
public class gameOfLive {

		private final Random rand = new NESRandom();
    private boolean init = true;
    private int width = 400;
    private int height = 400;
    int[][][] values = new int[2][][];

    /**
     * @param args
     */
    public static void main(String[] args) {
        int iterations = 3000;
        long starttime, endtime;
        gameOfLive g = new gameOfLive();
        JGridMap w = new JGridMap(800, 800, g.width, g.height, 1);
        SimpleDisplay d = new SimpleDisplay("Game Of Life");
        d.add(w);
        d.setVisible(true);
        w.addColorToScale(1, Color.black);
        starttime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            g.createDataSet();
            w.setData(g.values[0]);
            w.paintBoard.repaint();
        }
        endtime = System.nanoTime();
        System.out.println("Total Runtime:  " + (endtime - starttime) / 1000000 + "ms");
        System.out.println("Time/Iteration: " + (endtime - starttime) / iterations + "ns");
        
        try { Thread.sleep(5000); } catch (InterruptedException e) {}
        System.exit(0);
    }

    private void createDataSet() {
        values[1] = values[0];
        if (init) {
            values[0] = createInitialData(height, width);
            init = false;
        } else {
            values[0] = createData(width, height, values[1]);
        }
    }
    
    private int[][] createInitialData(int height, int width) {
        int[][] d = new int[height][width];
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                d[y][x] = rand.nextBoolean() ? 1 : 0;
            }
        }
        return d;
    }

    private int livingNeighbours(int y, int x, int[][] oldData) {
        int number = 0;
        int rows = oldData.length;
        int columns = oldData[y].length;
        number = (x > 0 && y > 0 ? oldData[y - 1][x - 1] : 0)
                + (y > 0 ? oldData[y - 1][x] : 0)
                + (x < columns - 1 && y > 0 ? oldData[y - 1][x + 1] : 0)
                + (x < columns - 1 ? oldData[y][x + 1] : 0)
                + (x < columns - 1 && y < rows - 1 ? oldData[y + 1][x + 1] : 0)
                + (y < rows - 1 ? oldData[y + 1][x] : 0)
                + (x > 0 && y < rows - 1 ? oldData[y + 1][x - 1] : 0) + (x > 0 ? oldData[y][x - 1]
                : 0);
        return number;
    }

    private int[][] createData(int width, int height, int[][] oldData) {
        int[][] data = new int[height][width];
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int n = livingNeighbours(y, x, oldData);
                if (n == 3) {
                    data[y][x] = 1;
                } else if (n == 2 && oldData[y][x] == 1) {
                    data[y][x] = 1;
                } else {
                    data[y][x] = 0;
                }
            }
        }
        return data;
    }
}
