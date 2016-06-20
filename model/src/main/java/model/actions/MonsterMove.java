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
					break;
				case BLOCKING:
					object.reverse();
					break;
				case KILLING:
					object.reverse();
					break;
				case KILLER:
					Stage.elements.remove(object);
					Stage.monsterList.remove(object);
					object.setExisting(false);
					break;
				case HERO:
					Stage.rLorannList.get(0).setExisting(false);
					Stage.elements.remove(Stage.elements.indexOf(Stage.rLorannList.get(0)));
					Stage.rLorannList.remove(0);
					break;
				default: 
					break;
				}
			}
		}
	}
}
