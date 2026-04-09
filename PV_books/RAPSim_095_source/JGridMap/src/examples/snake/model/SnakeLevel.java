package examples.snake.model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;

import examples.snake.model.simulationObjects.Bug;
import examples.snake.model.simulationObjects.Wall;

/**
 * Holds level related information (Enum, ...) and loading logic.
 * 
 * @author Kristofer Schweiger
 */
public class SnakeLevel {
	
	public enum LevelEnum {LvS, Lv1, Lv2, Lv3, Lv4};
	
	public LinkedList<SnakeGridObject> gridObjectList;
	public int width,height;
	public LevelEnum levelEnum;
	public static final String FOLDER = "examplesData/snake/levels/";
	
	/**
	 * Constructor with character array defining the objects.
	 * @param levelArr
	 * @param levelEnum
	 */
	public SnakeLevel(char[][] levelArr, LevelEnum levelEnum){
		this.levelEnum = levelEnum;
		this.gridObjectList = arrayToList(levelArr);
		this.height = levelArr.length;
		this.width = levelArr[0].length;
	}
	
	/**
	 * 
	 * @param levelEnum
	 * @return 
	 * @throws IOException
	 */
	public static SnakeLevel fromFile(LevelEnum levelEnum) throws IOException{
		return fromFile(FOLDER+levelEnum+".txt", levelEnum);
	}
	
	/**
	 * @param file
	 * @param levelEnum - may be null
	 * @return loaded SnakeLevel
	 * @throws IOException
	 */
	public static SnakeLevel fromFile(String file, LevelEnum levelEnum) throws IOException{
		char[][] level = null;
		
		InputStream in = new FileInputStream(file);
		BufferedReader reader = new BufferedReader( new InputStreamReader(in) );
		String line;
		String[] tmp;
		
		line = reader.readLine();
		tmp = line.split(",");
		try{
			int x = Integer.parseInt(tmp[0]);
			int y = Integer.parseInt(tmp[1]);
			level = new char[y][x];
		}
		catch(Exception e){
			throw new IOException("Wrong file header.");
		}
		
		for(int y=0; y<level.length; y++){
			line = reader.readLine();
			if(line==null)
				break;
			
			for(int x=0; x<level[y].length && x<line.length(); x++){
				
				char ch = line.charAt(x);
				level[y][x] = ch;
			}
		}
		
		return new SnakeLevel(level, levelEnum);
	}

	/**
	 * Char[][] -> List<GridObjects>
	 * @param level
	 * @return list
	 */
	private static LinkedList<SnakeGridObject> arrayToList(char[][] level){
		
		LinkedList<SnakeGridObject> list = new LinkedList<SnakeGridObject>();
		
		for(int i=0; i<level.length; i++){
			for(int j=0; j<level[i].length; j++){
				
				switch(level[i][j]){
				
				case 'w': 
				case 'W': 
					list.add(new Wall(j, i));
					break;
				
				case 'b': 
				case 'B': 
					list.add(new Bug(j, i));
					break;
					
				}
				
			}
		}
		return list;
		
	}
			
			
			
	
	
}
