package examples.snake.model.simulationObjects;

import java.util.HashMap;

import examples.snake.model.ObjectDirection;

/**
 * The last element of the snake tail.
 * 
 * @author Kristofer Schweiger
 */
public class SnakeFinalTailElement extends SnakeTailElement{

	public static HashMap<ObjectDirection,Integer> pictures = new HashMap<ObjectDirection,Integer>();
	
	SnakeFinalTailElement(int x, int y){
		super(x,y);
		direction = ObjectDirection.RIGHT;
	}//class TailElement
	
	@Override
	public void update(int[][] gridData) {
		
		//gridData[x][y] = 3;
		gridData[y][x] = getPic(direction, pictures);
	}
}