package model.actions;

import contract.Direction;

public class ReverseMove {
	
	/** Reverse the direction of a mobile
	 * 
	 * @param direction
	 * 	the direction of the mobile
	 * @return 
	 * 	the new direction
	 */
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
		default:
			break;
		}
		return null;
	}
}
