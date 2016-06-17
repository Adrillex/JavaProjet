package contract;

import java.awt.image.BufferedImage;

public interface IElement {
	
	public int getPosX();
	
	public int getPosY();
	
	public Permeability getPermeability();
	
	public BufferedImage getSprite();
}
