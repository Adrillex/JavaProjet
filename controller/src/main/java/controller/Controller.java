package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import contract.ControllerOrder;
import contract.Direction;
import contract.IController;
import contract.IElement;
import contract.IModel;
import contract.IView;

public class Controller implements IController, KeyListener, Runnable{

	/** The model. */
	private IModel model;
	private IView view;
	private long time;
	private long lasttime = 0;
	private int t = 200;
	ArrayList <IElement> elements = null;


	/** Constructor. @param view, model **/
	public Controller(final IView view, final IModel model) {
		this.view = view;
		this.model = model;
	}

	/** Perform the order given. @param order**/
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
		case SHOOT:
			break;
		default:
			break;
		}
	}

	/** Take the keycode and send an order to orderPerform @param keyCode**/
	protected ControllerOrder keyCodeToOrder(final int keyCode){
		switch (keyCode){
		case KeyEvent.VK_NUMPAD8:
			return ControllerOrder.UP;
		case KeyEvent.VK_NUMPAD7:
			return ControllerOrder.UPPER_LEFT;
		case KeyEvent.VK_NUMPAD9:
			return ControllerOrder.UPPER_RIGHT;
		case KeyEvent.VK_NUMPAD4:
			return ControllerOrder.LEFT;
		case KeyEvent.VK_NUMPAD6:
			return ControllerOrder.RIGHT;
		case KeyEvent.VK_NUMPAD3:
			return ControllerOrder.BOTTOM_RIGHT;
		case KeyEvent.VK_NUMPAD2:
			return ControllerOrder.DOWN;
		case KeyEvent.VK_NUMPAD1:
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
		time = System.currentTimeMillis();
		if (time - lasttime > t) {
			lasttime = time;
			orderPerform(this.keyCodeToOrder(e.getKeyCode()));
		}
	}

	public void keyReleased(KeyEvent e) {
	}
	
	public void run() {
		while (true) {
			elements = model.getMobile();
			for (IElement object : elements) {
				object.Action();
			}
			try {
				Thread.sleep(t);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
