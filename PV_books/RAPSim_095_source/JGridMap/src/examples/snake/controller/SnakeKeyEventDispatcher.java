package examples.snake.controller;

import java.awt.KeyEventDispatcher;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.TreeSet;

import examples.snake.controller.TimeController.SpeedEnum;
import examples.snake.model.ObjectDirection;
import examples.snake.model.SnakeGridModel;

/**
 * For game controls.
 * Can catch keys all the time (focus does not matter)
 * 
 * @author Kristofer Schweiger
 */
public class SnakeKeyEventDispatcher implements KeyEventDispatcher {

	/** keys pressed at the moment (memorized internally until release) **/
	private Set<Integer> keysPressed = new TreeSet<Integer>();		// TreeSet not optimal. No chronological order.  //Collections.synchronizedSet( new TreeSet<Integer>() );
	/** keys hit in this turn (pressed keys are also often "hit again" by java) **/
	private Set<Integer> keysHit = new TreeSet<Integer>(); //Collections.synchronizedSet( new TreeSet<Integer>() );
	
	private SnakeGridModel model;
	private PrimarySnakeController	controller;
	
	public SnakeKeyEventDispatcher(PrimarySnakeController controller) {
		this.controller = controller;
		this.model = controller.model;
	}

	@Override
	public boolean dispatchKeyEvent(KeyEvent e) {
		
		//System.out.println("> "+e.paramString());
		
		if (e.getID() == KeyEvent.KEY_PRESSED) {
			//System.out.println("> "+e.paramString());
			keyPressed(e.getKeyCode());
		} 
		else if (e.getID() == KeyEvent.KEY_RELEASED) {
			
			keysPressed.remove(e.getKeyCode());
		}
		return false;
	}
	
	/**
	 * Handling of pressed key with key code.
	 * @param keyCode
	 */
	public void keyPressed(int keyCode) {
		
		//System.out.println("Hit key: "+keyCode + " at "+model.snake.toString());
		
		synchronized(keysHit){			// a key is hit (once)
			keysHit.add(keyCode);			// -
		}

		if(isPressed(keyCode))			// ignore keys already pressed
			return;										// -

		synchronized(keysPressed){	// add a new key which is pressed (at the moment)
			keysPressed.add(keyCode);	// -
		}
		
		handleOtherKeys(keyCode);		// handle keys for options etc.
	}
	
	/**
	 * Handle keys for move in game.
	 * @param keyCode
	 * @return ObjectDirection if a key was used
	 */
	private ObjectDirection handleMoveKeys(int keyCode){
		ObjectDirection d2 = ObjectDirection.fromKeyEvent(keyCode);
		if(d2!=null){
			boolean used =  model.snake.changeDirection(d2);
			if(used)
				return d2;
			//System.out.println("Changed direction to: "+d2 + " at "+model.snake.toString());
			//return true;
		}
		return null;
	}
	
	/**
	 * Handle keys not directly for move in game.
	 * @param keyCode
	 */
	private void handleOtherKeys(int keyCode){
		
		if(keyCode == KeyEvent.VK_ESCAPE){
			System.exit(0);
		}
		else if(keyCode == KeyEvent.VK_P || keyCode == KeyEvent.VK_PAUSE){
				controller.togglePause();
		}
		else if(keyCode == KeyEvent.VK_PLUS || keyCode == KeyEvent.VK_ADD){
			controller.changeSpeed( (SpeedEnum)next(SpeedEnum.values(), model.speedEnum, -1) );
		}
		else if(keyCode == KeyEvent.VK_MINUS || keyCode == KeyEvent.VK_SUBTRACT){
			controller.changeSpeed( (SpeedEnum)next(SpeedEnum.values(), model.speedEnum, +1) );
		}
	}
	
	/**
	 * 
	 * @param arr  - data array
	 * @param o    - object in array
	 * @param plus - value added to index (< +- arr.length)
	 * @return arr[ (oIndex+plus)%length ], or o, if it is not element of the array
	 */
	private Object next(Object[] arr, Object o, int plus){
		
		for(int i=0; i<arr.length; i++){
			Object r = arr[i];
			if(r == o){
				i = ( i+plus+arr.length ) % arr.length;
				return arr[i];
			}
		}
		
		return o;
	}
	
	/**
	 * @param keyCode
	 * @return true if key is already pressed.
	 */
	public boolean isPressed(Integer keyCode){
		return keysPressed.contains(keyCode);
	}
	
	/**
	 * Apply pressed keys before move.
	 * (used first effective key)
	 */
	public void applyKeys(){
		applyKeys(null);
	}
	
	/**
	 * Exclude an unwanted key.
	 * @param keyCodeExclude
	 */
	public void applyKeys(ObjectDirection exclude){

//		if( (keysHit.size()+keysPressed.size())>0 )
//			System.out.println("Apply keys: "+keysHit.size() + ", "+ keysPressed.size());
		ObjectDirection applied = null;
		//System.out.println("> apply start: ");
		
		if(applied==null)
		synchronized(keysPressed){
				for(int keyCode : keysPressed){
					applied = handleMoveKeys(keyCode);
					//System.out.println(">> apply_1: "+keyCode);
					if(applied!=null && applied!=exclude){		// was applied and applied does not equal exclude
						//System.out.println(">y");
						break;			// only apply one key
					}
				}//for
		}
		
		if(applied==null)
		synchronized(keysHit){
			for(int keyCode : keysHit){
				applied = handleMoveKeys(keyCode);
				//System.out.println(">> apply_2: "+keyCode);
				if(applied!=null && applied!=exclude){		// was applied and applied does not equal exclude
					//System.out.println(">y");
					break;			// only apply one key
				}
			}//for
			//keysHit.clear();	// handled all hit keys for this round
		}
		keysHit.clear();	// handled all hit keys for this round

	}
	
	
	/**
	 * Reset typed keys (not pressed)
	 */
	public void resetKeys(){
		synchronized(keysHit){
			keysHit.clear();
		}
	}


}
