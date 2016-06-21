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
	 * 	Position X of the mobile
	 * @param posY
	 * 	Position Y of the mobile
	 * @param permeability
	 * 	The permeability type of the mobile
	 * @param sprite
	 * 	The sprite of the mobile
	 * @param direction
	 * 	The direction of the mobile
	 * @param ID
	 * 	The ID of the mobile
	 */
	public Mobile(int posX, int posY, Permeability permeability, BufferedImage sprite, Direction direction, int ID)throws Exception{
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

	/**setPosX
	 * @throws Exception
	 * 	prevent posX to have forbidden values
	 */
	public void setPosX(int posX) throws Exception {
		if(posX < 0 || posX >= 20 )
			throw new Exception("PosX not correct!");
		this.posX = posX;
	}
	/**setPosY
	 * @throws Exception
	 * 	prevent posY to have forbidden values
	 */
	public void setPosY(int posY) throws Exception {
		if(posY < 0 || posY >= 12)
			throw new Exception("PosY not correct!");
		this.posY = posY;
	}


}
