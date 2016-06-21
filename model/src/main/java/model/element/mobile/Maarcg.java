package model.element.mobile;

import java.awt.image.BufferedImage;
import contract.Direction;

public class Maarcg extends Monster{

	private final static int ID = 4;
	
	/**the constructor Maarcg
	 * 
	 * @param direction
	 * 	Direction of the monster
	 * @param posX
	 * 	Position of Maarcg
	 * @param posY
	 * 	Position Y of Maarcg
	 * @param sprite
	 * 	sprite of Maarcg
	 * 	@throws Exception
	 * 	Error in Position
	 */
	public Maarcg(Direction direction, int posX, int posY, BufferedImage sprite)throws Exception{
		super(direction, posX, posY, sprite, ID);
		
	}
}
