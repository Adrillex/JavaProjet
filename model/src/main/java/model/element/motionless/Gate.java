package model.element.motionless;

import java.awt.image.BufferedImage;
import contract.Permeability;

public class Gate extends Motionless{
	
	private final static int ID = 7;
	private boolean open;
	
	/**The constructor Gate
	 * 
	 * @param posX
	 * 	Position X of the gate
	 * @param posY
	 * 	Position Y of the gate
	 * @param sprite
	 * 	The sprite of the gate
	 */
	public Gate(int posX, int posY, BufferedImage[] sprite)throws Exception{
		super(posX, posY, Permeability.BLOCKING, sprite[0], ID);
		this.open = false;
	}
	
	/**The method isOpen
	 * 
	 * @return
	 * Verify if the door is open
	 */
	public boolean isOpen(){
		return open;
	}
}
