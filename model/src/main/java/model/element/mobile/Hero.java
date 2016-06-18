package model.element.mobile;

import java.awt.image.BufferedImage;

import contract.Direction;
import contract.Permeability;

public class Hero extends Mobile{
	
	private final static int ID = 0;
		
	public Hero(Direction direction, int posX, int posY, BufferedImage[] sprite){
		super(posX, posY, Permeability.HERO , sprite[0], direction, ID);
	}
	
	public void action(){
		
	}

	public void move() {
		
	}

	public boolean isThisMovePossible() {

		
		return false;
		
	}
}
