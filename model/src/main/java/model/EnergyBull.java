package model;

import java.awt.Image;

public class EnergyBull {
	
	private Position position;
	private Image image;
	
	public EnergyBull(Position position, Image image){
		this.position = position;
		this.image = image;
	}
	
	public boolean isPickable(){
		return true;
	}
	
	public void action(){
	}
}
