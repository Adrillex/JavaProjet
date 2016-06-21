package model.element.motionless;

import java.awt.image.BufferedImage;
import contract.Direction;
import contract.Permeability;
import model.element.Bonus;

public class Purse extends Motionless{
	
	public Bonus bonus;

	private final static int ID = 8;
	
	/**The constructor Purse
	 * 
	 * @param posX
	 * 	The position X of the purse
	 * @param posY
	 * 	The position Y of the purse
	 * @param sprite
	 * 	The sprite of the purse
	 * @param bonus
	 * 	The bonus of the purse
	 */
	public Purse(int posX, int posY, BufferedImage sprite, Bonus bonus)throws Exception{
		super(posX, posY, Permeability.PENETRABLE, sprite, ID);
		this.bonus = bonus;
		
	}
}