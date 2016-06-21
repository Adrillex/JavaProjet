package model.actions;

import contract.IElement;
import model.Stage;

public class FireballMove {
	
	
	/**
	 * Manage the movements of the fireball
	 */
	public static void move(){
		IElement goalPosition = Movement.getElementCoordinates(Stage.fireball, "move", Stage.elements);
		if(goalPosition != null){
			switch(goalPosition.getPermeability()){
				case PENETRABLE: 
					Stage.fireball.setDirection(ReverseMove.reverseMove(Stage.fireball.getDirection()));
					break;
					
				case BLOCKING:
					Stage.fireball.setDirection(ReverseMove.reverseMove(Stage.fireball.getDirection()));
					break;
					
				case KILLING:
					goalPosition.setExisting(false);
					Stage.monsterList.remove(goalPosition);
					Stage.elements.remove(goalPosition);
					break;
					
				case HERO: 
					Stage.fireball.setExisting(false);
			default:
				break;
				}
		}
	}
}
