package model;

import java.awt.image.BufferedImage;

public class Bonus extends Fixe{
	
	private int bonus;
	
	public Bonus(int posX, int posY, BufferedImage sprite){
		
		this.posX = posX;
		this.posY = posY;
		this.sprite = sprite;
	}
	
	public Boolean isPickeable(){
		
		return false;
	}
	
	public void action(){
		
	}
	
	public int getBonus(){
		
		return bonus;
	}
	
	
}
