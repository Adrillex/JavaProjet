package model;

import java.awt.image.BufferedImage;

public class Wall extends Motionless{	
	
	public Wall(int posX, int posY, BufferedImage sprite){
		super(posX, posY, Permeability.PENETRABLE, sprite);
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
