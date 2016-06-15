package model;

public interface IMobile {
	
	public Direction getDirection();
	public int getSpeed();
	public boolean isAlive();
	public boolean hit();
	public void move();
	public void setPosX();
	public void setPosY();
}
