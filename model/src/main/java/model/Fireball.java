package model;

import java.awt.image.BufferedImage;

import javax.swing.text.Position;

public class Fireball extends Mobile{
	private int SPEED;
	private final Permeability permeability = Permeability.KILLER;
	private  static Fireball instance = null;
	
	private Fireball(Direction direction, int posX, int posY, BufferedImage picture){
		super(direction, posX, posY, picture);
	}
	public void move(){
		
	}

	public static Fireball getInstance(Direction direction, int posX, int posY, BufferedImage picture){
		if(Fireball.instance == null){
			instance = new Fireball(direction,posX, posY, picture)
		}
	}
	
	public boolean isAlive() {
		return false;
	}
	@Override
	public void action() {
		
	}
	
}
