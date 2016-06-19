package model.element;

import java.awt.image.BufferedImage;

public class Sprite implements ISprite{
	
	protected BufferedImage sprite;

	
	public Sprite(BufferedImage sprite){
		this.sprite = sprite;
	}

	public BufferedImage getSprite() {
		return sprite;
	}

}
