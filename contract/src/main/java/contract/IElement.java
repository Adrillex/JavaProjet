package contract;

import java.awt.image.BufferedImage;

/* Interface IElement */

public interface IElement {
	
	public int getPosX();
	
	public int getPosY();
	
	public Permeability getPermeability();
	
	public BufferedImage getSprite();
	
	public void setPosX(int x);
	
	public void setPosY(int y);
	
	public int getID();
	
	public boolean getState();
	
	public void setExisting(boolean existing);

	public void setDirection(Direction direction);
	
	public void setSprite(BufferedImage image);
}

