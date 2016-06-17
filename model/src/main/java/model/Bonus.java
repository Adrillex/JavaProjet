package model;

import java.awt.image.BufferedImage;

import contract.Permeability;

public class Bonus extends Motionless{
	
	protected int bonus;
	
	public Bonus(int posX, int posY, BufferedImage sprite){
		super(posX, posY, Permeability.PENETRABLE, sprite);
	}
	
	public void action(){
		
	}
	
	public int getBonus(){
		return bonus;
	}

	@Override
	public boolean isPickable() {
		return true;
	}
	
	
}
