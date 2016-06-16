package model;

import java.awt.image.BufferedImage;

import contract.Direction;

public class Hero extends Mobile{
		
	public Hero(Direction direction, int posX, int posY, BufferedImage sprite){
		super(posX, posY, Permeability.BLOCKING , sprite, direction);
	}
	
	public void action(){
		
	}

	public void move() {
		
	}

	public boolean isThisMovePossible() {
		int x,y;
		
	}
}
