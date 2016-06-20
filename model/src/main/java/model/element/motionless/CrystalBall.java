package model.element.motionless;

import java.awt.image.BufferedImage;

import contract.Direction;
import contract.Permeability;

public class CrystalBall extends Motionless{
	
	private final static int ID = 6;
	
	public CrystalBall(int posX, int posY, BufferedImage sprite){
		super(posX, posY, Permeability.PENETRABLE, sprite, ID);
	}

	public void setDirection(Direction direction) {		
	}
}
