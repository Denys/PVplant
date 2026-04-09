package jGridMap.view;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileFilter;

public class FileChooser {
	
	public enum DialogType{
		Save("Save"),
		SaveAs("Save as"),
		Open("Open"),
		New("Create"),
		;
		
		private String title;
		/** full constructor, with specified title **/
		DialogType(String title){
			this.title = title;
		}
		/** empty Constructor **/
		DialogType(){
			this.title = super.name();
		}
		
		@Override
		public String toString(){
			return title;
		}
	};
	
	public File defaultFile = new File(".");
	public boolean lastSelectedFileIsDefault = true;
	
	private File selectedFile;
	private int selectState;
	private JFrame jFrame;
	
	
	/**
	 * Constructor
	 * @param jFrame - frame for positioning window
	 */
	public FileChooser(JFrame jFrame){
		this.jFrame = jFrame;
	}
	
	/**
	 * Simplified method, see full method for documentation.
	 */
	public File chooseFile(DialogType type, FileFilter filter){
		return chooseFile(type, filter, null);
	}
	
	/**
	 * Full Method for invoking JFileChooser.
	 * @param type		- type of dialog (e.g. for title)
	 * @param filter	- file filter to apply
	 * @param extension - Extension including dot. Will be added if (I) not null and (II) not already part of file name
	 * @return 
	 * 		selected file OR 
	 * 		null if no file was selected
	 */
	public File chooseFile(DialogType type, FileFilter filter, String extension){
		
		JFileChooser fc = new JFileChooser();
		fc.setCurrentDirectory(defaultFile);
		fc.setDialogTitle(type.toString());
		///fc.setSelectedFile(GlobalVariables.defaultFile);
		fc.setFileFilter(filter);

		selectState = showDialog(fc, type);

		boolean approve = selectState==JFileChooser.APPROVE_OPTION;

		selectedFile = null;
		if(approve){
			selectedFile = fc.getSelectedFile();	// store selected file
			selectedFile = ensureFileExtension(selectedFile,extension);

			if(lastSelectedFileIsDefault){			// set last selected file as default
				defaultFile = selectedFile;				// -
			}
		}

		return selectedFile;	// return selected file or null
	}
	
	/**
	 * @param file
	 * @param extension
	 * @return file with extension iff extension!=null and !file.endsWith(extension)
	 * 		returns null if file was null.
	 */
	public static File ensureFileExtension(File file, String extension){
		
		if(extension==null || file==null)
			return file;
		
		String fileStr = file.getPath();	
		
		if(!fileStr.toLowerCase().endsWith(extension.toLowerCase())){		// compare in equal case, but keep original case after compare.
			file = new File(fileStr + extension);
		}
		
		return file;
	}
	
	/**
	 * @param type
	 * @return select state of JFileChooser
	 * 	JFileChooser.SAVE_DIALOG OR
	 * 	JFileChooser.OPEN_DIALOG OR
	 * 	JFileChooser.CUSTOM_DIALOG
	 */
	private int showDialog(JFileChooser fc, DialogType type){
		
		switch(type){
		case SaveAs:
			fc.setDialogType(JFileChooser.SAVE_DIALOG);
			return fc.showSaveDialog(jFrame);
			
		case Open:
			fc.setDialogType(JFileChooser.OPEN_DIALOG);
			return fc.showOpenDialog(jFrame);
			
		default:
			fc.setDialogType(JFileChooser.CUSTOM_DIALOG);
			return fc.showOpenDialog(jFrame);
		}
		
	}
	
	/**
	 * @return selected file at last chooseFile(...) call
	 */
	public File getSelectedFile(){
		return selectedFile;
	}
	
	/**
	 * @return state of the file chooser on popdown: 
	 * 	JFileChooser.CANCEL_OPTION OR 
	 * 	JFileChooser.APPROVE_OPTION OR
	 * 	JFileChooser.ERROR_OPTION if an error occurs or the dialog is dismissed 
	 */
	public int getSelectState(){
		return selectState;
	}
	
}
