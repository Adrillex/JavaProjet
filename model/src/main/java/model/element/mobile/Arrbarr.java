package model.element.mobile;

import java.awt.image.BufferedImage;
import contract.Direction;

public class Arrbarr extends Monster{
	
	private final static int ID = 1;
	
	/**the constructor Arrbarr
	 * 
	 * @param direction
	 * 	Direction of the monster
	 * @param posX
	 * 	Position of Arrbarr
	 * @param posY
	 * 	Position Y of Arrbarr
	 * @param sprite
	 * 	sprite of Arrbarr
	 */
	
	public Arrbarr(Direction direction, int posX, int posY, BufferedImage sprite)throws Exception{
		super(direction, posX, posY, sprite, ID);
		
	}
	
}
