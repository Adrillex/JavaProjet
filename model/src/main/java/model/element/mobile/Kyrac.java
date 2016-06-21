package model.element.mobile;

import java.awt.image.BufferedImage;
import contract.Direction;

public class Kyrac extends Monster{
	
	private final static int ID = 3;

	
	/**the constructor Kyrac
	 * 
	 * @param direction
	 * 	Direction of the monster
	 * @param posX
	 * 	Position of Kyrac
	 * @param posY
	 * 	Position Y of Kyrac
	 * @param sprite
	 * 	sprite of Kyrac
	 */
	public Kyrac(Direction direction, int posX, int posY, BufferedImage sprite){
		super(direction, posX, posY, sprite, ID);
	}
	
}
