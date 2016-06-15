package model;

import java.awt.image.BufferedImage;

public class CrystalBall extends Fixe{
	
	
	public CrystalBall(int posX, int posY, BufferedImage image){
		this.posX = posX;
		this.posY = posY;
		this.image = image;
	}
	
	public boolean isPickable(){
		return true;
	}
	
	public void Action(){
	}
}
