package model;

import java.awt.image.BufferedImage;

public class Monster extends Mobile{
	
	static Permeability permeability = Permeability.KILLING;
	
	public Monster(Direction direction, int posX, int posY, BufferedImage picture){
		super(posX, posY, permeability , picture, direction);
	}
	public void move(){
		
	}

	public boolean isAlive(){
		return false;
		
	}
	public void action(){
		
	}

}
