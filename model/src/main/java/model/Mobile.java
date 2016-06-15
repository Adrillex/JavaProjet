package model;

public class Mobile implements IMobile{
	
	private int x;
	private int y;

	public Direction getDirection() {
		return Direction;
	}

	public int getSpeed() {
		return 0;
	}

	public boolean isAlive() {
		return false;
	}
	
	public void setPosX( int PosX){
		
		x = PosX;
	}
	
	public void setPosY( int PosY ){
		
		y = PosY;
	}

	public boolean hit() {
		return false;
	}

	public void move() {
	}
	
}
