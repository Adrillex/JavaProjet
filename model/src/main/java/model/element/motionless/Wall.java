package model.element.motionless;

import java.awt.image.BufferedImage;
import contract.Permeability;

public class Wall extends Motionless{	
	
	private final static int ID = 9;
	
	/**The constructor Wall
	 * 
	 * @param posX
	 * 	The position X of the wall
	 * @param posY
	 * 	The position Y of the wall
	 * @param sprite
	 * 	The sprite of the wall
	 * 
	 *  @throws Exception
	 * 		Error in position
	 */
	public Wall(int posX, int posY, BufferedImage sprite)throws Exception{
		super(posX, posY, Permeability.BLOCKING, sprite, ID);
	}
}
