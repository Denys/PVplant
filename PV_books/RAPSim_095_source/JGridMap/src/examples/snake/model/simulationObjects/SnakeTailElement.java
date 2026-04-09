package examples.snake.model.simulationObjects;

import java.util.HashMap;

import examples.snake.model.ObjectDirection;

/**
 * A normal element in the snake tail.
 * 
 * @author Kristofer Schweiger
 */
public class SnakeTailElement extends CollusionGridObject{

	public static HashMap<ObjectDirection,Integer> pictures = new HashMap<ObjectDirection,Integer>();
	
	SnakeTailElement(int x, int y){
		super(x,y);
		direction = ObjectDirection.RIGHT;
	}//class TailElement

	@Override
	public void update(int[][] gridData) {

		//gridData[x][y] = 2;
		gridData[y][x] = getPic(direction, pictures);
	}

}