package model.actions;

import contract.Direction;

public class ReverseMove {
	
	public static Direction reverseMove(Direction direction){
		switch (direction) {
		case UP:
			return Direction.DOWN;

		case DOWN:
			return Direction.UP;
			
		case LEFT:
			return Direction.RIGHT;

		case RIGHT:
			return Direction.LEFT;
		}
		return null;
	}
}
