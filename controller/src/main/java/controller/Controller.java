package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import contract.IController;
import contract.IModel;

public class Controller implements IController, KeyListener, Runnable{

	/** The model. */
	private IModel model;
	/** time between two pressure on a key **/
	private long time;
	/** Last time a key has been pressed **/
	private long lasttime = 0;
	/** minimum time between each pressure on a key **/
	public int t = 100;
	/**The order object **/
	private Order order;
	/** Variable used to control the time between each change of lorann's sprite**/
	int l = 0;
	/** Constructor. 
	 * @param model the Model 
	 * **/
	public Controller(final IModel model) {
		this.model = model;
		order = new Order(model);
	}
	
	public void keyTyped(KeyEvent e) {
	}
	
	/**
	 * the method keyPressed
	 * @param e 
	 * 	The code of the pressed key
	 * Wait for the user to press a key and send it to KeyCodeToOrder **/
	public void keyPressed(KeyEvent e) {
		l = 0;
		time = System.currentTimeMillis();
		if (time - lasttime >= t) {
			lasttime = time;
			try {
				order.orderPerform(this.order.keyCodeToOrder(e.getKeyCode()));
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}

	/**
	 * the method keyRealeased
	 * @param e
	 * 	The code of the pressed key
	 * Allows to know when the key is released
	 */
	public void keyReleased(KeyEvent e) {
		l = 0;
		order.setFalse();
	}
	
	/** the method run
	 * Game loop **/
	public void run() {
		while (true) {
			try {
				model.monsterMove();
				if(model.getFireball().getState()){
					model.fireballMove();
					model.switchFireBallSprite();
				}
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			if (l >= 300/t ) {
				model.switchLorannSprite();
			}
			else l ++;
			try {
				Thread.sleep(t);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}