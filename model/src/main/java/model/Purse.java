package model;

import java.awt.Image;

public class Purse extends Fixe{
	
	private Position position;
	private Image image;
	
	public Purse(Position position, Image image){
		this.position = position;
		this.image = image;
	}
	
	public boolean isPickable(){
		return true;
	}
	
	public void action(){
	}
}
