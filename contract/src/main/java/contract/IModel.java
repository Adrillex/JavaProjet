package contract;

import java.util.ArrayList;

/**
 * The Interface IModel.
 */
public interface IModel {

	public ArrayList<IElement> loadStage(int stage);
	
	public void playerDirection(Direction direction);
	
	public void monsterMove();
	
	public void playerShot();
	
	public void setKeyPressed(boolean isKeyPressed);
	
	public boolean getKeyPressed();
	
	public int getScore();
	
	public int getMonsterNumber();
	
	public int getBonusNumber();

	public void fireballMove();
	
	public IElement getFireball();
	
	public void switchFireBallSprite();
	
	public void switchLorannSprite();
}
