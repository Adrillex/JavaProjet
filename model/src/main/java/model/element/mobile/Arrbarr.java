package model.element.mobile;

import java.awt.image.BufferedImage;

import contract.Direction;

public class Arrbarr extends Monster{
	
	private final static int ID = 1;
	
	/**the constructor Arrbarr
	 * 
	 * @param direction
	 * @param posX
	 * @param posY
	 * @param picture
	 */
	
	public Arrbarr(Direction direction, int posX, int posY, BufferedImage picture){
		super(direction, posX, posY, picture, ID);
		
	}
	
}
