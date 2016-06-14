package model;

import java.awt.Image;

public abstract class Element {
	
	private Image image;
	private Position position;
	
	public Element(int x, int y){
		
	}
	
	public Element(Position position){
		
	}
	
	public void setImage(Image image){
		
	}
	
	public Image getImage(){
		return this.image;
	}
	
	public abstract boolean isSolide();
	
	public abstract void action();
	

	

}
