package examples.snake.view;

import java.awt.BorderLayout;

import javax.swing.JToolBar;
import javax.swing.border.EtchedBorder;

import examples.snake.controller.PrimarySnakeController;
import examples.snake.model.SnakeGridModel;

/**
 * Panel which is used to unite other panels and will be set in the View of the JGM. 
 * 
 * @author Kristofer Schweiger
 */
public class TopToolBar extends JToolBar {

	private static final long	serialVersionUID	= 1L;
	public ControlPanel cPanel;
	public InfoPanel iPanel;
	
	public TopToolBar(SnakeGridModel model,PrimarySnakeController controller){
		
		this.setBorder(new EtchedBorder());
		this.setLayout(new BorderLayout());
		
		cPanel = new ControlPanel(model,controller);
		this.add(cPanel,BorderLayout.WEST);
		
		iPanel = new InfoPanel(model);
		this.add(iPanel,BorderLayout.EAST);
		
	}
}
