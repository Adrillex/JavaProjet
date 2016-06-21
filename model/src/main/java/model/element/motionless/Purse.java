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
	 * @param posY
	 * @param sprite
	 * @param bonus
	 * @throws IOException 
	 */
	public Purse(int posX, int posY, BufferedImage sprite, Bonus bonus){
		super(posX, posY, Permeability.PENETRABLE, sprite, ID);
		this.bonus = bonus;
		
	}

	public void setDirection(Direction direction) {	
	}
}