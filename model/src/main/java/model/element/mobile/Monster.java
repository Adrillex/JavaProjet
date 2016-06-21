package model.element.mobile;

import java.awt.image.BufferedImage;
import contract.Direction;
import contract.Permeability;

public class Monster extends Mobile{
	
	static Permeability permeability = Permeability.KILLING;
	
	/** the constructor Monster 
	 * 
	 * @param direction
	 * 	Direction of the monster
	 * @param posX
	 * 	Position X of the monster
	 * @param posY
	 * 	Position Y of the monster
	 * @param sprite
	 * 	Sprite of the monster
	 * @param ID
	 * 	ID of the monster 
	 */
	public Monster(Direction direction, int posX, int posY, BufferedImage sprite, int ID){
		super(posX, posY, permeability , sprite, direction, ID);
	}

	/**
	 * Reverse the direction
	 */
	public void reverse(){
		switch (direction) {
		case UP:
			this.direction = Direction.DOWN;
			break;
		case DOWN:
			this.direction = Direction.UP;
			break;
		case LEFT:
			this.direction = Direction.RIGHT;
			break;
		case RIGHT:
			this.direction = Direction.LEFT;
			break;

		default:
			break;
		}
	}
}
