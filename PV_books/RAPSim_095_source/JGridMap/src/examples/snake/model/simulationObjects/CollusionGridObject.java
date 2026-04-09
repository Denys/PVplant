package examples.snake.model.simulationObjects;

import examples.snake.model.SnakeGridObject;

/**
 * Superclass of objects that can kill the snake at a collision.
 * 
 * @author Kristofer Schweiger
 */
public abstract class CollusionGridObject extends SnakeGridObject {

	public CollusionGridObject(int x, int y) {
		super(x, y);
	}

}
