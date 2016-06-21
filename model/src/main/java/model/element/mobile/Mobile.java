package model.element.mobile;

import java.awt.image.BufferedImage;
import contract.Direction;
import contract.Permeability;
import model.element.Element;


public abstract class Mobile extends Element implements IMobile{
	
	protected Direction direction;
	
	/** The constructor Mobile
	 * 
	 * @param posX
	 * @param posY
	 * @param permeability
	 * @param sprite
	 * @param direction
	 * @param ID
	 * @throws IOException 
	 */
	public Mobile(int posX, int posY, Permeability permeability, BufferedImage sprite, Direction direction, int ID){
		super(posX, posY, permeability, sprite, ID);
		this.direction = direction;
	}
	
	/**The method move 
	 * 
	 */
	public void move() {
		switch (direction) {
		case UP:
			posY --;
			break;
		case DOWN:
			posY ++;
			break;
		case LEFT:
			posX --;
			break;
		case RIGHT:
			posX ++;
			break;
		case UPPER_LEFT:
			posY --;
			posX --;
			break;
		case UPPER_RIGHT:
			posY --;
			posX ++;
			break;
		case BOTTOM_RIGHT:
			posY ++;
			posX ++;
			break;
		case BOTTOM_LEFT:
			posY ++;
			posX --;
			break;
		default:
			break;
		}
	}
	
	/**getters **/
	
	public Direction getDirection() {
		return direction;
	}
	
	//setters
	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}


}
