package examples.snake.model.simulationObjects;

import examples.snake.model.SnakeGridObject;

/**
 * Superclass of objects which can be eaten by the snake.
 * 
 * @author Kristofer Schweiger
 */
public abstract class EatableGridObject extends SnakeGridObject {

	public EatableGridObject(int x, int y) {
		super(x, y);
	}

}
