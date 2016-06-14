package model;

import java.awt.Image;

public class CrystalBall extends Fixe{
	
	private Position position;
	private Image image;
	
	public CrystalBall(Position position, Image image){
		this.position = position;
		this.image = image;
	}
	
	public boolean isPickable(){
		return true;
	}
	
	public void Action(){
	}
}
