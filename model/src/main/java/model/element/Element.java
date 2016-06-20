package model.element;

import java.awt.image.BufferedImage;

import contract.IElement;
import contract.Permeability;

public abstract class Element implements IElement{
	
	protected BufferedImage sprite;
	protected Permeability permeability;
	protected int posX, posY;
	protected final int ID;
	protected boolean existing = true;

	public Element(int posX, int posY, Permeability permeability, BufferedImage sprite, int ID){
		this.posX = posX;
		this.posY = posY;
		this.permeability = permeability;
		this.sprite = sprite;
		this.ID = ID;
	}
	
	public boolean getState(){
		return existing;
	}
	
	public void setExisting(){
		this.existing = false;
	}
	
	public int getID(){
		return ID;
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
	
	public int getPosY(){
		return posY;
	}
	
	public Permeability getPermeability(){
		return permeability;
	}
	
	public void setPosX(int posX) {
		this.posX = posX;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

}
