package contract;

import java.awt.image.BufferedImage;

/* Interface IElement */

public interface IElement {
	
	public int getPosX();
	
	public int getPosY();
	
	public Permeability getPermeability();
	
	public BufferedImage getSprite();
	
	public int getID();
	
	public boolean getState();
	
	public void setExisting(boolean existing);
	
	public void setSprite(BufferedImage image);
}

