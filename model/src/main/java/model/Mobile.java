package model;

import java.awt.image.BufferedImage;

public abstract class Mobile extends Element implements IMobile{
	
	protected Direction direction;
	protected int speed;

	public Mobile(int posX, int posY, Permeability permeability, BufferedImage picture, Direction direction) {
		super(posX, posY, permeability, picture);
		this.direction = direction;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public int getSpeed() {
		return this.speed;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

}
