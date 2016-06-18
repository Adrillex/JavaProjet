package model.element.mobile;

import java.awt.image.BufferedImage;

import contract.Direction;

public class Maarcg extends Monster{

	private final static int ID = 4;
	
	public Maarcg(Direction direction, int posX, int posY, BufferedImage sprite){
		super(direction, posX, posY, sprite, ID);
		
	}
	
	public void Action(){
		
	}
}
