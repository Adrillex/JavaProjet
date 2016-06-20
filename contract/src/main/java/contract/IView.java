package contract;

/**
 * The Interface IView.
 */
public interface IView {
	
	public void render();
	public void run();
	public void start();
	public void stop();
	
	public void setController(final IController controller);
}
