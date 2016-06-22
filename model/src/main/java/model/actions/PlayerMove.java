package model.actions;

import contract.Direction;
import contract.IElement;
import model.ImageLoader;
import model.Model;
import model.Stage;
import model.element.mobile.Hero;
import model.element.motionless.Gate;

public class PlayerMove {
	
	/** 
	 * the method playerDirection
	 * Update the direction of the player and try to execute the associated movement
	 * @param direction
	 * 	the new direction of the player
	 */
	public static void playerDirection(Direction direction)throws Exception{
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
	public static void Move()throws Exception{
		if (Stage.rLorannList.isEmpty() == false) {
			for(Hero object : Stage.rLorannList){
				IElement goalPosition = Movement.getElementCoordinates(object, "move", Stage.elements);
				if(goalPosition != null){
					switch(goalPosition.getPermeability()){
					case PENETRABLE: Movement.move(object, goalPosition.getPosX(), goalPosition.getPosY());
					Stage.elements.remove(goalPosition);
					if(Stage.purseList.contains(goalPosition)){	
						Model.addToScore(650);
					}
					else if(Stage.cBallList.contains(goalPosition)){
						for (Gate gate : Stage.gateList) {
							gate.setOpen();
							gate.setSprite(ImageLoader.gate[1]);
						}
					}
					
					goalPosition.setExisting(false);
					
						break;
					case BLOCKING:
						break;
					case KILLING:
						Stage.rLorannList.get(0).setExisting(false);
						break;
					case KILLER: 
						Stage.fireball.setExisting(false);
						Stage.fireball.setPosX(19);
						Stage.fireball.setPosY(11);
						break;
					case GATE:
						for (Gate gate : Stage.gateList) {
							if(gate.getOpen()){
								Movement.move(object, goalPosition.getPosX(), goalPosition.getPosY());
								Model.nextStage();
							}
							else{
								for (Hero lorann : Stage.rLorannList) {
									lorann.setExisting(false);
								}
								
							}
								
						}
						
						break;
					default: Movement.move(object, goalPosition.getPosX(), goalPosition.getPosY());
						break;
					}
				}
			}
		}
	}

}
