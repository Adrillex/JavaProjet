package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;
import contract.Direction;

public class Controller implements IController, KeyListener  {

	/** The model. */
	private IModel model;

	/** Constructor. @param view, model **/
	public Controller(final IView view, final IModel model) {
		this.setView(view);
		this.setModel(model);
	}

	/** Sets the view. @param view */
	private void setView(final IView view) {
	}
	
	/** Sets the model. @param model */
	private void setModel(final IModel model) {
		this.model = model;
	}

	/** Perform the order given. @param order**/
	public void orderPerform(final ControllerOrder order) {
		switch(order){
		case UP: this.model.playerMove(Direction.UP);
			break;
		case DOWN: this.model.playerMove(Direction.DOWN);
			break;
		case LEFT: this.model.playerMove(Direction.LEFT);
			break;
		case RIGHT: this.model.playerMove(Direction.RIGHT);
			break;
		case UPPER_RIGHT: this.model.playerMove(Direction.UPPER_RIGHT);
			break;
		case UPPER_LEFT: this.model.playerMove(Direction.UPPER_LEFT);
			break;
		case BOTTOM_RIGHT: this.model.playerMove(Direction.BOTTOM_RIGHT);
			break;
		case BOTTOM_LEFT: this.model.playerMove(Direction.BOTTOM_LEFT);
			break;
		case SHOOT:
			break;
		default:
			break;
		}
	}

	/** Take the keycode and send an order to orderPerform @param keyCode**/
	protected ControllerOrder keyCodeToOrder(final int keyCode){
		switch (keyCode){
		case KeyEvent.VK_Z:
			return ControllerOrder.UP;
		case KeyEvent.VK_8:
			return ControllerOrder.UPPER_LEFT;
		case KeyEvent.VK_9:
			return ControllerOrder.UPPER_RIGHT;
		case KeyEvent.VK_Q:
			return ControllerOrder.LEFT;
		case KeyEvent.VK_D:
			return ControllerOrder.RIGHT;
		case KeyEvent.VK_6:
			return ControllerOrder.BOTTOM_RIGHT;
		case KeyEvent.VK_S:
			return ControllerOrder.DOWN;
		case KeyEvent.VK_5:
			return ControllerOrder.BOTTOM_LEFT;
		case KeyEvent.VK_SPACE:
			return ControllerOrder.SHOOT;
		default:
			return ControllerOrder.NOP;
		}
	}
	
	public void keyTyped(KeyEvent e) {
	}
	
	/** Wait for the user to press a key and send it to KeyCodeToOrder **/
	public void keyPressed(KeyEvent e) {
		orderPerform(this.keyCodeToOrder(e.getKeyCode()));
	}

	public void keyReleased(KeyEvent e) {
	}



}
