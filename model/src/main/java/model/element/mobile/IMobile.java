package model.element.mobile;

import contract.Direction;

public interface IMobile {
	
	public Direction getDirection();
	public void setDirection(Direction direction);
	public void move();
	public void setPosX(int posX);
	public void setPosY(int posY);
	public boolean isThisMovePossible();
	public void Action();
}
