package model.element.mobile;

import java.awt.image.BufferedImage;
import contract.Direction;
import contract.Permeability;
import model.actions.ReverseMove;

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
	 * 	@throws Exception
	 * 	Error in Position 
	 */
	public Monster(Direction direction, int posX, int posY, BufferedImage sprite, int ID)throws Exception{
		super(posX, posY, permeability , sprite, direction, ID);
	}

	/**
	 * Reverse the direction
	 */
	public void reverse(){
		this.direction = ReverseMove.reverseMove(this.direction);
	}
}
