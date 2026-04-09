package examples.snake.model.simulationObjects;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import examples.snake.model.ObjectDirection;
import examples.snake.model.SnakeGridModel;

import static examples.snake.model.ObjectDirection.*;

/**
 * This class represents the snake in the game.
 * 
 * @author Kristofer Schweiger
 */
public class Snake extends CollusionGridObject {

	public static HashMap<ObjectDirection,Integer> pictures = new HashMap<ObjectDirection,Integer>();
	public static HashMap<ObjectDirection,Integer> deadPictures = new HashMap<ObjectDirection,Integer>();

	/** inverted list of tail elements **/
	private LinkedList<SnakeTailElement> tail = new LinkedList<SnakeTailElement>();
	private int	grow = 0;
	public boolean dead = false;
	public ObjectDirection nextDirection;
	
	private SnakeGridModel model;
	

	/**
	 * Constructor
	 * @param x
	 * @param y
	 * @param length - total start length of the snake.
	 */
	public Snake(int x, int y, int length, SnakeGridModel model){
		
		super(x,y);
		this.nextDirection = direction = RIGHT;		// default snake direction.
		this.model = model;
		
		for(int i=1; i<length; i++){
			SnakeTailElement tmp;
			
			if(i<length-1)
				tmp = new SnakeTailElement(x-i, y);
			else
				tmp = new SnakeFinalTailElement(x-i, y);
			
			tail.addFirst(tmp);							// add to snake
			model.addGridObject(tmp);				// add for draw
		}
		
	}
	
	/**
	 * @return total length. Head + Tail size.
	 */
	public int length(){
		return 1+tail.size();
	}
	
	/**
	 * @param d2
	 * @return true if next direction was changed.
	 */
	public synchronized boolean changeDirection(ObjectDirection d2){
		
		ObjectDirection turnR = direction.turnRight();
		ObjectDirection turnL = direction.turnLeft();
		
		if(d2==turnR || d2==turnL){			//TODO: current?? (for anticipate hit)
			nextDirection = d2; 
			return true;
		}
		return false;
	}
	
	/**
	 * Move 1 field in direction.
	 * @return true if hit something
	 */
	public synchronized boolean moveSnake(int[][] gridData){
		
		SnakeTailElement e1;
		direction = nextDirection;
		
		// --- do grow ---
		if(grow>0){
			grow--;
			//tail.removeLast();					// remove head -> NOT IN THERE
			e1 = new SnakeTailElement(y, x);		// make new element
			
			//e1.moveTo(this);						// move to head position
			tail.addLast(e1);							// 
			model.addGridObject(e1);			// add for draw
			//tail.addLast(this);
		}
		// --- normal move ---
		else{
			gridData[tail.getFirst().getY()][tail.getFirst().getX()] = 0;		// delete last field
			Iterator<SnakeTailElement> it = tail.iterator();
			e1 = it.next();
			while(it.hasNext()){
				
				SnakeTailElement e2 = it.next();
				
				//if(!e1.equalPosition(e2))
				e1.moveTo(e2);
				
				e1.update(gridData);
				e1=e2;
			}
		}
		
		e1.moveTo(this);						// move to head position
		e1.update(gridData);
		
		this.moveIn(direction);			// move head
		modXY(gridData);						// move above edges
		boolean hit = gridData[y][x]!=0;
		this.update(gridData);
		
		return hit;
	}
	
	/**
	 * Let snake grow.
	 * @param add
	 */
	public void grow(int add){
		this.grow  += add;
	}
	
	@Override
	public void update(int[][] gridData) {
		if(!dead)
			gridData[y][x] = getPic(direction, pictures);	// "draw" head in map
		else
			gridData[y][x] = getPic(direction, deadPictures);	// "draw" head in map
	}
	
	/**
	 * Move above edges
	 * @param gridData
	 */
	private void modXY(int[][] gridData){
		
		int yLen = gridData.length;
		int xLen = gridData[0].length;
		
		if(y<0) 
			y+=yLen;
		else if(y>=yLen) 
			y-=yLen;
		
		if(x<0) 
			x+=xLen;
		else if(x>=xLen) 
			x-=xLen;
		
	}
}

