package model;

import java.awt.image.BufferedImage;

public class Gate extends Fixe{
	

	private boolean open;
	
	public Gate(int posX, int posY, boolean open ,  BufferedImage sprite){
		this.posX = posX;
		this.posY = posY;
		this.sprite = sprite;
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
