package model;

import java.awt.Image;

public abstract class Element {
	
	private Image image;
	private Position position;
	private Permeability permeability;
	
	public Element(int x, int y, Permeability permeability){
		
	}
	
	public Element(Position position, Permeability permeability){
		
	}
	
	public void setImage(Image image){
		
	}
	
	public Image getImage(){
		return this.image;
	}
		
	public abstract void action();
	

	

}
