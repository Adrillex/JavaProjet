package contract;

import java.util.ArrayList;

/**
 * The Interface IModel.
 *
 */
public interface IModel {

	public ArrayList<IElement> loadStage(int stage);
	
	public void playerMove(Direction direction);
	
	public void monsterMove();
}
