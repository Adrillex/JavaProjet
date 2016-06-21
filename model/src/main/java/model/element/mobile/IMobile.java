package model.element.mobile;

import contract.Direction;

public interface IMobile {
	
	public Direction getDirection();
	public void setDirection(Direction direction);
	public void move();
	public void setPosX(int posX) throws Exception;
	public void setPosY(int posY)throws Exception;
}
