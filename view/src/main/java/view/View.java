package view;

import contract.IController;
import contract.IModel;
import contract.IView;

/**
 * The Class View.
 *
 * @author group 10
 */
public class View implements IView, Runnable {
	
	/** The frame **/
	ViewFrame frame;
	
	/** The panel **/
	ViewPanel pan;
	
	/**The model **/
	IModel model;
	
	/** Allow to verify if the program is running or not **/
	private boolean running = false;
	
	/**The thread **/
	private Thread thread;
	
	/* The constructor View
	 * @param model
	 * 			the model
	 */
	public View(IModel model){
		this.model = model;
		frame = new ViewFrame(model);
		pan = new ViewPanel(this.model);
		frame.setContentPane(pan);
		frame.setVisible(true);
	}
	
	
	/*
	 * (non-Javadoc)
	 * @see contract.IView#render()
	 */
	public void render(){
		frame.setContentPane(pan.update());
		frame.validate();
		frame.setVisible(true);
	}
	
	
	/*
	 * (non-Javadoc)
	 * @see contract.IView#run()
	 */
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
	/*
	 * (non-Javadoc)
	 * @see contract.IView#start()
	 */
	public synchronized void start(){
		if(running)
			return;
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	
	/*
	 * (non-Javadoc)
	 * @see contract.IView#stop()
	 */
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
