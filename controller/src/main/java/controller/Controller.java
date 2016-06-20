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
	private Order order;


	/** Constructor. @param view, model **/
	public Controller(final IView view, final IModel model) {
		this.view = view;
		this.model = model;
		order = new Order(model);
	}
	
	public void keyTyped(KeyEvent e) {
	}
	
	/** Wait for the user to press a key and send it to KeyCodeToOrder **/
	public void keyPressed(KeyEvent e) {
		time = System.currentTimeMillis();
		if (time - lasttime > t) {
			lasttime = time;
			order.orderPerform(this.order.keyCodeToOrder(e.getKeyCode()));
		}
	}

	public void keyReleased(KeyEvent e) {
		order.setFalse();
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
