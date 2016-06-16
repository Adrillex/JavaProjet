package model;


import java.awt.image.BufferedImage;

public class Purse extends Bonus{
	
	private final int bonus = 500; 
	
	public Purse(int posX, int posY, BufferedImage sprite){
		super(posX, posY, sprite);
	}
}
	
