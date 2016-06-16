package model;

public interface IMobile {
	
	public Direction getDirection();
	public void setDirection(Direction direction);
	public int getSpeed();
	public void move();
	public void setPosX(int posX);
	public void setPosY(int posY);
}
