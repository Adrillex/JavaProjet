package model;

import java.awt.image.BufferedImage;

import contract.Direction;

public class Fireball extends Mobile{

	private  static Fireball instance = null;
	
	private Fireball(Direction direction, int posX, int posY, BufferedImage sprite){
		super(posX, posY, Permeability.KILLER, sprite,  direction);
	}
	public void move(){
		
	}

	public static Fireball getInstance(Direction direction, int posX, int posY, BufferedImage picture){
		if(Fireball.instance == null){
			instance = new Fireball(direction, posX, posY, picture);
		}
		return instance;
	}
	
	@Override
	public void action() {
		
	}
	public boolean isThisMovePossible() {
		return false;
	}
	
}
