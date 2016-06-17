package contract;

import java.awt.event.KeyListener;

/**
 * The Interface IController.
 *
 * 
 */
public interface IController extends KeyListener{

	/**
	 * Order perform.
	 *
	 * @param controllerOrder
	 *          the controller order
	 */
	public void orderPerform(ControllerOrder order);

}