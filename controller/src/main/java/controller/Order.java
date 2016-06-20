package controller;

import java.awt.event.KeyEvent;

import contract.ControllerOrder;
import contract.Direction;
import contract.IModel;

public class Order {
	
	private boolean up = false, down = false, left = false, right = false;
	private IModel model;
	
	/** The Constructor Order.
	 * 
	 * @param model
	 */
	public Order(IModel model){
		this.model = model;
	}
	
	/** The method orderPerform.
	 * 
	 * @param order
	 * 
	 * Send an order to the character.
	 */
	public void orderPerform(final ControllerOrder order) {
		switch(order){
		case UP: this.model.playerDirection(Direction.UP);
			break;
		case DOWN: this.model.playerDirection(Direction.DOWN);
			break;
		case LEFT: this.model.playerDirection(Direction.LEFT);
			break;
		case RIGHT: this.model.playerDirection(Direction.RIGHT);
			break;
		case UPPER_RIGHT: this.model.playerDirection(Direction.UPPER_RIGHT);
			break;
		case UPPER_LEFT: this.model.playerDirection(Direction.UPPER_LEFT);
			break;
		case BOTTOM_RIGHT: this.model.playerDirection(Direction.BOTTOM_RIGHT);
			break;
		case BOTTOM_LEFT: this.model.playerDirection(Direction.BOTTOM_LEFT);
			break;
		case SHOOT: if (!model.getFireball().getState())this.model.playerShot();
			break;
		default:
			break;
		}
	}

	/** Take the keycode and send an order to orderPerform 
	 * 	@param keyCode**/
	protected ControllerOrder keyCodeToOrder(final int keyCode){
		switch (keyCode){
		
		case (KeyEvent.VK_Z):
			if(left)
				return ControllerOrder.UPPER_LEFT;
			else if(right)
				return ControllerOrder.UPPER_RIGHT;
			else{
				up = true;
				return ControllerOrder.UP;
			}
		
		case KeyEvent.VK_S:
			if(left)
				return ControllerOrder.BOTTOM_LEFT;
			else if(right)
				return ControllerOrder.BOTTOM_RIGHT;
			else{
				down = true;
				return ControllerOrder.DOWN;
			}
			
		case KeyEvent.VK_Q:
			if(up)
				return ControllerOrder.UPPER_LEFT;
			else if(down)
				return ControllerOrder.BOTTOM_LEFT;
			else{
				left = true;
				return ControllerOrder.LEFT;
			}
			
		case KeyEvent.VK_D:
			if(up)
				return ControllerOrder.UPPER_RIGHT;
			else if(down)
				return ControllerOrder.BOTTOM_RIGHT;
			else{
				right = true;
				return ControllerOrder.RIGHT;
			}

		case KeyEvent.VK_SPACE:
			return ControllerOrder.SHOOT;
		default:
			return ControllerOrder.NOP;
		}
	}
	
	/** the method setFalse
	 * Set to false all attributes.
	 */
	public void setFalse(){
		up = false;
		down = false;
		left = false;
		right = false;
	}
}
