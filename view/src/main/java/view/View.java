package view;

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
	ViewPanel pan;
	IModel model;
	private boolean running = false;
	private Thread thread;
	
	public View(IModel model){
		this.model = model;
		frame = new ViewFrame(model);
		pan = new ViewPanel(this.model);
		frame.setContentPane(pan);
		frame.setVisible(true);
	}
	
	
	
	public void render(){
		frame.setContentPane(pan.update());
		frame.validate();
		frame.setVisible(true);
	}
	
	
	
	public void run() {
		
		while(running){
			render();
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		stop();
	}
	
	public synchronized void start(){
		if(running)
			return;
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	
	public synchronized void stop(){
		if(!running)
			return;
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
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


}
