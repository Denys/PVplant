package jGridMap;

import java.awt.FlowLayout;

import javax.swing.JFrame;

/**
 * A helper class for quickly displaying a JFrame 
 * with flow layout
 * 
 * @author Thomas Dittrich, Kristofer Schweiger
 */
public class SimpleDisplay extends JFrame {

    private static final long serialVersionUID = -2023725456998272859L;
    
    /**
     * Initializes the display
     * 
     * @param title frame title
     */
    public SimpleDisplay(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout());
    }
    
    /**
     * Combines now pack and setVisible for faster usage.
     */
    @Override
    public void setVisible(boolean b){
    	this.pack();
    	super.setVisible(b);
    }
}
