package contract;

import java.util.ArrayList;

/**
 * The Interface IModel.
 */
public interface IModel {

	public ArrayList<IElement> loadStage(int stage);
	
	public void playerDirection(Direction direction) throws Exception;
	
	public void monsterMove() throws Exception;
	
	public void playerShot() throws Exception;
	
	public void setKeyPressed(boolean isKeyPressed);
	
	public boolean getKeyPressed();
	
	public int getScore();
	
	public int getMonsterNumber();
	
	public int getBonusNumber();

	public void fireballMove() throws Exception;
	
	public IElement getFireball();
	
	public void switchFireBallSprite();
	
	public void switchLorannSprite();
}
