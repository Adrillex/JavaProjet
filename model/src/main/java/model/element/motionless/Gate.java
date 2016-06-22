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
	 * @throws Exception
	 * 	Error in position
	 */
	public Gate(int posX, int posY, BufferedImage[] sprite)throws Exception{
		super(posX, posY, Permeability.GATE, sprite[0], ID);
		this.open = false;
	}
	
	/**The method isOpen
	 * 
	 * @return
	 * Verify if the door is open
	 */
	public boolean getOpen(){
		return open;
	}
	/** the method setOpen
	 * @param open
	 * 	the state of the door
	 * 
	 * Tell if Lorann can go through the gate or not **/
	public void setOpen(){
		this.open = true;
	}
}
