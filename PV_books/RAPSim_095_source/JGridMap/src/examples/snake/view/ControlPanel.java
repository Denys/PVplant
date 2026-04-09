package examples.snake.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.border.EtchedBorder;

import examples.snake.controller.PrimarySnakeController;
import examples.snake.controller.TimeController;
import examples.snake.model.SnakeGridModel;
import examples.snake.model.SnakeLevel;

/**
 * The control panel holds all GUI-Control elements for the user.
 * 
 * @author Kristofer Schweiger
 */
public class ControlPanel extends JPanel{
	
	private static final long	serialVersionUID	= 1L;
	private SnakeGridModel model;
	private PrimarySnakeController controller;
	
	public JButton 
			startButton, 
			stopButton, 
			pauseButton;
	
	public JToggleButton autoGrowButton;
	
	public JComboBox<SnakeLevel.LevelEnum> levelComboBox = new JComboBox<SnakeLevel.LevelEnum>(SnakeLevel.LevelEnum.values());
	public JComboBox<TimeController.SpeedEnum> speedComboBox = new JComboBox<TimeController.SpeedEnum>(TimeController.SpeedEnum.values());
	public JComboBox<Design.DesignEnum> designComboBox = new JComboBox<Design.DesignEnum>(Design.DesignEnum.values());
	
	/**
	 * Constructor: full
	 * @param model
	 * @param controller
	 */
	public ControlPanel(SnakeGridModel model, PrimarySnakeController controller){
		this.model = model;
		this.controller = controller;
		this.setBorder(new EtchedBorder());
		
		initialize();
		startStop(false);
	}
	
	/**
	 * initialize panel and components.
	 */
	private void initialize(){
		
		startButton = new JButton("Start");
		startButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controller.start();
			}
		});
		this.add(startButton);
			
		stopButton = new JButton("Stop");
		stopButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controller.stop();
			}
		});
		this.add(stopButton);
		
		pauseButton = new JButton("Pause");
		pauseButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controller.togglePause();
			}
		});
		pauseButton.setToolTipText("Wanna take a break?");
		this.add(pauseButton);
		
		autoGrowButton = new JToggleButton("Auto Grow");
		autoGrowButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean b = autoGrowButton.isSelected();
				controller.toggleAutoGrow(b);
			}
		});
		autoGrowButton.setToolTipText("Snake also grows without food. Gives bonus points if activated.");
		this.add(autoGrowButton);
		
		levelComboBox.setFocusable(false);
		levelComboBox.setSelectedItem(model.level.levelEnum);
		levelComboBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(e);
				int i = levelComboBox.getSelectedIndex();
				controller.changeLevel(levelComboBox.getItemAt(i));
			}
		});
		this.add(levelComboBox);		// Level
		
		speedComboBox.setFocusable(false);
		speedComboBox.setSelectedItem(model.speedEnum);
		speedComboBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int i = speedComboBox.getSelectedIndex();
				controller.changeSpeed(speedComboBox.getItemAt(i));
			}
		});
		speedComboBox.setToolTipText("Set speed. Higher speed gives more points per bug.");
		this.add(speedComboBox);		// Speed
		
		designComboBox.setFocusable(false);
		designComboBox.setSelectedItem(model.designEnum);
		designComboBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int i = designComboBox.getSelectedIndex();
				controller.changeDesign(designComboBox.getItemAt(i));
			}
		});
		this.add(designComboBox);		// Design
		
	}
	
	/**
	 * 
	 * @param running
	 */
	public void startStop(boolean running){
		startButton.setEnabled(!running);
		stopButton.setEnabled(running);
		pauseButton.setEnabled(running);
		autoGrowButton.setEnabled(running);
		
		levelComboBox.setEnabled(!running);
		// speedComboBox 
		// designComboBox 
	}
	
}