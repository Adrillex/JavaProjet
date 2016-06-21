package model.element.motionless;

import java.awt.image.BufferedImage;
import contract.Permeability;

public class CrystalBall extends Motionless{
	
	private final static int ID = 6;
	
	/** The constructor CrystallBall
	 * 
	 * @param posX
	 * 	Position X of the crystalBall
	 * @param posY
	 * 	Position Y of the crystalBall
	 * @param sprite
	 * 	Sprite of the crystallBall
	 */
	public CrystalBall(int posX, int posY, BufferedImage sprite)throws Exception{
		super(posX, posY, Permeability.PENETRABLE, sprite, ID);
	}
}
