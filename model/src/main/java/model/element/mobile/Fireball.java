package model.element.mobile;

import java.awt.image.BufferedImage;

import contract.Direction;
import contract.Permeability;

public class Fireball extends Mobile{
	
	private final static int ID = 5;

	private  static Fireball instance = null;
	
	private Fireball(Direction direction, int posX, int posY, BufferedImage sprite){
		super(posX, posY, Permeability.KILLER, sprite,  direction, ID);
	}
	public void move(){
		
	}

	public static Fireball getInstance(Direction direction, int posX, int posY, BufferedImage sprite){
		if(Fireball.instance == null){
			instance = new Fireball(direction, posX, posY, sprite);
		}
		return instance;
	}
	
	public boolean isThisMovePossible() {
		return false;
	}
	public void Action() {
		// TODO Auto-generated method stub
		
	}
	
}
