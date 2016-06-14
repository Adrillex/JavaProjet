package model;

import java.awt.Image;

public class Gate extends Fixe{
	
	private Position position;
	private Image image;
	
	public Gate(Position position, Image image){
		thi.position = position;
		this.image = image;
	}
	
	public boolean isSolid(){
		return true;
	}
	
	public boolean isOpen(){
		return false;
	}
	
	public void action(){
	}
}
