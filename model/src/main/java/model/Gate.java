package model;

import java.awt.Image;

public class Gate extends Fixe{
	
	private int x, y;
	private Image image;
	
	public Gate(int x, int y, Image image){
		this.x = x;
		this.y = y;
		this.image = image;
	}
	
	public boolean isSolid(){
		return true;
	}
	
	public boolean isOpen(){
		return false;
	}
	
	public void action(){
	}
}
