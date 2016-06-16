package model;

import java.awt.image.BufferedImage;

public class Gate extends Motionless{
	

	private boolean open;
	
	public Gate(int posX, int posY, boolean open ,  BufferedImage sprite){
		super(posX, posY, Permeability.BLOCKING, sprite);
		this.open = false;
	}
	
	public boolean isSolid(){
		return true;
	}
	
	public boolean isOpen(){
		return open;
	}
	
	public void action(){
	}

	@Override
	public boolean isPickable() {
		return false;
	}
}
