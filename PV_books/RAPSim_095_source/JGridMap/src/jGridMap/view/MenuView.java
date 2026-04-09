package jGridMap.view;

import jGridMap.view.MenuOrganizer.MenuItemType;
import jGridMap.view.MenuOrganizer.MenuSpecialType;
import jGridMap.view.interfaces.MenuViewI;

import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenuItem;


/**
 * View component for the menu.
 * @author Tobi, Kristofer Schweiger
 */
public class MenuView implements MenuViewI {

    /** the actual menu bar **/
    //private JMenuBar menuBar = new JMenuBar();
    private MenuOrganizer organizer = new MenuOrganizer();
    private ButtonGroup buttonGroup = null;
    
    /**
     * Constructor
     * @param menuFrame - frame which hold JMenuBar
     */
    public MenuView(JFrame menuFrame) {
    	//this.frame = menuFrame;
    	menuFrame.setJMenuBar(organizer.getJMenuBar());
    }

    @Override
    public JMenuItem addControl_Menu(String[] menuPath, MenuItemType type, ActionListener l) {
    	JMenuItem item = organizer.makeOrGet(menuPath, type);
    	if(organizer.getLastNrOfCreations() == 0)
    		System.err.println("addControl_Menu: No element created at last call.");
    	if(l != null)
    		item.addActionListener(l);
    	if(buttonGroup!=null)
    		buttonGroup.add(item);
    	
    	return item;
    }
    
    @Override
		public JCheckBoxMenuItem addControl_MenuCheckBox(String[] menuPath, MenuItemType type, ActionListener l) {
    	JCheckBoxMenuItem item = organizer.makeOrGetCB(menuPath, type);
    	if(organizer.getLastNrOfCreations() == 0)
    		System.err.println("addControl_Menu: No element created at last call.");
    	if(l != null)
    		item.addActionListener(l);
    	if(buttonGroup!=null)
    		
    		buttonGroup.add(item);
			
    	
    	
    	
    	return item;
		}

		@Override
    public JComponent addSpecialControl_Menu(String[] menuPath, MenuSpecialType extra) {
    	JComponent comp = organizer.makeSpecial(menuPath, extra);
    	if(organizer.getLastNrOfCreations() == 0)
    		System.err.println("addSpecialControl_Menu: No element created at last call.");
    	return comp;
    }

    
	@Override
	public boolean deleteViewControlManagmentData() {
		organizer = null;
		return true;
	}

	@Override
	public ButtonGroup startNewButtonGroup() {
		buttonGroup = new ButtonGroup();
		return buttonGroup;
	}

	@Override
	public void finishButtonGroup() {
		buttonGroup=null;
	}

}
