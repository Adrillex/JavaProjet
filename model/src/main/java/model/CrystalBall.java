package model;

import java.awt.image.BufferedImage;

import contract.Permeability;

public class CrystalBall extends Motionless{
	
	private final int ID = 6;
	
	public CrystalBall(int posX, int posY, BufferedImage sprite){
		super(posX, posY, Permeability.PENETRABLE, sprite);
	}
	
	public boolean isPickable(){
		return true;
	}
	
	public void Action(){
	}
}
