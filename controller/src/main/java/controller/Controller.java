package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;
import contract.Direction;

/**
 * The Class Controller.
 */
public class Controller implements IController, KeyListener {

	/** The view. */
	private IView view;

	/** The model. */
	private IModel model;

	/**
	 * Instantiates a new controller.
	 *
	 * @param view
	 *          the view
	 * @param model
	 *          the model
	 */
	public Controller(final IView view, final IModel model) {
		this.setView(view);
		this.setModel(model);
	}

	public void GameLoop(){
	}
	/**
	 * Sets the view.
	 * @param view
	 *          the new view
	 */
	private void setView(final IView view) {
		this.view = view;
	}

	public void control() {
	}
	
	/**
	 * Sets the model.
	 *
	 * @param model
	 *          the new model
	 */
	private void setModel(final IModel model) {
		this.model = model;
	}

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

	protected ControllerOrder keyCodeToOrder(final int keyCode){
		switch (keyCode){
		case KeyEvent.VK_8:
			return ControllerOrder.UP;
		case KeyEvent.VK_7:
			return ControllerOrder.UPPER_LEFT;
		case KeyEvent.VK_9:
			return ControllerOrder.UPPER_RIGHT;
		case KeyEvent.VK_6:
			return ControllerOrder.LEFT;
		case KeyEvent.VK_4:
			return ControllerOrder.RIGHT;
		case KeyEvent.VK_3:
			return ControllerOrder.BOTTOM_RIGHT;
		case KeyEvent.VK_2:
			return ControllerOrder.DOWN;
		case KeyEvent.VK_1:
			return ControllerOrder.BOTTOM_LEFT;
		case KeyEvent.VK_SPACE:
			return ControllerOrder.SHOOT;
		default:
			return ControllerOrder.NOP;
		}
	}
	
	public void keyTyped(KeyEvent e) {
		
	}

	public void keyPressed(KeyEvent e) {
		orderPerform(this.keyCodeToOrder(e.getKeyCode()));
	}

	public void keyReleased(KeyEvent e) {
		
	}



}
