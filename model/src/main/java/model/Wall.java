package model;

import java.awt.Image;
import java.awt.image.BufferedImage;

public class Wall extends Fixe{	
	
	public Wall(int posX, int posY, BufferedImage image){
		
		this.posX = posX;
		this.posY = posY;
		this.image = image;
	}
	
	public boolean isSolid(){
		return true;
	}
	
	public void action(){
	}
}
