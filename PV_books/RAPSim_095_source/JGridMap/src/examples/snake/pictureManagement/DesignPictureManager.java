package examples.snake.pictureManagement;

import java.util.LinkedList;

/**
 * This class is intended for image/index management with different designs for one application.
 * 
 * Each design has a corresponding Enum (or Object) and a defined number of images.
 * Loaded designs are registered at runtime, e.g.:
 * 	1. int index = getStartIndex(designEnum)
 * 	2. *load with index*
 * 	3. set(designEnum, length)
 * 
 * The number of images can NOT be changed during runtime (would result in shifting of indices)
 * 
 * @author Kristofer Schweiger
 */
public class DesignPictureManager<EnumType>{
	
	public int startOffset;
	private LinkedList< LoadElement<EnumType> > list = new LinkedList< LoadElement<EnumType> >();
	
	/**
	 * 
	 * @param startOffset - the 
	 * @param values
	 */
	public DesignPictureManager(int startOffset){
		this.startOffset = startOffset;
	}
	
	/**
	 * See set(EnumType, int)
	 */
	public int set(EnumType designEnum, int startIndex, int lastIndex){
		int length = lastIndex-startIndex+1;
		return set(designEnum, length);
	}
	/**
	 * Set a new element.
	 * @param designEnum 		 - object used for referencing to the design.
	 * @param nrOfImages     - length. Once set do not set a higher length than before!
	 * @return	if enum existed: length for the Enum. New length must not be bigger and will be ignored.
	 * 					if enum did nit exist: -1
	 * @throws TooLongException if new length is longer than old length.
	 */
	public int set(EnumType designEnum, int nrOfImages) throws TooLongException {
		assert nrOfImages >= 0;
		
		for(int i=0; i<list.size(); i++){
			
			LoadElement<EnumType> e = list.get(i);
			if(e.designEnum == designEnum){
				int old = e.nrOfPictures;
				if(nrOfImages > old)
					throw new TooLongException("New length is bigger than old length. Not allowed.");
				
				System.out.println("> Set old design: "+ e);
				return old;
			}
		}
		
		LoadElement<EnumType> e = new LoadElement<EnumType>(designEnum, nrOfImages);
		list.add(e);
		System.out.println("> Set new design: "+ e);
		return -1;
	}
	
	/**
	 * Get the start index of the Enum (for picture loading).
	 * @param designEnum
	 * @return 	if found: the start index for the already loaded Design
	 * 					if not found: new start index (greater than biggest index before)
	 */
	public int getStartIndex(EnumType designEnum){
		
		int startIndex = startOffset;
		
		for(int i=0; i<list.size(); i++){
			
			LoadElement<EnumType> e = list.get(i);
			if(e.designEnum == designEnum){
				return startIndex;
			}
			startIndex += e.nrOfPictures;
		}
		
		return startIndex;
	}
	
	/**
	 * Get the number of images reserved for the Enum/Object (for picture loading).
	 * @param designEnum
	 * @return 	if found: length for the already loaded Design
	 * 					if not found: -1
	 */
	public int getNrOfImages(EnumType designEnum){
		
		for(int i=0; i<list.size(); i++){
			
			LoadElement<EnumType> e = list.get(i);
			if(e.designEnum == designEnum){
				return e.nrOfPictures;
			}
		}
		
		return -1;
	}
	
	
	/**
	 * @param designEnum
	 * @return true if designEnum is already registered.
	 */
	public boolean contains(EnumType designEnum){
		
		for(int i=0; i<list.size(); i++){
			LoadElement<EnumType> e = list.get(i);
			if(e.designEnum == designEnum){
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString(){
		return this.getClass().getSimpleName() + " with " + list.size() +" designs";
	}
}