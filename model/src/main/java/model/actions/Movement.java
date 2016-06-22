package model.actions;

import java.util.ArrayList;

import contract.IElement;
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
	 * @throws Exception 
	 * 	Prevent forbidden modification of posX and posY
	 */
	public static void move(Mobile mobile, int x, int y) throws Exception{
		if(mobile.getID() == 4 || mobile.getID() == 3){
			mobile.move();
		}
		else {
			mobile.setPosX(x);
			mobile.setPosY(y);
		}
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
	 * @throws 
	 * 	Exception for the move method
	 * Allow us to know what type of element is on the goalPosition of the mobile
	 */
	
	public static IElement getElementCoordinates(Mobile mobile, String order, ArrayList<IElement> elements)throws Exception{
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
		for(IElement goalPosition : elements){
			if(goalPosition.getPosX() == x && goalPosition.getPosY() == y && goalPosition.getState()){
				return goalPosition;
			}
		}
		if(order == "move")
			move(mobile, x, y);
		else{
			Stage.fireball.setExisting(true);
			Stage.fireball.setDirection(mobile.getDirection());
			Stage.fireball.setPosX(x);
			Stage.fireball.setPosY(y);
			
		}
		return null;
	}
}
