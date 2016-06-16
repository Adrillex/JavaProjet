package model;

import java.awt.image.BufferedImage;

import contract.Direction;

public class Monster extends Mobile{
	
	static Permeability permeability = Permeability.KILLING;
	
	public Monster(Direction direction, int posX, int posY, BufferedImage sprite){
		super(posX, posY, permeability , sprite, direction);
	}
	public void move(){
		
	}

	public boolean isAlive(){
		return false;
		
	}
	public void action(){
		
	}
	public boolean isThisMovePossible() {
		// TODO Auto-generated method stub
		return false;
	}

}
