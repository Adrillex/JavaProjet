package model.element.mobile;

import java.awt.image.BufferedImage;

import contract.Direction;

public class Cargyv extends Monster{
	
	private final static int ID = 2;
	
	public Cargyv(Direction direction, int posX, int posY, BufferedImage picture){
		super(direction, posX, posY, picture, ID);
		
	}
	
	public void Action(){
		
	}
}
