package model;

import java.awt.image.BufferedImage;

public class CrystalBall extends Motionless{
	
	
	public CrystalBall(int posX, int posY, BufferedImage sprite){
		super(posX, posY, Permeability.PENETRABLE, sprite);
	}
	
	public boolean isPickable(){
		return true;
	}
	
	public void Action(){
	}
}
