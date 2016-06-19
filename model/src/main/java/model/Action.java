package model;

import contract.IElement;
import model.element.mobile.Mobile;

public class Action {
	
	public IElement getElementCoordinates(Mobile mobile, String order, Model model) {
		int x = mobile.getPosX() ,y = mobile.getPosY();
		switch(mobile.getDirection()){
		case UP: y = mobile.getPosY() - 1; 
		break;
	case DOWN: y = mobile.getPosY() + 1;
		break;
	case LEFT: x = mobile.getPosX() - 1;
		break;
	case RIGHT: x = mobile.getPosX() + 1;
		break;
	case UPPER_RIGHT: y = mobile.getPosY() - 1; 
					  x = mobile.getPosX() + 1;
		break;
	case UPPER_LEFT: y = mobile.getPosY() - 1; 
					 x = mobile.getPosX() - 1;
		break;
	case BOTTOM_RIGHT: y = mobile.getPosY() + 1;
					   x = mobile.getPosX() + 1;
		break;
	case BOTTOM_LEFT: y = mobile.getPosY() + 1;
					  x = mobile.getPosX() - 1;
		break; 
		}
		for(IElement goalPosition : model.elements)
			if(goalPosition.getPosX() == x && goalPosition.getPosY() == y){
				return goalPosition;
			}
		System.out.println("Coordonnées précédentes : x = "+mobile.getPosX()+" y = "+mobile.getPosY());
		if(order == "move")
			model.move(mobile, x, y);
		else{
			model.castFireball(model.fireballDirection(mobile.getDirection()), x, y);
			
		}
		return null;
	}
}
