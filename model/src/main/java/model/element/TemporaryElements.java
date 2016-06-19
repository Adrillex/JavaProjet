package model.element;

import java.awt.image.BufferedImage;

public class TemporaryElements extends Sprite{
	
	public TemporaryElements(BufferedImage sprite) {
		super(sprite);
	}

	public void Disappear(){
		this.sprite = null;
	}

}
