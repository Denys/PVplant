package examples.snake.view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

import examples.snake.model.SnakeGridModel;

/**
 * The InfoPanel hold user information like his points (stored in Model).
 * 
 * @author Kristofer Schweiger
 */
public class InfoPanel extends JPanel{
	
	private static final long	serialVersionUID	= 1L;
	private SnakeGridModel model;
	
	private JLabel 
	pointsLabel1 = new JLabel("Points: "), 
	pointsLabel2 = new JLabel("0");
	
	public InfoPanel(SnakeGridModel model){
		this.model = model;
		this.setBorder(new EtchedBorder());
		
		initialize();
	}
	
	private void initialize(){
		this.add(pointsLabel1);
		this.add(pointsLabel2);
	}
	
	public void repaintInfo(){
		if(model==null)
			return;
		
		pointsLabel2.setText( getPointsString() );
	}
	
	public String getPointsString(){
		return ""+(int)model.playerPoints+" ("+model.playerBugs+")";
	}
	
}
