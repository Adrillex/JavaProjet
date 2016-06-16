package model;

import java.awt.image.BufferedImage;

import javax.swing.text.Position;

public class Fireball extends Mobile{
	private int SPEED;
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
	
}
