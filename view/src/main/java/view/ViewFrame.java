package view;

import javax.swing.JFrame;

import contract.IController;
import contract.IModel;

/**
 * The Class ViewFrame.
 *
 * @author group 10
 */
public class ViewFrame extends JFrame{

	/** The model. */
	private IModel	model;

	/** The controller. */
	private IController	controller;
	/** The Constant serialVersionUID. */
	private static final long	serialVersionUID	= -697358409737458175L;

	/**
	 * Instantiates a new view frame.
	 */
	public ViewFrame() {
		this.setSize(836, 450);
		this.setTitle("Lorann");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	/**
	 * Sets the controller.
	 *
	 * @param controller
	 *          the new controller
	 */
	protected void setController(final IController controller) {
		this.controller = controller;
		this.addKeyListener(this.controller);
	}

	/**
	 * Gets the model.
	 *
	 * @return the model
	 */
	protected IModel getModel() {
		return this.model;
	}

	/**
	 * Sets the model.
	 *
	 * @param model
	 *          the new model
	 */
	protected void setModel(IModel model) {
		this.model = model;
	}
}
