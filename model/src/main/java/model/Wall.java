package model;

import java.awt.Image;
import java.awt.image.BufferedImage;

public class Wall extends Fixe{	
	
	public Wall(int posX, int posY, BufferedImage sprite){
		
		this.posX = posX;
		this.posY = posY;
		this.sprite = sprite;
	}
	
	public boolean isSolid(){
		return true;
	}
	
	public void action(){
	}
}
