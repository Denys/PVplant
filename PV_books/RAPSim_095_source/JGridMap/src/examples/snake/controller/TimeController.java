package examples.snake.controller;

import java.util.LinkedList;

import jGridMap.view.PrimaryView;
import examples.snake.model.*;
import examples.snake.model.simulationObjects.*;

/**
 * Controls time and time related logic.
 * 
 * @author Kristofer Schweiger
 */
public class TimeController extends Thread {
	
	public static final int MOVE_TIME = 1000;	//ms, default time without speedup
	//public int autoGrow = -1;
	
	public enum SpeedEnum {
		Ultra_25(25), Ultra_15(15), Fast_11(11), NotBad_9(9), Normal_7(7),Normal_6(6), Slow_4(4);

		public int speed;
		SpeedEnum(int speed){
			this.speed = speed;
		}
	};

	public boolean doRun=true;
	protected int actualMoveTime;
	protected int count=0;
	private boolean pause = false;
	
	private SnakeGridModel model;
	@SuppressWarnings("unused")
	private PrimaryView view;
	private PrimarySnakeController controller;
	
	/**
	 * Constructor: full
	 * @param speedUp - used to modify move time. >0, <=MoveTime
	 * @param model
	 * @param view
	 */
	public TimeController(PrimarySnakeController controller){
		
		this.controller = controller;
		this.model = controller.model;
		this.view = controller.view;
		
		changeSpeed(model.speedEnum.speed);
		
		//controller.setTimeController(this);
		this.setDaemon(true);
		this.start();
	}
	
	public void changeSpeed(int speed){
		this.actualMoveTime = MOVE_TIME/speed;
	}
	
	
	/**
	 * Primary function
	 */
	public void run(){
		
		model.updateJGM(false);
		
		while(doRun){
			
			count++;
			sleepAndMove();
			model.jGridMap.paintBoard.repaint();
		}
		controller.endOfGame();
	}
	
	/**
	 * For waiting if in pause-mode.
	 */
	private synchronized void handlePause(){
		while(pause){
			try {
				this.wait();
			} catch (InterruptedException e) {
				//e.printStackTrace();
			}
		}
	}
	
	/**
	 * Switches pause-variable
	 */
	public synchronized void pause(boolean b){
		pause = b;
		this.notify();
	}
	
	/**
	 * Switches pause-variable
	 */
	public synchronized void togglePause(){
		pause(!pause);
	}
	
	/**
	 * Switches pause-variable
	 */
	public synchronized boolean getPauseStatus(){
		return pause;
	}
	

	/**
	 * @param count
	 * @return
	 */
	private void sleepAndMove(){
		
		Snake snake = model.snake;
		int autoGrow = model.autoGrow;
		
		
		if(autoGrow>0 && count%autoGrow==0){	// snake can grow without food
			snake.grow(1);											// - 
			increasePointsAutoGrow();
		}
		
		sleep(actualMoveTime);								// normal sleep between moves
		controller.applyKeys();								// apply pressed keys (not only just typed)
		
		handlePause();												// handle pause here for better response.
		
		boolean willDie = anticipateHit();									// intelligent snake anticipates hits and slows down.
		if(willDie){																				// -
			System.out.println(">> Snake anticipates hit!");	// -
			sleep((int)(actualMoveTime/2.0f)+10);							// -
			
			controller.applyKeys(model.snake.nextDirection);				// -
			//sleep(2000);							// TODO
		}
		
		boolean hit = snake.moveSnake(model.gridData);			// snake sees if it hits "something"
		if(hit){
			handleHit();																			// handle hit with "something"
		}
		
	}
	
	/**
	 * @return true it snake will hit something bad.
	 */
	private boolean anticipateHit(){
		Snake snake = model.snake;
		
		SimpleGridObject simple = new SimpleGridObject(snake);	// "Copy" snake head
		simple.direction = snake.nextDirection;									// Use next direction!!
		simple.move();
		
		LinkedList<SnakeGridObject> list = model.getObjectsAt(simple);	// Get colliding objects
		
		if(!list.isEmpty()){
			SnakeGridObject hitObject = list.getFirst();
			System.out.println(">> Hit Object: "+hitObject + ", Snake ="+snake);	// -
			if(hitObject instanceof CollusionGridObject)
				return true;
		}
		
		return false;
	}
	
	/**
	 * Handle snake hitting an object.
	 */
	private void handleHit(){
		
		//System.out.println("> Hit!");
		Snake snake = model.snake;
		boolean doDie;
		
		SnakeGridObject hitObject = model.getObjectsAt(snake).getFirst();
		
		if(hitObject instanceof EatableGridObject){
			System.out.println(">> Hit bug");
			model.removeGridObject(hitObject);
			snake.grow(1);
			rePlace(hitObject);
			
			increasePoints();
			doDie = false;
		}
		else if(hitObject instanceof Wall){
			System.out.println(">> Hit wall");
			doDie = true;
		}
		else {
			System.out.println(">> Hit Tail");
			doDie = true;
		}
		
		liveOrDie(doDie);
	}
	
	/**
	 * Handle player points
	 */
	private void increasePoints(){
		
		model.playerBugs += 1;
		float factor = model.speedEnum.speed;
		model.playerPoints += 1.0*factor;
		
		controller.repaintInfo();
	}
	
	/**
	 * Handle player points
	 */
	private void increasePointsAutoGrow(){
		
		float factor = model.speedEnum.speed / 2f;
		model.playerPoints += 1.0*factor;
		
		controller.repaintInfo();
	}
	
	/**
	 * Let snake live or die.
	 * Boolean for extended actions (maybe used later) and lets programmer never forget to call it at all.
	 */
	private void liveOrDie(boolean doDie){
		
		//System.out.println("Die:"+doDie + ", willDie="+willDie);
		if(!doDie){			// --- live ---
			
			//System.out.println(">> Saved");
		}
		else{						// --- die ---
			model.snake.dead = true;
			model.snake.update(model.gridData);
			this.doRun = false;
		}
	}

	
	/**	
	 * Place the object somewhere in the model again.
	 * @param hitObject
	 */
	private void rePlace(SnakeGridObject hitObject) {

		int yLen=model.gridData.length, xLen=model.gridData[0].length;
		do{
			hitObject.randomPosition(yLen, xLen);
		} 
		while(!model.tryToaddGridObject(hitObject));
	}
	
	/**
	 * Sleep function handling integer times and times below 1.
	 * @param t [ms]
	 */
	private void sleep(int t){
		
		if(t<1)
			return;
		
		try {
			super.sleep(t);
		} 
		catch (InterruptedException e) {
			System.out.println(e.toString());
		}
	}
	
	
	
}
