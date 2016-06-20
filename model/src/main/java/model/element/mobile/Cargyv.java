package model.element.mobile;

import java.awt.image.BufferedImage;

import contract.Direction;
import model.Stage;

public class Cargyv extends Monster{
	
	private final static int ID = 2;
	
	public Cargyv(Direction direction, int posX, int posY, BufferedImage picture){
		super(direction, posX, posY, picture, ID);
		
	}
	
	public void Action(){
		
	}
	
	public void reverse(){
		boolean up = true;
		boolean down = true;
		boolean left = true;
		boolean right = true;

		switch (this.direction) {
		case UP:
			up = false;
			break;
		case DOWN:
			down = false;
			break;
		case LEFT:
			left = false;
			break;
		case RIGHT:
			right = false;
			break;
		case UPPER_LEFT:
			left = false;
			up = false;
			break;
		case UPPER_RIGHT:
			right = false;
			up = false;
			break;
		case BOTTOM_RIGHT:
			right = false;
			down = false;
			break;
		case BOTTOM_LEFT:
			left = false;
			down = false;
			break;

		default:
			break;
		}
		
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
}
