package model.element.motionless;

import java.awt.image.BufferedImage;
import contract.Permeability;
import model.element.Element;

public abstract class Motionless extends Element{

	/**The constructor MotionLess
	 * 
	 * @param posX
	 * 	The position X of the motionless element
	 * @param posY
	 * 	The position Y of the motionless element
	 * @param permeability
	 * 	The permeability type of the motionless element
	 * @param sprite
	 * 	The sprite of the motionless element
	 * @param ID
	 * 	The id of the motionless element
	 */
	public Motionless(int posX, int posY, Permeability permeability, BufferedImage sprite, int ID)throws Exception{
		super(posX, posY, permeability, sprite, ID);
	}

	
}
