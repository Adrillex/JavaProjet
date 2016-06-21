package model.element.mobile;

import java.awt.image.BufferedImage;
import contract.Direction;
import contract.Permeability;
import model.ImageLoader;

public class Hero extends Mobile{
	
	private final static int ID = 0;
		
	/** The constructor Hero
	 * 
	 * @param direction
	 * 	The direction of the character
	 * @param posX
	 * 	The position X of the character
	 * @param posY
	 * 	The position Y of the character
	 * @param sprite
	 * 	The sprite of the character
	 * @throws Exception
	 * 	Error in Position
	 */
	public Hero(Direction direction, int posX, int posY, BufferedImage[] sprite)throws Exception{
		super(posX, posY, Permeability.HERO , sprite[0], direction, ID);
	}
	/** the method setMoveSprite
	 * Change the sprite when the hero is moving
	 */
	public void setMoveSprite(){
		switch(this.direction){
		case UP: this.setSprite(ImageLoader.player[4]);
		break;
	case DOWN: this.setSprite(ImageLoader.player[0]);
		break;
	case LEFT: this.setSprite(ImageLoader.player[6]);
		break;
	case RIGHT: this.setSprite(ImageLoader.player[2]);
		break;
	case UPPER_RIGHT: this.setSprite(ImageLoader.player[3]);
		break;
	case UPPER_LEFT: this.setSprite(ImageLoader.player[5]);
		break;
	case BOTTOM_RIGHT: this.setSprite(ImageLoader.player[1]);
		break;
	case BOTTOM_LEFT: this.setSprite(ImageLoader.player[7]);
		break;
		}
	}
}
