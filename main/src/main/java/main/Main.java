package main;

import controller.Controller;
import model.Model;
import view.View;

/**
 * The Class Main.
 *
 * @author Jean-Aymeric Diet
 */
public abstract class Main {

	/**
	 * The main method.
	 *
	 * @param args
	 *          the arguments
	 */
	public static void main(final String[] args) {
		final Model model = new Model();
		final View view = new View(model);
		Thread t = new Thread(view);
		final Controller controller = new Controller(view, model);
		view.setController(controller);
		controller.control();
		t.start();
	}
}