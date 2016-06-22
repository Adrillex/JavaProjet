package main;

import Beforeview.BeforeView;
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
		final BeforeView bfView = new BeforeView();
		final Model model = new Model(bfView.getTexture());
		final View view = new View(model, bfView.getFrame(), bfView.getStage());
		final Controller controller = new Controller(model);
		
		view.setController(controller);
		view.start();

		Thread ct = new Thread(controller);

		ct.start();
	}
}