package model.element;

import java.awt.image.BufferedImage;

public class PolymorphousElements extends Sprite{
	
	public PolymorphousElements(BufferedImage sprite) {
		super(sprite);
	}

	public void setSprite(BufferedImage sprite){
		this.sprite = sprite;
	}

}
