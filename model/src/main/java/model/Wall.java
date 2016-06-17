package model;

import java.awt.image.BufferedImage;

import contract.Permeability;

public class Wall extends Motionless{	
	
	public Wall(int posX, int posY, BufferedImage sprite){
		super(posX, posY, Permeability.BLOCKING, sprite);
	}
	
	public boolean isSolid(){
		return true;
	}
	
	public void action(){
	}

	@Override
	public boolean isPickable() {
		return false;
	}
}
