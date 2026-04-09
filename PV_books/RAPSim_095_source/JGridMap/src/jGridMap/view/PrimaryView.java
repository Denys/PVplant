package jGridMap.view;

import jGridMap.JGridMap.JGridMapEventListener;
import jGridMap.model.GridModel;
import jGridMap.view.MenuOrganizer.MenuItemType;
import jGridMap.view.MenuOrganizer.MenuSpecialType;
import jGridMap.view.interfaces.MenuViewI;
import jGridMap.view.interfaces.PrimaryViewI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * The primary view shows the JGM and means of user interaction.
 * It sets the title and can access the model (=all data).
 * The interfaces provide the controller with possibilities to define the 
 * menu and buttons.
 * 
 * @author Kristofer Schweiger, Christoph Glanzer & Tobias Ibounig
 */
public class PrimaryView extends JFrame implements MenuViewI, PrimaryViewI {

	private static final long serialVersionUID = 156465465L;
	private GridModel gridModel;
	private MenuView menueView;

	/**
	 * Constructor
	 * @param title - title for the window
	 * @param gridModel - model to be used with the view
	 */
	public PrimaryView(String title, GridModel gridModel) {
		super(title);
		this.gridModel = gridModel;

		try {	// For Native look and Feel
			UIManager.setLookAndFeel( UIManager.getSystemLookAndFeelClassName() );
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);	// Default close operation. Can be overwritten by controller.

		setResizable(true);
		setLayout(new BorderLayout());
		//setLocationRelativeTo(null);	// place in the middle of the screen

		initGui();
	}

	/**
	 * Init rest of Gui
	 */
	private void initGui(){

		this.setLayout(new BorderLayout(0, 0));
		
		// --- menu ---
		//
		menueView = new MenuView(this);
		
		// --- JGridMap ---
		//
		this.add(gridModel.jGridMap, BorderLayout.CENTER);				// add: the JGridMap
	}
	

	@Override
	public void repaintGrid() {
		gridModel.jGridMap.paintBoard.repaint();
	}

	@Override
	public void addJGridMapEventListener(JGridMapEventListener l) {
		gridModel.jGridMap.addEventListener(l);
	}

	@Override
	public JMenuItem addControl_Menu(String[] menuPath, MenuItemType type,
			ActionListener l) {
		return menueView.addControl_Menu(menuPath, type, l);
	}

	@Override
	public JCheckBoxMenuItem addControl_MenuCheckBox(String[] menuPath,
			MenuItemType type, ActionListener l) {
		
		return menueView.addControl_MenuCheckBox(menuPath, type, l);
	}

	@Override
	public JComponent addSpecialControl_Menu(String[] menuPath, MenuSpecialType extra) {
		return menueView.addSpecialControl_Menu(menuPath, extra);
	}
	
	@Override
	public ButtonGroup startNewButtonGroup() {
		return menueView.startNewButtonGroup();
	}

	@Override
	public void finishButtonGroup() {
		menueView.finishButtonGroup();
	}
    
	@Override
	public boolean deleteViewControlManagmentData() {
		
		boolean b1 = menueView.deleteViewControlManagmentData();
		return b1;
	}

	/**
	 * Exit the Program
	 * @param j
	 */
	public static void exit(PrimaryView j) {
		System.exit(0);
	}

	@Override
	public void setJComponent(JComponent panel, String borderLayoutConstraint) {
		if(borderLayoutConstraint == BorderLayout.CENTER)
			throw new IllegalArgumentException("Componets can not be set into the center.");
		
		this.add(panel, borderLayoutConstraint);
	}
	
	@Override
	public void setVisible(boolean b){
		Dimension dim = super.getSize();
		if(dim.height==0 && dim.width==0){
			this.pack();
		}
		super.setVisible(true);
	}

}