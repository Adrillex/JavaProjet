package model;

import java.awt.image.BufferedImage;

import contract.Direction;
import contract.Permeability;

public class Hero extends Mobile{
		
	public Hero(Direction direction, int posX, int posY, BufferedImage sprite){
		super(posX, posY, Permeability.HERO , sprite, direction);
	}
	
	public void action(){
		
	}

	public void move() {
		
	}

	public boolean isThisMovePossible() {

		
		return false;
		
	}
}
