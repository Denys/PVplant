package examples.snake.pictureManagement;

/** 
 * An element containing the desing (an Object) and the corresponding length reserved for image indexes.
 * 
 * @author Kristofer Schweiger
 */
class LoadElement<EnumType>{
	
	EnumType designEnum;
	int nrOfPictures;
	
	LoadElement(EnumType designEnum, int nrOfPictures){
		this.designEnum = designEnum;
		this.nrOfPictures = nrOfPictures;
	}
	
	@Override
	public String toString(){
		return designEnum +"/"+nrOfPictures;
	}
}