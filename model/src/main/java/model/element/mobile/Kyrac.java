package model.element.mobile;

import java.awt.image.BufferedImage;
import contract.Direction;

public class Kyrac extends Monster{
	
	private final static int ID = 3;

	
	/**
	 * The constructor Kyrac
	 * @param direction
	 * @param posX
	 * @param posY
	 * @param sprite
	 * @throws IOException 
	 */
	public Kyrac(Direction direction, int posX, int posY, BufferedImage sprite){
		super(direction, posX, posY, sprite, ID);
	}
	
}
