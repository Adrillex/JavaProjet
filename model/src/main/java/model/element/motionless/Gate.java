package model.element.motionless;

import java.awt.image.BufferedImage;

import contract.Direction;
import contract.Permeability;

public class Gate extends Motionless{
	
	private final static int ID = 7;
	private boolean open;
	
	/**The constructor Gate
	 * 
	 * @param posX
	 * @param posY
	 * @param sprite
	 */
	public Gate(int posX, int posY, BufferedImage[] sprite){
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

	public void setDirection(Direction direction) {
	}	
}
