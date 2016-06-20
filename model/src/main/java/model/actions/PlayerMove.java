package model.actions;

import contract.Direction;
import contract.IElement;
import model.Model;
import model.Stage;
import model.element.mobile.Hero;

public class PlayerMove {
	
	
	public static void playerDirection(Direction direction){
		for(Hero object : Stage.rLorannList){
			object.setDirection(direction);
			object.setMoveSprite();
		}
		Move();
	}

	public static void Move(){
		for(Hero object : Stage.rLorannList){
			IElement goalPosition = Movement.getElementCoordinates(object, "move", Stage.elements);
			if(goalPosition != null){
				switch(goalPosition.getPermeability()){
				case PENETRABLE: Movement.move(object, goalPosition.getPosX(), goalPosition.getPosY());
				Stage.elements.remove(goalPosition);
				if(Stage.purseList.contains(goalPosition)){	
					
				}
				goalPosition.setExisting();
				
					break;
				case BLOCKING:
					break;
				case KILLING:
					break;
				case KILLER:
					break;
				default: Movement.move(object, goalPosition.getPosX(), goalPosition.getPosY());
					break;
				}
			}
		}
	}

}
