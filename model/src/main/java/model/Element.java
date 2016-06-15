package model;

import java.awt.image.BufferedImage;

public abstract class Element {
	
	private BufferedImage image;
	private Permeability permeability;
	private int posX, posY;
	
	public Element(int posX, int posY, Permeability permeability, BufferedImage image){
		this.posX = posX;
		this.posY = posY;
		this.permeability = permeability;
		this.image = image;
	}
	
	public void setImage(BufferedImage image){
		this.image = image;
	}
	
	public BufferedImage getImage(){
		return this.image;
	}

	public int getPosX(){
		return posX;
	}
	
	public int setPosY(){
		return posY;
	}
	
	public Permeability getPermeability(){
		return permeability;
	}
	
	public abstract void action();

}
