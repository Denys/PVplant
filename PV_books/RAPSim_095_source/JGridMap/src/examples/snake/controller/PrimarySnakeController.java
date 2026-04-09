package examples.snake.controller;

import jGridMap.view.PrimaryView;

import java.awt.BorderLayout;
import java.awt.KeyboardFocusManager;
import java.io.IOException;

import javax.swing.JOptionPane;

import examples.snake.controller.TimeController.SpeedEnum;
import examples.snake.model.ObjectDirection;
import examples.snake.model.SnakeGridModel;
import examples.snake.model.SnakeLevel;
import examples.snake.model.SnakeLevel.LevelEnum;
import examples.snake.view.Design;
import examples.snake.view.Design.DesignEnum;
import examples.snake.view.TopToolBar;

/**
 * Initialization and primary logic of the game.
 * Also provides important functions used by other controllers and controls in view.
 * 
 * @author Kristofer Schweiger
 */
public class PrimarySnakeController {

	private static final int	AutoGrowTime	= 15;
	protected SnakeGridModel model;
	protected PrimaryView view;
	private TopToolBar topToolBar;
	
	private SnakeKeyEventDispatcher keyListener;

	private TimeController timeController;
	
	/**
	 * Constructor
	 * @param model
	 * @param view
	 * @throws IOException 
	 */
	public PrimarySnakeController() throws IOException {
		
		// --- Model ---
		//
		SnakeLevel lv = SnakeLevel.fromFile(LevelEnum.values()[0]);
		model = new SnakeGridModel(lv);
		
		// --- View ---
		//
		view = new PrimaryView("Snake", model);
		topToolBar = new TopToolBar(model, this);
		view.setJComponent(topToolBar, BorderLayout.PAGE_START);
		
		// --- Controller stuff ---
		//
		keyListener = new SnakeKeyEventDispatcher(this);
    KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
    manager.addKeyEventDispatcher(keyListener);
		
		Design.changeDesign(model);		// default design
		
		// --- start GUI ---
		//
		model.updateJGM(false);
		//view.pack();	// packs automatically if size is zero
		view.setVisible(true);
	}
	
	/**
	 * Start the game.
	 */
	public void start() {
		
		if(timeController==null){
			topToolBar.cPanel.startStop(true);
			keyListener.resetKeys();
			startTime();
		}
	}
	/**
	 * Stop the game.
	 */
	public void stop() {
		
		if(timeController!=null){
			stopTime();																	// stop time if game is running.
		}
		else{
			topToolBar.cPanel.startStop(false);
			this.changeLevel(model.level.levelEnum);		// easy way: reload level.
		}
	}
	
	/**
	 * The game has ended...
	 */
	public void endOfGame(){
		timeController = null;
	}
	
	/**
	 * Stops the time and the game.
	 */
	private void stopTime(){
		
		if(timeController==null)
			return;

		timeController.doRun=false;
		timeController.pause(false);
		timeController.interrupt();

		while(timeController != null){
			try {Thread.sleep(40);} catch (InterruptedException e) {}
		}
		//timeController = null;
	}
	/**
	 * starts the time and the game.
	 */
	private void startTime(){
		stopTime();
		timeController = new TimeController(this);
	}
	
	/**
	 * Toggle pause mode.
	 */
	public void togglePause(){
		if(timeController!=null){
			timeController.togglePause();
		}
	}
	
	/**
	 * Repaint information.
	 */
	public void repaintInfo(){
		topToolBar.iPanel.repaintInfo();
	}

	/**
	 * Apply keys from user.
	 */
	public void applyKeys() {
		keyListener.applyKeys();
	}
	
	public void applyKeys(ObjectDirection excludeDirection) {
		keyListener.applyKeys(excludeDirection);
	}

	/**
	 * Auto grow feature for extra points and faster game.
	 * @param b
	 */
	public void toggleAutoGrow(boolean b) {
		
		if(b)
			model.autoGrow = AutoGrowTime;
		else
			model.autoGrow = -1;
	}

	/**
	 * Load a level. 
	 * Can also be used to start a new game.
	 * @param levelEnum
	 */
	public void changeLevel(LevelEnum levelEnum) {
		
		stopTime();
		SnakeLevel lv=null;
		try {
			lv = SnakeLevel.fromFile(levelEnum);
			model.useLevel(lv);
			repaintInfo();
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.toString(), "Error loading level", JOptionPane.OK_OPTION);
		}
		model.updateJGM(true);
	}

	/**
	 * Change the speed of the snake.
	 * @param speedEnum
	 */
	public void changeSpeed(SpeedEnum speedEnum) {
		
		if(model!=null){
			model.speedEnum = speedEnum;
			topToolBar.cPanel.speedComboBox.setSelectedItem(speedEnum);
		}
		
		if(timeController!=null){
			timeController.changeSpeed(speedEnum.speed);
		}
		
	}

	/**
	 * Change the game design.
	 * @param designEnum
	 */
	public void changeDesign(DesignEnum designEnum) {
		
		if(designEnum==model.designEnum)
			return;
	
		boolean tmp = true;							// pause Game while design change
		if(timeController!=null){
			tmp = timeController.getPauseStatus();
			timeController.pause(true);
		}

		model.designEnum = designEnum;	// change design
		Design.changeDesign(model);
		model.updateJGM(false);
		
		if(timeController!=null){				// restore pause state after design change
			timeController.pause(tmp);
		}
	}

}
