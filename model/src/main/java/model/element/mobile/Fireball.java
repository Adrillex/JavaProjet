package model.element.mobile;

import java.awt.image.BufferedImage;
import contract.Direction;
import contract.Permeability;

public class Fireball extends Mobile{
	
	private final static int ID = 5;
	
	/** the constructor Fireball
	 * 
	 * @param direction
	 * 	Direction of the Fireball
	 * @param posX
	 * 	Position X of the Fireball
	 * @param posY
	 * 	Position Y of the fireball
	 * @param sprite 
	 * 	Actual sprite of the fireball
	 * @throws Exception
	 * 	Error in Position
	 */
	public Fireball(Direction direction, int posX, int posY, BufferedImage sprite)throws Exception{
		super(posX, posY, Permeability.KILLER, sprite,  direction, ID);
	}
}
