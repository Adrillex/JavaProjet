package contract;

import java.awt.image.BufferedImage;

public interface IElement {
	
	public int getPosX();
	
	public int getPosY();
	
	public Permeability getPermeability();
	
	public BufferedImage getSprite();
	
	public void setPosX(int x);
	
	public void setPosY(int y);
	
	public int getID();
	
	public boolean getState();
	
	public void setExisting();
	
	public void Action();
}

