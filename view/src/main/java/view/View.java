package view;

import java.awt.image.BufferStrategy;

import contract.IController;
import contract.IModel;
import contract.IView;

/**
 * The Class View.
 *
 * @author Jean-Aymeric Diet
 */
public class View implements IView, Runnable {
	
	ViewFrame frame;
	
	BufferStrategy bs;
	IModel model;
	
	public View(IModel model){
		this.model = model;
		frame = new ViewFrame(model);
	}
	
	
	
	public void render(){
		
		frame.setContentPane(frame.pan0.updatePanel(model));
		frame.validate();
		frame.setVisible(true);
		
	}
	
	
	
	public void run() {
		while(true){
			render();
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				System.out.print("Oups");
				e.printStackTrace();
				this.frame.setFocusable(true);
				this.frame.requestFocusInWindow();
			}
		}

		
	}

	/**
	 * Sets the controller.
	 *
	 * @param controller
	 *          the new controller
	 */
	public void setController(final IController controller) {
		this.frame.setController(controller);
	}
	
	public void setModel(IModel model){
		//this.viewFrame.setModel(model);
	}


}
