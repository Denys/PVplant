package examples.snake.model.simulationObjects;

import java.util.HashMap;

import examples.snake.model.ObjectDirection;

/**
 * A wall which will kill the snake if it is hit.
 * 
 * @author Kristofer Schweiger
 */
public class Wall extends CollusionGridObject {
	
	public static HashMap<ObjectDirection,Integer> pictures = new HashMap<ObjectDirection,Integer>();
	
	public Wall(int x, int y){
		
		super(x,y);
	}

	@Override
	public void update(int[][] gridData) {
		//gridData[x][y] = 6;
		gridData[y][x] = getPic(direction, pictures);	// "draw" in map
	}
}
