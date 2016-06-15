package model;

import java.awt.image.BufferedImage;

public abstract class Element {
	
<<<<<<< HEAD
	protected BufferedImage picture;
	protected Permeability permeability;
	protected int posX, posY;
=======
	protected BufferedImage image;
	private Permeability permeability;
	protected int posX;
	private int posY;
>>>>>>> b1722092194156b34e6fa5d4f9c96c5028108ea3
	
	public Element(int posX, int posY, Permeability permeability, BufferedImage picture){
		this.posX = posX;
		this.posY = posY;
		this.permeability = permeability;
		this.picture = picture;
	}
	
	public void setPicture(BufferedImage picture){
		this.picture = picture;
	}
	
	public BufferedImage getPicture(){
		return this.picture;
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
