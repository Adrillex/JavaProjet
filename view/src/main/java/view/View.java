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
	
	public View(){
		frame = new ViewFrame();
	}
	
	
	
	public void render(){
		bs = frame.getBufferStrategy();
		if(bs == null){
			frame.createBufferStrategy(3);
			return;
		}
	}
	
	
	
	public void run() {
		render();
		
	}

	/**
	 * Sets the controller.
	 *
	 * @param controller
	 *          the new controller
	 */
	public void setController(final IController controller) {
		//this.viewFrame.setController(controller);
	}
	
	public void setModel(IModel model){
		//this.viewFrame.setModel(model);
	}


}
