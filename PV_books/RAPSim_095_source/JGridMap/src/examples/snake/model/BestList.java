package examples.snake.model;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Can be used for future implementations of a "BestList".
 * 
 * @author Kristofer Schweiger
 */
public class BestList implements Serializable {
	
	private static final long	serialVersionUID	= 1L;
	private HashMap<String, BestElement> map = new HashMap<String, BestElement>();
	
	public boolean put(String level, int points, int bugs){
		BestElement e = map.put(level, new BestElement(points, bugs));
		return e!=null;
	}
	
	public BestElement get(String level){
		BestElement e = map.get(level);
		if(e==null)
			e = new BestElement();
		return e;
	}
	
}

class BestElement {
	
	int points;
	int bugs;
	
	public BestElement(int points, int bugs){
		this.points = points;
		this.bugs = bugs;
	}
	
	public BestElement(){
		this(0,0);
	}
	
}