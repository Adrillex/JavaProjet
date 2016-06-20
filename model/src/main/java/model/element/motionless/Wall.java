package model.element.motionless;

import java.awt.image.BufferedImage;

import contract.Permeability;

public class Wall extends Motionless{	
	
	private final static int ID = 9;
	
	public Wall(int posX, int posY, BufferedImage sprite){
		super(posX, posY, Permeability.BLOCKING, sprite, ID);
	}

	public void Action() {
		// TODO Auto-generated method stub
		
	}
	

	
}
