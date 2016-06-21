package model.element.mobile;

import java.awt.image.BufferedImage;
import contract.Direction;
import model.Stage;

public class Kyrac extends Monster{
	
	private final static int ID = 3;
	int j = 0;
	
	/**the constructor Kyrac
	 * 
	 * @param direction
	 * 	Direction of the monster
	 * @param posX
	 * 	Position of Kyrac
	 * @param posY
	 * 	Position Y of Kyrac
	 * @param sprite
	 * 	sprite of Kyrac
	 */
	public Kyrac(Direction direction, int posX, int posY, BufferedImage sprite)throws Exception{
		super(direction, posX, posY, sprite, ID);
	}
	
	public void reverse(){
		int direct = 0;
		if(Stage.rLorannList.get(0).getPosX() > this.posX)direct = direct + 1;
		else if (Stage.rLorannList.get(0).getPosX() < this.posX) direct = direct + 2;
		if(Stage.rLorannList.get(0).getPosY() > this.posY)direct = direct + 4;
		else if (Stage.rLorannList.get(0).getPosY() < this.posY) direct = direct + 8;
		
		switch (direct) {
		case 1:
			this.direction = Direction.RIGHT;
			break;
		case 2:
			this.direction = Direction.LEFT;
			break;
		case 4:
			this.direction = Direction.DOWN;
			break;
		case 5:
			this.direction = Direction.BOTTOM_RIGHT;
			break;
		case 6:
			this.direction = Direction.BOTTOM_LEFT;
			break;
		case 8:
			this.direction = Direction.UP;
			break;
		case 9:
			this.direction = Direction.UPPER_RIGHT;
			break;
		case 10:
			this.direction = Direction.UPPER_LEFT;
			break;

		default:
			break;
		}
		direct = 0;
	}
	
	public void move(){
		if (j == 5) {
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
			j=0;
		}
	j++;
	}
}
