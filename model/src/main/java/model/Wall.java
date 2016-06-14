package model;

import java.awt.Image;

public class Wall extends Fixe{
	
	private int x, y;
	private Image image;
	
	public Wall(int x, int y, Image image){
		this.x = x;
		this.y = y;
		this.image = image;
	}
	
	public boolean isSolid(){
		return true;
	}
	
	public void action(){
	}
}
