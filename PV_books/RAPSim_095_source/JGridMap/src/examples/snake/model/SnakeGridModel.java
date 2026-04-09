package examples.snake.model;

import jGridMap.JGridMap;
import jGridMap.JGridMap.AutomaticResizeMode;
import jGridMap.model.GridModel;

import java.awt.Dimension;
import java.util.LinkedList;

import examples.snake.controller.TimeController.SpeedEnum;
import examples.snake.model.simulationObjects.Snake;
import examples.snake.view.Design.DesignEnum;

/**
 * The grid model used by the Snake implementation.
 * Holds most of the important data.
 * 
 * @author Kristofer Schweiger
 */
public class SnakeGridModel extends GridModel {
	
	/** adjust default values **/
	static{
		SnakeGridModel.DEFAULT_SCROLL_MODE = JGridMap.ZoomScrollMode.NoScroll;
		SnakeGridModel.DEFAULT_RESIZE_MODE = AutomaticResizeMode.AutomaticResize;
		SnakeGridModel.DEFAULT_ENABLE_SCROLLBARS = false;
	}
	/** size of a field in pixel **/
	public static int FIELD_SIZE = 20;
	public Snake snake;
	public float playerPoints;
	public int playerBugs;
	public SnakeLevel level;
	public int autoGrow = -1;
	public SpeedEnum speedEnum = SpeedEnum.Normal_6;
  public DesignEnum designEnum = DesignEnum.Normal;
	
	public LinkedList<SnakeGridObject> gridObjectList; // = new LinkedList<SnakeGridObject>();	
	
	/**
	 * Constructor using default values
	 */
	public SnakeGridModel(SnakeLevel lv){
		
		super(false);
		useLevel(lv);
		super.initialized = true;
	}
	
	/**
	 * Use this level data for initialization or re-initialization.
	 * @param lv
	 */
	public void useLevel(SnakeLevel lv){
		this.level = lv;
		playerPoints = 0;
		playerBugs = 0;
		
		if(!initialized){
			initJGridMap(lv.width, lv.height, FIELD_SIZE*lv.width, FIELD_SIZE*lv.height);
			initGridData(lv.width, lv.height);
		}
		else{
			Dimension size = jGridMap.paintBoard.getSize();
			initJGridMap(lv.width, lv.height, size.width, size.height);
			initGridData(lv.width, lv.height);
		}

		gridObjectList = lv.gridObjectList;
		snake = new Snake(lv.width/2, lv.height/2, 3, this);
		gridObjectList.add(snake);
	}
	
	/**
	 * Add an object to model (for drawing and more)
	 * @param sgo
	 */
	public void addGridObject(SnakeGridObject sgo){
		gridObjectList.addFirst(sgo);
	}
	/**
	 * Add an object to model, if its position is still empty (for drawing and more)
	 * @param sgo
	 * @return true if object was added
	 */
	public boolean tryToaddGridObject(SnakeGridObject sgo){
		
		for(SnakeGridObject sgo2 : gridObjectList){
			if(sgo.equalPosition(sgo2)){
				return false;
			}
		}
		
		gridObjectList.addFirst(sgo);
		sgo.update(gridData);
		return true;
	}
	/**
	 * Add an object to model (for drawing and more)
	 * @param sgo
	 */
	public void removeGridObject(SnakeGridObject sgo){
		gridObjectList.remove(sgo);
	}
	
	/**
	 * Total redraw
	 */
	public void updateJGM(boolean full){
		// gridData -> reset?
		// set values from registered objects?
		
		if(full)
		for(int i=0; i<gridData.length; i++){				// reset data
			for(int j=0; j<gridData[i].length; j++){
				gridData[i][j] = 0;
			}
		}
		
		for(SnakeGridObject sgo : gridObjectList){	// draw data
			sgo.update(gridData);
		}

		//jGridMap.setData(gridData);
		jGridMap.paintBoard.repaint();	// repaint data
	}

	public enum PredefinedColor{
		EMPTY, BLACK, DARK_GRAY, GRAY, LIGHT_GRAY, WHITE, RED, ORANGE, GREEN, BLUE, CYAN, MAGENTA, YELLOW, PINK
	}
	
	/**
	 * @param sgo
	 * @return other objects at same position. (normally only 0 or 1 objects)
	 */
	public LinkedList<SnakeGridObject> getObjectsAt(SnakeGridObject sgo) {
		
		LinkedList<SnakeGridObject> list = new LinkedList<SnakeGridObject>();	
		
		for(SnakeGridObject sgo2 : gridObjectList){
			
			if(sgo2.getY()==sgo.getY() && sgo2.getX()==sgo.getX() && sgo2!=sgo){
				
				list.add(sgo2);
			}
		}
		
		return list;
	}
	
}
