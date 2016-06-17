package model;

import java.awt.image.BufferedImage;

import contract.Permeability;

public abstract class Motionless extends Element implements IMotionless{

	public Motionless(int posX, int posY, Permeability permeability, BufferedImage sprite) {
		super(posX, posY, permeability, sprite);
	}

	public abstract boolean isPickable();

	@Override
	public void action() {
		// TODO Auto-generated method stub
		
	}
	
	
}
