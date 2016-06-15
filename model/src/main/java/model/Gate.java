package model;

import java.awt.image.BufferedImage;

public class Gate extends Fixe{
	

	private boolean open;
	
	public Gate(int posX, int posY, boolean open ,  BufferedImage image){
		this.posX = posX;
		this.posY = posY;
		this.image = image;
		this.open = open;
	}
	
	public boolean isSolid(){
		return true;
	}
	
	public boolean isOpen(){
		return open;
	}
	
	public void action(){
	}
}
