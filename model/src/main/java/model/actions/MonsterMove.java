package model.actions;

import contract.IElement;
import model.Stage;
import model.element.mobile.Monster;

public class MonsterMove {
	public static void Move(){
		for(Monster object : Stage.monsterList){
			IElement goalPosition = Movement.getElementCoordinates(object, "move", Stage.elements);
			if(goalPosition != null){
				switch(goalPosition.getPermeability()){
				case PENETRABLE: 
					object.reverse();
					object.move();
					break;
				case BLOCKING:
					object.reverse();
					object.move();
					break;
				case KILLING:
					break;
				case KILLER:
					break;
				default: 
					object.move();
					break;
				}
			}
		}
	}
}
