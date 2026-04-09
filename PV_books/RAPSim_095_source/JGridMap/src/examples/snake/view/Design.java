package examples.snake.view;


import static examples.snake.model.SnakeGridModel.PredefinedColor.BLACK;
import static examples.snake.model.SnakeGridModel.PredefinedColor.GRAY;
import static examples.snake.model.SnakeGridModel.PredefinedColor.ORANGE;
import static examples.snake.model.SnakeGridModel.PredefinedColor.RED;
import examples.snake.model.ObjectDirection;
import examples.snake.model.SnakeGridModel;
import examples.snake.model.simulationObjects.Bug;
import examples.snake.model.simulationObjects.Snake;
import examples.snake.model.simulationObjects.SnakeFinalTailElement;
import examples.snake.model.simulationObjects.SnakeTailElement;
import examples.snake.model.simulationObjects.Wall;
import examples.snake.pictureManagement.DesignPictureManager;

/**
 * Class used for loading/changing design of the game.
 * A corresponding function for every enum should exist.
 * 
 * @author Kristofer Schweiger
 */
public class Design {
	
	/** the data folder for the game **/
	public static final String FOLDER = "examplesData/snake/";
	/** defined designs **/
	public enum DesignEnum {Classic, Cheap, Normal};
	
	/** boolean used internal for picture loading **/
	private static boolean tmpWasInitialized;	
	/** integer used internal for picture loading **/
	private static int tmpIndex = -1;	
	/** First index after predefined colors **/
	public static final int START_INDEX = SnakeGridModel.PredefinedColor.values().length;
	/** Manager used for loaded pictures/indices **/
	private static DesignPictureManager<DesignEnum> dpm = new DesignPictureManager<DesignEnum>(START_INDEX);
	
	/**
	 * Changes design with Enum.
	 * @param designEnum
	 * @param model
	 */
	public static void changeDesign(SnakeGridModel model) {
		
		DesignEnum designEnum = model.designEnum;
		
		/*
		 * This block may be entered by only one instance at a time.
		 */
		synchronized(dpm){
			
			pictureLoadingPrepare(designEnum);
			int startIndex = tmpIndex;					// first usable index
			int lastIndex;											// last index used
			
			switch(designEnum){
			
			case Classic: 
				lastIndex = classicDesign(model); 
				break;
				
			case Cheap: 
				lastIndex = cheapDesign(model); 
				break;
			
			case Normal: 	
				lastIndex = normalDesign(model); 
				break;
				
			default: throw new RuntimeException("Unknown case.");
			}
			
			System.out.println("> start="+startIndex+" - "+"stop="+lastIndex);
			pictureLoadingFinish(designEnum, startIndex, lastIndex);
		}

		
	}
	
	/**
	 * Prepare handling new and already loaded pictures.
	 * @param ordinal
	 */
	private static void pictureLoadingPrepare(DesignEnum designEnum){
		
		tmpWasInitialized = dpm.contains(designEnum);
		tmpIndex = dpm.getStartIndex(designEnum);
	}
	
	/**
	 * Handle new and already loaded pictures.
	 * @param ordinal
	 */
	private static void pictureLoadingFinish(DesignEnum designEnum, int startIndex, int lastIndex){
		
		dpm.set(designEnum, startIndex, lastIndex);	// add to manager
		
		tmpWasInitialized = false;			// just set default values
		tmpIndex = -1;									// -
	}
	
	/**
	 * Load for corresponding Enum
	 * @param model
	 * @return last used picture index
	 */
	private static int classicDesign(SnakeGridModel model){

		ObjectDirection[] values = ObjectDirection.values();
		
		for(ObjectDirection d : values){
			
			Snake.pictures.put(d, BLACK.ordinal());
			Snake.deadPictures.put(d, RED.ordinal());
			SnakeTailElement.pictures.put(d, BLACK.ordinal()); 
			SnakeFinalTailElement.pictures.put(d, BLACK.ordinal());
			
			Wall.pictures.put(d, GRAY.ordinal());
			
			Bug.pictures.put(d, ORANGE.ordinal());
		}
		
		return tmpIndex-1;
	}
	
	/**
	 * Load for corresponding Enum
	 * @param model
	 * @return last used picture index
	 */
	private static int cheapDesign(SnakeGridModel model){
		
		ObjectDirection[] values = ObjectDirection.values();
		
		int i;
		for(ObjectDirection d : values){
			
			i = addImageToScale(model, FOLDER+"SnakeHead_v1"+".png");
			Snake.pictures.put(d, i);
			
			Snake.deadPictures.put(d, RED.ordinal());
			
			i = addImageToScale(model, FOLDER+"SnakeTail_v1"+".png");
			SnakeTailElement.pictures.put(d, i);
			
			i = addImageToScale(model, FOLDER+"SnakeFinalTail_v1"+".png");
			SnakeFinalTailElement.pictures.put(d, i);
			
			i = addImageToScale(model, FOLDER+"Wall_v1"+".png");
			Wall.pictures.put(d, i);
			
			i = addImageToScale(model, FOLDER+"Bug_v1"+".png");
			Bug.pictures.put(d, i);
		}
		return tmpIndex-1;
	}
	
	/**
	 * Load for corresponding Enum
	 * @param model
	 * @return last used picture index
	 */
	private static int normalDesign(SnakeGridModel model){
		
		ObjectDirection[] values = ObjectDirection.values();
		
		int i;
		for(ObjectDirection d : values){
			
			i = addImageToScale(model, FOLDER+"SnakeHead_v4_"+d.toString().substring(0, 1)+".png");
			Snake.pictures.put(d, i);
			
			Snake.deadPictures.put(d, RED.ordinal());
			
			i = addImageToScale(model, FOLDER+"SnakeTail_v2_"+d.toString().substring(0, 1)+".png");
			SnakeTailElement.pictures.put(d, i);
			
			i = addImageToScale(model, FOLDER+"SnakeFinalTail_v2_"+d.toString().substring(0, 1)+".png");
			SnakeFinalTailElement.pictures.put(d, i);
			
			i = addImageToScale(model, FOLDER+"Wall_v2"+".png");
			Wall.pictures.put(d, i);
			
			i = addImageToScale(model, FOLDER+"Bug_v2"+".png");
			Bug.pictures.put(d, i);
		}
		
		return tmpIndex-1;
	}
	
	
	/**
	 * Loads picture into JGM
	 * @param model
	 * @param filename
	 * @return correct index.
	 */
	private static int addImageToScale(SnakeGridModel model, String filename){
		int index = tmpIndex++;
		
		if(!tmpWasInitialized)
			model.jGridMap.addImageToScale(index, filename);
		
		return index;
	}

	
	
}




