package jGridMap.view;

import java.util.TreeMap;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComponent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSeparator;

/**
 * Menu organizer for dynamic menu creation via Strings.
 * @author Kristofer Schweiger
 */
public class MenuOrganizer {
	
	public static enum MenuItemType {none, jMenueItem, jMenue, jCheckboxMenuItem, jRadioButtonMenuItem};
	public static enum MenuSpecialType {JSeperator};
	
	private int lastNrOfCreations = 0;
	private int totalNrOfCreations = 0;
	private String[] lastPath;
	
	//TreeMap<String,MenuElement> map = new TreeMap<String,MenuElement>();
	private FirstMenuElement firstElement; // = new MenuElement("", null, MenuItemType.none);
	
	/**
	 * Constructor
	 * Initializes the first element of the menu tree and the JMenuBar.
	 */
	public MenuOrganizer(){
		firstElement = new FirstMenuElement(new JMenuBar());
	}
	
	/** @return the created JMenuBar **/
	public JMenuBar getJMenuBar(){
		return firstElement.menuBar;
	}
	
	public int getTotalNrOfCreations(){
		return totalNrOfCreations;
	}
	public int getLastNrOfCreations(){
		return lastNrOfCreations;
	}
	public String[] getLastPath(){
		return lastPath;
	}
	
	/**
	 * Usage example:
	 * 	path = new String[] {"menu2", "subMenu", "radio2"};
	 *	JMenuItem r2 = org.makeOrGet(path, MenuItemType.jRadioButtonMenuItem);
	 *
	 * @param path
	 * @param name
	 * @return new or existing JMenuItem
	 */
	public JMenuItem makeOrGet(String[] menuPath, MenuItemType type){
		
		NormalOrganizer a = new NormalOrganizer(menuPath, type);
		return (JMenuItem)organizeAlgorithm(a);
	}
	
	public JCheckBoxMenuItem makeOrGetCB(String[] menuPath, MenuItemType type){
		
		NormalOrganizer a = new NormalOrganizer(menuPath, type);
		return (JCheckBoxMenuItem) organizeAlgorithm(a);
	}
	
	/**
	 * Make a special element for the menu.
	 * Last entry of menu path is necessary, but never used.
	 * @param menuPath
	 * @param extra
	 * @return the created JComponent
	 */
	public JComponent makeSpecial(String[] menuPath, MenuSpecialType extra) {
		
		SpecialOrganizer b = new SpecialOrganizer(menuPath, extra);
		return organizeAlgorithm(b);
	}
	
	/**
	 * Function for running through the tree.
	 * Detailed actions and variables are specified by the OrganizerCore.
	 * @param core
	 * @return 
	 * 		JComponent at SpecialOrganizer OR
	 * 		JMenuItem at NormalOrganizer
	 * 		...as specified in used MenuElement classes.
	 */
	private JComponent organizeAlgorithm(OrganizerCore core){
		
		core.prepare();							// precondition handling for core algorithm
		String[] menuPath = core.menuPath;	// easier access
		
		this.lastPath = menuPath;
		int nrOfCreations = 0;
		MenuElement parentElement       = null;
		TreeMap<String,MenuElement> map = null;
		MenuElement childElement        = firstElement;
		//
		for(int i=0; i<menuPath.length; i++) {
			
			String name = menuPath[i];				// name for this element
			
			parentElement = childElement;			// element got old
			map			  = parentElement.map;		// actual parent map
			childElement  = map.get(name);			// child element
			
			if(childElement == null){				// element does not exist:
				nrOfCreations++;									// count creations (testing and information)
				childElement = core.middle(i, name, parentElement);	// assignments of core algorithm
			}//if child is null
			
		}//for path
		
		childElement = core.finish(childElement);					// postcondition of algorithm
		
		this.lastNrOfCreations = nrOfCreations;
		this.totalNrOfCreations += nrOfCreations;
		return childElement.menuItem;
	}
	
	
	/**
	 * @param array
	 * @param index
	 * @return true if the array has an element after array[index]
	 */
	private static boolean hasNext(Object[] array, int index){
		return (index+1) < array.length;
	}
	
	
    // ---------------------------------------------------------
    // --- OrganizerCore classes --- ---------------------------
	
	/**
	 * Organizer core, base class. (ObjectOrientation^2)
	 * @author Kristofer Schweiger
	 */
	private abstract class OrganizerCore {
		
		String[] menuPath;
		
		/** Constructor: general with the menu path only **/ 
		OrganizerCore(String[] menuPath){
			if(menuPath==null)				// menu path is last path if not set
				menuPath = lastPath;		// -
			this.menuPath = menuPath;
		}
		/** preconditions to algorithm **/
		abstract void prepare();
		/** Assignments in algorithm core **/
		abstract MenuElement middle(int i, String name, MenuElement parentElement);
		/** post conditions for algorithm **/
		abstract MenuElement finish(MenuElement finalElement);
	}
	/** Class for MenuItemType elements TODO **/
	private class NormalOrganizer extends OrganizerCore {
		
		MenuItemType type;
		
		/** Constructor: general menu item handling **/
		NormalOrganizer(String[] menuPath, MenuItemType type) {
			super(menuPath);
			this.type = type;
		}
		@Override
		void prepare(){
			assert menuPath!=null && menuPath.length>0;
		}
		@Override
		MenuElement middle(int i, String name, MenuElement parentElement){
			
			MenuElement childElement;
			
			if(hasNext(menuPath,i)){
				childElement = new MenuElement(name, parentElement, MenuItemType.jMenue);
			}
			else {
				childElement = new MenuElement(name, parentElement, type);
			}
			return childElement;
		}
		@Override
		MenuElement finish(MenuElement finalElement){
			// not needed
			return finalElement;
		}
	}
	/** Class for MenuSpecialType elements **/
	private class SpecialOrganizer extends OrganizerCore {
		
		MenuSpecialType extra;
		
		/** Constructor: special menu item handling **/
		SpecialOrganizer(String[] menuPath, MenuSpecialType extra) {
			super(menuPath);
			this.extra = extra;
		}
		@Override
		void prepare(){
			assert menuPath!=null && menuPath.length>1;
			menuPath[menuPath.length-1] = "";
		}
		@Override
		MenuElement middle(int i, String name, MenuElement parentElement){
			
			MenuElement childElement;
			
			if(hasNext(menuPath,i)){
				childElement = new MenuElement(name, parentElement, MenuItemType.jMenue);
			}
			else {
				childElement = new MenuSpecialElement(parentElement, extra);
			}
			return childElement;
		}
		@Override
		MenuElement finish(MenuElement finalElement){
			// Empty. 
			// Could set return element here and use shorter String[],
			// but would be bad for the overall consistency and understanding.
			return finalElement;
		}
	}
	
	
    // ---------------------------------------------------------
    // --- MenuElement classes --- -----------------------------
	
	/**
	 * A element of the menu tree.
	 * @author Kristofer Schweiger
	 */
	private class MenuElement {
		
		private String name;
		private MenuItemType type;
		private MenuElement parent;
		private JMenuItem menuItem;
		private TreeMap<String,MenuElement> map = new TreeMap<String,MenuElement>();
		
		/** Constructor: default **/
		protected MenuElement(String name, MenuElement parent, MenuItemType type){
			this.name = name;
			this.type = type;
			this.parent = parent;
			//
			if(type != MenuItemType.none){
				this.menuItem = makeItem();				// make child-JMenuItem
				parent.getJComponent().add(menuItem);	// add child-JMenuItem to parent
				parent.map.put(name, this);				// put child into parent map
			}
		}
		
		/** @return exiting parent object. Overwritten in sub classes **/
		protected JComponent getJComponent(){
			return menuItem;
		}
		
		/**
		 * Factory method for menu item
		 * @return a new menu item.
		 */
		private JMenuItem makeItem(){
			assert menuItem==null;
			JMenuItem item = null;
			
			switch(type){
			
			case none:
				item = null;
				break;
			case jMenueItem: 
				item = new JMenuItem(name);
				break;
			case jMenue:
				item = new JMenu(name);
				break;
			case jCheckboxMenuItem:
				item = new JCheckBoxMenuItem(name);
				break;
			case jRadioButtonMenuItem:
				item = new JRadioButtonMenuItem(name);
				break;
			default:
				throw new RuntimeException("Unknown MenueItemType.");
			}
			
			return item;
		}
		
		/** @return number of sub elements **/
		public int size(){
			return map.size();
		}
		
		@Override
		public String toString(){
			return name+", "+type+", with "+size()+" elements, parent is "+parent.name;
		}
		
	}//class MenuElement
	
	/**
	 * First element of menu tree.
	 * @author Kristofer Schweiger
	 */
	private class FirstMenuElement extends MenuElement {
		private JMenuBar menuBar;
		
		/** 
		 * Constructor: first element.
		 * Does not have a parent, name or item; but a menuBar.
		 */
		FirstMenuElement(JMenuBar menuBar){
			super("",null,MenuItemType.none);
			
			this.menuBar = menuBar;
		}
		
		@Override
		protected JComponent getJComponent(){
			return menuBar;
		}
		
		@Override
		public String toString(){
			return "FirstMenuElement"+", "+"JMenuBar"+", with "+size()+" elements";
		}
	}//class FirstMenuElement
	
	/**
	 * Special element of menu tree.
	 * @author Kristofer Schweiger
	 */
	private class MenuSpecialElement extends MenuElement {
		private JComponent specialItem;
		private MenuSpecialType specialType;
		
		/** 
		 * Constructor: first element.
		 * Does not have a parent, name or item; but a menuBar.
		 */
		MenuSpecialElement(MenuElement parent, MenuSpecialType specialType){
			super("",null,MenuItemType.none);
			this.specialType = specialType;
			
			this.specialItem = makeSpecialItem();	// make child-JMenuItem
			parent.getJComponent().add(specialItem);// add child-JMenuItem to parent
			// special items are not put into the map
		}
		
		@Override
		protected JComponent getJComponent(){
			return specialItem;
		}
		
		@Override
		public String toString(){
			return "FirstMenuElement"+", "+"JMenuBar"+", with "+size()+" elements";
		}
		
		private JComponent makeSpecialItem(){
			JComponent item = null;
			
			switch(specialType){
			
			case JSeperator:
				item = new JSeparator();
				break;
				
			default:
				throw new RuntimeException("Unknown MenuSpecialType.");
			}
			
			return item;
		}
	}//class MenuSpecialElement

}//public class


