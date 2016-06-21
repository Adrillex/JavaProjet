package model.element.motionless;

import java.awt.image.BufferedImage;
import contract.Direction;
import contract.Permeability;

public class Wall extends Motionless{	
	
	private final static int ID = 9;
	
	/**The constructor Wall
	 * 
	 * @param posX
	 * @param posY
	 * @param sprite
	 * @throws IOException 
	 */
	public Wall(int posX, int posY, BufferedImage sprite){
		super(posX, posY, Permeability.BLOCKING, sprite, ID);
	}

	public void setDirection(Direction direction) {
	}
}
