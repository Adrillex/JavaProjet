package model;

import java.awt.image.BufferedImage;

import contract.IElement;

public abstract class Element implements IElement{
	
	protected BufferedImage sprite;
	protected Permeability permeability;
	protected int posX, posY;

	public Element(int posX, int posY, Permeability permeability, BufferedImage sprite){
		this.posX = posX;
		this.posY = posY;
		this.permeability = permeability;
		this.sprite = sprite;
	}
	
	public void setSprite(BufferedImage sprite){
		this.sprite = sprite;
	}
	
	public BufferedImage getSprite(){
		return this.sprite;
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
