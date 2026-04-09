package jGridMap.view.interfaces;

import jGridMap.JGridMap.JGridMapEventListener;

import javax.swing.JComponent;

public interface PrimaryViewI {

	/**
	 * Possibility to add panels and other graphical elements at the sides of the 
	 * @param JComponent
	 * @param borderLayoutConstraint - BorderLayout.PAGE_START, BorderLayout.PAGE_END, BorderLayout.WEST, BorderLayout.EAST
	 * @throws IllegalArgumentException, if component is set at Center
	 */
	public void setJComponent(JComponent panel, String borderLayoutConstraint);

	/**
	 * Adds event listener to the GridMap.
	 * (Method for easier access)
	 * @param l
	 */
	public void addJGridMapEventListener(JGridMapEventListener l);
	
	/**
	 * Repaint the grid within the view.
	 * (Method for easier access)
	 */
	public void repaintGrid();

	/**
	 * Normally default repaint method from Java GUI Component.
	 */
	public void repaint();
}