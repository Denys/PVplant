package examples.snake;

import java.io.IOException;

import javax.swing.JOptionPane;

import examples.snake.controller.PrimarySnakeController;

/**
 * Used for starting the game.
 * 
 * @author Kristofer Schweiger
 */
public class _Main_ {

	
	    
	/**
	 * @param args - unused
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		try{
			
			// --- Model ---
			// --- View ---
			//
			// done in controller.

			// --- Controller ---
			//
			new PrimarySnakeController();

		}
		catch(Exception e){
			// Exception handling for GUI:
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "An exception occured: "+e.toString(), "Error", JOptionPane.OK_OPTION);
		}

		
		
		
	}
	
}
