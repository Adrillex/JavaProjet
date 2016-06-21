package model.actions;

import java.util.ArrayList;

import contract.IElement;
import contract.Permeability;
import model.Stage;
import model.element.mobile.Mobile;

public class Movement {

	/**set the new position to a mobile
	 * @param mobile
	 * 	the mobile who has to move
	 * @param x
	 * 	the actual position x of the mobile
	 * @param y
	 * 	the actual position y of the mobile
	 */
	public static void move(Mobile mobile, int x, int y){
		mobile.setPosX(x);
		mobile.setPosY(y);
	}
	
	/** the method getElementCoordinates
	 * 
	 * @param mobile
	 * 	the mobile
	 * @param order
	 * 	the order to execute
	 * @param elements
	 * 	the arrayList elements
	 * @return
	 * 	The element on the position the mobile try to go on
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
		for(IElement goalPosition : elements){
			if (goalPosition.getPermeability() == Permeability.KILLER && goalPosition.getState()) {
				System.out.println("bolos");
			}
			if(goalPosition.getPosX() == x && goalPosition.getPosY() == y && goalPosition.getState()){
				return goalPosition;
			}}
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
