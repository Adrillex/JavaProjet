package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import contract.IController;
import contract.IModel;
import contract.IView;

public class Controller implements IController, KeyListener, Runnable{

	/** The model. */
	private IModel model;
	
	/** time between two pressure on a key **/
	private long time;
	
	/** Last time a key has been pressed **/
	private long lasttime = 0;
	
	/** minimum time between each pressure on a key **/
	private int t = 100;

	private Order order;
	boolean k = false;
	int l = 0;


	/** Constructor. @param view, model **/
	public Controller(final IView view, final IModel model) {
		this.model = model;
		order = new Order(model);
	}
	
	public void keyTyped(KeyEvent e) {
	}
	
	/**
	 * the method keyPressed
	 * @param KeyEvent e 
	 * Wait for the user to press a key and send it to KeyCodeToOrder **/
	public void keyPressed(KeyEvent e) {
		l = 0;
		time = System.currentTimeMillis();
		if (time - lasttime >= t) {
			lasttime = time;
			order.orderPerform(this.order.keyCodeToOrder(e.getKeyCode()));
		}
	}

	/**
	 * the method keyRealeased
	 * @param KeyEvent e
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
			model.monsterMove();
			model.fireballMove();
			model.switchFireBallSprite();
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
