package model;

import java.awt.image.BufferedImage;

import contract.Direction;

public class Kyrac extends Monster{
	
	private final static int ID = 3;

	public Kyrac(Direction direction, int posX, int posY, BufferedImage sprite){
		super(direction, posX, posY, sprite, ID);
	}
	
	public void Action(){
		
	}
	
}
