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
		System.out.println("f");

		switch (direction) {
		case UP:
			return Direction.DOWN;
		case DOWN:
			return Direction.UP;
		case LEFT:
			return Direction.RIGHT;
		case RIGHT:
			return Direction.LEFT;
		case UPPER_LEFT:
			return Direction.BOTTOM_RIGHT;
		case UPPER_RIGHT:
			return Direction.BOTTOM_LEFT;
		case BOTTOM_LEFT:
			return Direction.UPPER_RIGHT;
		case BOTTOM_RIGHT:
			return Direction.UPPER_LEFT;
		default:
			break;
		}
		return null;
	}
}
