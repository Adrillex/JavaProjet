package model.element.motionless;

import java.awt.image.BufferedImage;
import contract.Permeability;
import model.element.Element;

public abstract class Motionless extends Element{

	/**The constructor MotionLess
	 * 
	 * @param posX
	 * @param posY
	 * @param permeability
	 * @param sprite
	 * @param ID
	 * @throws IOException 
	 */
	public Motionless(int posX, int posY, Permeability permeability, BufferedImage sprite, int ID){
		super(posX, posY, permeability, sprite, ID);
	}

	
}
