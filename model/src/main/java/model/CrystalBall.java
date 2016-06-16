package model;

import java.awt.image.BufferedImage;

public class CrystalBall extends Fixe{
	
	
	public CrystalBall(int posX, int posY, BufferedImage sprite){
		this.posX = posX;
		this.posY = posY;
		this.sprite = sprite;
	}
	
	public boolean isPickable(){
		return true;
	}
	
	public void Action(){
	}
}
