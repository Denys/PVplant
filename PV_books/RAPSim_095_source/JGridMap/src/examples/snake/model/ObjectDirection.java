package examples.snake.model;

import java.awt.event.KeyEvent;
import java.util.Random;

/**
 * Possible Directions in game and useful functions.
 * 
 * @author Kristofer Schweiger
 */
public enum ObjectDirection {
	LEFT(-1,0),
	UP(0,-1),
	RIGHT(1,0),
	DOWN(0,1);
	
	public int yDiff, xDiff;
	
	/**
	 * Constructor with move differences in grid.
	 * @param xDiff
	 * @param yDIff
	 */
	ObjectDirection(int xDiff, int yDiff){
		this.yDiff = yDiff;
		this.xDiff = xDiff;
	}
	
	/**
	 * @return values().length
	 */
	public static int length(){
		return ObjectDirection.values().length;
	}
	
	/**
	 * @return this Direction turned to the right
	 */
	public ObjectDirection turnRight(){
		int i = this.ordinal();
		int len = length();
		return ObjectDirection.values()[ (i+1)%len ];
	}
	
	/**
	 * @return this Direction turned to the left
	 */
	public ObjectDirection turnLeft(){
		int i = this.ordinal();
		int len = length();
		return ObjectDirection.values()[ (i-1+len)%len ];
	}
	
	/**
	 * Accepts direction keys and "ASDW"
	 * @param e
	 * @return corresponding DIRECTION or null
	 */
	public static ObjectDirection fromKeyEvent(int keyCode){
		
		switch(keyCode){
		
		case KeyEvent.VK_LEFT: 	
		case KeyEvent.VK_A: 	
			return ObjectDirection.LEFT;
			
		case KeyEvent.VK_UP: 	
		case KeyEvent.VK_W: 	
			return ObjectDirection.UP;
		
		case KeyEvent.VK_RIGHT: 
		case KeyEvent.VK_D: 	
			return ObjectDirection.RIGHT;
		
		case KeyEvent.VK_DOWN: 	
		case KeyEvent.VK_S: 	
			return ObjectDirection.DOWN;
		
		default: 								
			return null;
		}
		
	}

	/**
	 * @param rand
	 * @return a random direction.
	 */
	public static ObjectDirection random(Random rand) {
		int i = rand.nextInt(ObjectDirection.length());
		return ObjectDirection.values()[i];
	}
	
}
