package examples.snake.model;

import java.util.HashMap;

import jGridMap.model.GridObject;

/**
 * The Snake implementation of the Grid Object.
 * Hold object specific data (Coordinates, Direction, Pictures) and functions (Getter for pictures).
 * 
 * @author Kristofer Schweiger
 */
public abstract class SnakeGridObject extends GridObject {
	
	public static final int	ERROR_PIC	= SnakeGridModel.PredefinedColor.RED.ordinal();
	public ObjectDirection direction = ObjectDirection.UP; //default
	
	/**
	 * Constructor with 2D position.
	 * @param x
	 * @param y
	 */
	public SnakeGridObject(int x, int y){
		
		this.y = y;
		this.x = x;
	}
	
	/**
	 * Put Object at a random position.
	 * @param yLen - length in y direction (uses 0..length-1)
	 * @param xLen - length in x direction
	 */
	public void randomPosition(int yLen, int xLen){
		
		y = RAND.nextInt(yLen);
		x = RAND.nextInt(xLen);
		//direction = ObjectDirection.random(RAND);
	}
	
	/** 
	 * Move to position AND direction of e2. 
	 * @param e2
	 */
	public void moveTo(SnakeGridObject e2) {
		y = e2.y;
		x = e2.x;
		direction = e2.direction;
	}
	
	/** 
	 * Move in direction d. 
	 * @param d
	 */
	public void moveIn(ObjectDirection d) {
		y += d.yDiff;
		x += d.xDiff;
	}
	
	/** 
	 * Move in direction. 
	 */
	public void move() {
		y += direction.yDiff;
		x += direction.xDiff;
	}
	
	/**
	 * @param go
	 * @return true if coordinates are equal
	 */
	public boolean equalPosition(GridObject go){
		return y==go.getY() && x==go.getX();
	}

	/**
	 * Puts object into the gridData.
	 * @param gridData
	 */
	public abstract void update(int[][] gridData);
	
	/**
	 * @param d - direction
	 * @param map - hashmap
	 * @return ID of found picture or 1
	 */
	protected static int getPic(ObjectDirection d, HashMap<ObjectDirection,Integer> map){
		
		int pic;
		
		Integer tmp = map.get(d);
		if(tmp!=null)
			pic = tmp;
		else
			pic = ERROR_PIC;
		
		return pic;
		
	}
	
	@Override
	public String toString(){
		return "["+x+", "+y+", "+direction+"]";
	}
	
}
