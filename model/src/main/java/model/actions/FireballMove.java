package model.actions;

import contract.IElement;
import model.Stage;

public class FireballMove {
	
	
	/**
	 * Manage the movements of the fireball
	 * @throws Exception 
	 * 	goalPosition
	 */
	public static void move() throws Exception{
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
					Stage.fireball.setExisting(false);
					Stage.fireball.setPosX(19);
					Stage.fireball.setPosY(11);
					break;
					
				case HERO: 
					Stage.fireball.setExisting(false);
					Stage.fireball.setPosX(19);
					Stage.fireball.setPosY(11);
			default:
				break;
				}
		}
	}
}
