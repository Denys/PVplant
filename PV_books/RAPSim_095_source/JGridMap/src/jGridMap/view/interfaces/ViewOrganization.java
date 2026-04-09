package jGridMap.view.interfaces;

public interface ViewOrganization {
	
	/**
	 * Deletes additional management data in the view,
	 * used by controller functions.
	 * 
	 * @return true if any data was deleted and 
	 * 		"addControl"-functions should not be used any more.
	 */
	public boolean deleteViewControlManagmentData();
	
	
}
