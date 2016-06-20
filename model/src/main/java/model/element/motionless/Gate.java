package model.element.motionless;

import java.awt.image.BufferedImage;

import contract.Permeability;

public class Gate extends Motionless{
	
	private final static int ID = 7;
	private boolean open;
	
	public Gate(int posX, int posY, BufferedImage[] sprite){
		super(posX, posY, Permeability.BLOCKING, sprite[0], ID);
		this.open = false;
	}
	
	public boolean isOpen(){
		return open;
	}	
}
