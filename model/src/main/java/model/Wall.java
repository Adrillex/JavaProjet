package model;

import java.awt.Image;

public class Wall extends Fixe{
	
	private Position position;
	private Image image;
	
	public Wall(Position position, Image image){
		this.position = position;
		this.image = image;
	}
	
	public boolean isSolid(){
		return true;
	}
	
	public void action(){
	}
}
