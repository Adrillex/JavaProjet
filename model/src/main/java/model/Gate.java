package model;

import java.awt.Image;

public class Gate extends Fixe{
	
	private Position position;
	private Image image;
	private boolean open;
	
	public Gate(Position position, Image image){
		this.position = position;
		this.image = image;
	}
	
	public Gate(int posX, int posY,boolean open ,  Image image){
		this.
		this.image = image;
		this.open = o
	}
	
	public boolean isSolid(){
		return true;
	}
	
	public boolean isOpen(){
		return open;
	}
	
	public void action(){
	}
}
