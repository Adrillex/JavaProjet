package model.actions;

import contract.IElement;
import model.Stage;
import model.element.mobile.Monster;

public class MonsterMove {
	
	/** Manage the movements of monster 
	 * @throws Exception 
	 * 	GoalPosition*/
	public static void Move() throws Exception{
		if (Stage.monsterList.isEmpty() == false) {
			for(Monster object : Stage.monsterList){
				if (object.getState() == true) {
					IElement goalPosition = Movement.getElementCoordinates(object, "move", Stage.elements);
					if(goalPosition != null && !Stage.rLorannList.isEmpty()){
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
							object.setExisting(false);
							Stage.fireball.setExisting(false);
							Stage.fireball.setPosX(19);
							Stage.fireball.setPosY(11);
							break;
						case HERO:
							Stage.rLorannList.get(0).setExisting(false);
							break;
						default: 
							break;
						}
					}
				}
			}
		}
	}
}
