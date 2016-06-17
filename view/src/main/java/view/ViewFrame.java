package view;

import java.awt.HeadlessException;

import javax.swing.JFrame;

import contract.IController;
import contract.IModel;

/**
 * The Class ViewFrame.
 *
 * @author Jean-Aymeric Diet
 */
class ViewFrame extends JFrame{

	/** The model. */
	private IModel	model;

	/** The controller. */
	private IController	controller;
	/** The Constant serialVersionUID. */
	private static final long	serialVersionUID	= -697358409737458175L;

	/**
	 * Instantiates a new view frame.
	 *
	 * @param model
	 *          the model
	 * @throws HeadlessException
	 *           the headless exception
	 */
	ViewPanel pan0;
	public ViewFrame(IModel model) {
		this.model = model;
		this.setSize(636, 387);
		this.setTitle("Lorann");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		this.setLocationRelativeTo(null);
		pan0 = new ViewPanel(this.model);
		setContentPane(pan0);
	}

	
	/**
	 * Gets the controller.
	 *
	 * @return the controller
	 */
	public ViewPanel getPanel(){
		return new ViewPanel(model);
	}
	
	private IController getController() {
		return this.controller;
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
