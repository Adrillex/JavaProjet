package model.element.motionless;

import java.awt.image.BufferedImage;

import contract.Permeability;

public class Purse extends Motionless{
	
	protected int bonus;

	private final static int ID = 8;
	
	public Purse(int posX, int posY, BufferedImage sprite){
		super(posX, posY, Permeability.PENETRABLE, sprite, ID);
	}

	public int getBonus(){
		return bonus;
	}

}