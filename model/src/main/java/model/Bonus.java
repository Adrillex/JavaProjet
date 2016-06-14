package model;

import java.awt.Image;

public class Bonus extends Fixe{
	
	private int x, y;
	private Image image;
	
	public Bonus(int x, int y, Image image){
		this.x = x;
		this.y = y;
		this.image = image;
	}
	
	public boolean isPickable(){
		return true;
	}
	
	public void action(){
	}
}
