package examples.snake.model.simulationObjects;

import examples.snake.model.SnakeGridObject;

/**
 * A simple implementation of the SnakeGridObject.
 * Can be used for future movement calculation.
 * 
 * @author Kristofer Schweiger
 */
public class SimpleGridObject extends SnakeGridObject {

	
	public SimpleGridObject(SnakeGridObject sgo) {
		super(sgo.getX(), sgo.getY());
		this.direction = sgo.direction;
	}

	@Override
	public void update(int[][] gridData) {
		// do not draw
	}
	
}
