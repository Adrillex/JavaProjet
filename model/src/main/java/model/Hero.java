package model;

import java.awt.image.BufferedImage;

public class Hero extends Mobile{
	
	private final int SPEED = 2;
	
	public Hero(Direction direction, int posX, int posY, BufferedImage sprite){
		super(posX, posY, Permeability.BLOCKING , sprite, direction);
	}
	
	public boolean isAlive(){
		return true;
	}
	
	public boolean hit(){
		return false;
	}
	
	public void action(){
		
	}

	public void move() {
		
	}
}
