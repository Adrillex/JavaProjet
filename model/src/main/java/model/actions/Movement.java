package model.actions;

import java.util.ArrayList;

import contract.IElement;
import model.Stage;
import model.element.mobile.Mobile;

public class Movement {

	/**the method move
	 * 
	 * @param mobile
	 * @param x
	 * @param y
	 * 
	 * set the new position to a mobile
	 */
	
	public static void move(Mobile mobile, int x, int y){
		mobile.setPosX(x);
		mobile.setPosY(y);
	}
	
	/** the method getElementCoordinates
	 * 
	 * @param mobile
	 * @param order
	 * @param elements
	 * @return
	 * 
	 * Allow us to know what type of element is on the goalPosition of the mobile
	 */
	
	public static IElement getElementCoordinates(Mobile mobile, String order, ArrayList<IElement> elements) {
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
		//System.out.println("Coordonnées précédentes : x = "+mobile.getPosX()+" y = "+mobile.getPosY());
		for(IElement goalPosition : elements)
			if(goalPosition.getPosX() == x && goalPosition.getPosY() == y){
				return goalPosition;
			}
		if(order == "move")
			move(mobile, x, y);
		else{
			System.out.println("test");
			Stage.fireball.setExisting(true);
			Stage.fireball.setDirection(mobile.getDirection());
			Stage.fireball.setPosX(x);
			Stage.fireball.setPosY(y);
			
		}
		return null;
	}
}
