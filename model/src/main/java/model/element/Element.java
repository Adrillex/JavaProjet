package model.element;

import java.awt.image.BufferedImage;
import contract.IElement;
import contract.Permeability;

public abstract class Element implements IElement{
	
	/** The sprite **/
	protected BufferedImage sprite;
	/** The permeability **/
	protected Permeability permeability;
	/**The position **/
	protected int posX, posY;
	/** The ID **/
	protected final int ID;
	/**The state**/
	protected boolean existing;

	/** The constructor Element
	 * 
	 * @param posX
	 * 	Position X of the element
	 * @param posY
	 * 	Position Y of the element
	 * @param permeability
	 * 	Permeability type of the element
	 * @param sprite
	 * 	Sprite of the element
	 * @param ID
	 * 	ID of the element
	 * @throws Exception
	 * 	Position Error
	 */
	public Element(int posX, int posY, Permeability permeability, BufferedImage sprite, int ID) throws Exception{
		if(posX < 0 || posX >= 20)
			throw new Exception("PosX not correct");
		if(posY < 0 || posY >= 12)
			throw new Exception("PosY not correct");
		this.posY = posY;
		this.posX = posX;
		this.permeability = permeability;
		this.sprite = sprite;
		this.ID = ID;
		existing = true;
	}
	//getters
	
	public BufferedImage getSprite(){
		return this.sprite;
	}

	public int getPosX(){
		return posX;
	}
	
	public int getPosY(){
		return posY;
	}
	
	public Permeability getPermeability(){
		return permeability;
	}
	
	public int getID(){
		return ID;
	}
	
	public boolean getState(){
		return existing;
	}
	
	//setters
	public void setExisting(boolean existing){
		this.existing = existing;
	}
	
	public void setSprite(BufferedImage sprite){
		this.sprite = sprite;
	}
	
	public void setPermeability(Permeability permeability){
		this.permeability = permeability;
	}
}
