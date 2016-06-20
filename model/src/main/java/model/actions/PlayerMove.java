package model.actions;

import contract.Direction;
import contract.IElement;
import model.Stage;
import model.element.mobile.Hero;

public class PlayerMove {
	
	/** 
	 * the method playerDirection
	 * Update the direction of the player and try to execute the associated movement
	 * @param direction
	 */
	public static void playerDirection(Direction direction){
		for(Hero object : Stage.rLorannList){
			object.setDirection(direction);
			object.setMoveSprite();
		}
		Move();
	}
	/**
	 * The method move.
	 * Move if allowed by the permeability of the element on the position. Or die if it's a monster.
 	*/
	public static void Move(){
		if (Stage.rLorannList.isEmpty() == false) {
			for(Hero object : Stage.rLorannList){
				IElement goalPosition = Movement.getElementCoordinates(object, "move", Stage.elements);
				if(goalPosition != null){
					switch(goalPosition.getPermeability()){
					case PENETRABLE: Movement.move(object, goalPosition.getPosX(), goalPosition.getPosY());
					Stage.elements.remove(goalPosition);
					if(Stage.purseList.contains(goalPosition)){	
						
					}
					goalPosition.setExisting(false);
					
						break;
					case BLOCKING:
						break;
					case KILLING:
						Stage.rLorannList.get(0).setExisting(false);
						Stage.elements.remove(Stage.elements.indexOf(Stage.rLorannList.get(0)));
						Stage.rLorannList.remove(0);
						break;
					case KILLER: Stage.fireball.setExisting(false);
						break;
					default: Movement.move(object, goalPosition.getPosX(), goalPosition.getPosY());
						break;
					}
				}
			}
		}
	}

}
