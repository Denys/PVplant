package jGridMap.view.interfaces;

import jGridMap.view.MenuOrganizer.MenuItemType;
import jGridMap.view.MenuOrganizer.MenuSpecialType;

import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComponent;
import javax.swing.JMenuItem;

public interface MenuViewI extends ViewOrganization {
	
    /**
     * Add elements to the JMenueBar, add ActionListener to item.
     * Path to element is automatically generated if needed. Existing elements/paths can be used.
     * @param menuePath	- path plus element for action listener
     * @param l 				- ActionListener to add, can be null.
     * @return existing or generated Item.
     */
    public JMenuItem addControl_Menu(String[] menuPath, MenuItemType type, ActionListener l);
    
    
    public JCheckBoxMenuItem addControl_MenuCheckBox(String[] menuPath, MenuItemType type, ActionListener l);
    
    /**
     * Add special elements to the JMenueBar, e.g. JSeperator
     * @param menuePath - path plus element for action listener
     * @param extra
     * @return new, added component.
     */
    public JComponent addSpecialControl_Menu(String[] menuPath, MenuSpecialType extra);
	
    /**
     * All (compatible) following menu elements will be added to this ButtonGroup
     */
    public ButtonGroup startNewButtonGroup();
    
    /**
     * Finished using the current button group. Following menu elements will not be added to any button group.
     */
    public void finishButtonGroup();
}
