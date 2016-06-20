package model.element.mobile;

import java.awt.image.BufferedImage;

import contract.Direction;
import contract.Permeability;

public class Fireball extends Mobile{
	
	private final static int ID = 5;
	
	/** the constructor Fireball
	 * 
	 * @param direction
	 * @param posX
	 * @param posY
	 * @param sprite
	 */
	public Fireball(Direction direction, int posX, int posY, BufferedImage sprite){
		super(posX, posY, Permeability.KILLER, sprite,  direction, ID);
	}
}
