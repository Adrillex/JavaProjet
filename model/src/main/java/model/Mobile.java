	package model;

import java.awt.image.BufferedImage;

import contract.Direction;


public abstract class Mobile extends Element implements IMobile{
	
	protected Direction direction;
	
	public Mobile(int posX, int posY, Permeability permeability, BufferedImage sprite, Direction direction) {
		super(posX, posY, permeability, sprite);
		this.direction = direction;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

}
