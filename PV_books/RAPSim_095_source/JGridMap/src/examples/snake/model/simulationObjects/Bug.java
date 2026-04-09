package examples.snake.model.simulationObjects;

import java.util.HashMap;

import examples.snake.model.ObjectDirection;

/**
 * The Bug-Object.
 * The snake loves to eat bugs...
 * 
 * @author Kristofer Schweiger
 */
public class Bug extends EatableGridObject {
	
	public static HashMap<ObjectDirection,Integer> pictures = new HashMap<ObjectDirection,Integer>();
	
	public Bug(int x, int y){
		
		super(x,y);
	}

	@Override
	public void update(int[][] gridData) {
		//gridData[x][y] = 5;
		gridData[y][x] = getPic(direction, pictures);	// "draw" in map
	}
}
