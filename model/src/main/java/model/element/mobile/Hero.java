package model.element.mobile;

import java.awt.image.BufferedImage;

import contract.Direction;
import contract.Permeability;
import model.ImageLoader;

public class Hero extends Mobile{
	
	private final static int ID = 0;
		
	public Hero(Direction direction, int posX, int posY, BufferedImage[] sprite){
		super(posX, posY, Permeability.HERO , sprite[0], direction, ID);
	}
	
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
