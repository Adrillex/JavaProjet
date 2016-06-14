package model;

import java.awt.Image;

public class Bonus extends Fixe{
	
	private Position position;
	private Image image;
	
	public Bonus(Position position, Image image){
		this.position = position;
		this.image = image;
	}
	
	public boolean isPickable(){
		return true;
	}
	
	public void action(){
	}
}
