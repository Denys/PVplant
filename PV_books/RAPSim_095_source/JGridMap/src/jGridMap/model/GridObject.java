package jGridMap.model;

import jGridMap.util.NESRandom;

import java.util.Random;


/**
 * TODO: move to JGridMap
 * 
 * @author Kristofer Schweiger
 */
public abstract class GridObject {

	public static final Random RAND = new NESRandom();
	/** X and Y coordinate **/
    protected int y, x;
    
    
    /**
     * @return name for this object
     */
	public String getName() {
		return this.getClass().getSimpleName();
	}

    /**
     * @return the x
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the y
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the y to set
     */
    public void setX(int x) {
        this.x = x;
    }
    
    // ---------------------------------------------------------
    // --- Abstract Methods --- --------------------------------
    
	
}
