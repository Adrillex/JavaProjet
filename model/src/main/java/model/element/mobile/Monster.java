package model.element.mobile;

import java.awt.image.BufferedImage;

import contract.Direction;
import contract.Permeability;

public class Monster extends Mobile{
	
	static Permeability permeability = Permeability.KILLING;
	
	public Monster(Direction direction, int posX, int posY, BufferedImage sprite, int ID){
		super(posX, posY, permeability , sprite, direction, ID);
	}
		
	public void action(){
		
	}
	
	public boolean isThisMovePossible() {
		
		return false;
	}
	
	

	public void move() {		
	}

	public void Action() {
		// TODO Auto-generated method stub
		
	}

}
