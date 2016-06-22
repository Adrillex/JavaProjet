package model;

import java.util.ArrayList;

import contract.Direction;
import contract.IElement;
import contract.IModel;
import model.actions.FireballMove;
import model.actions.MonsterMove;
import model.actions.Movement;
import model.actions.PlayerMove;
import model.actions.SpriteSwitcher;
import model.element.Bonus;
import model.element.mobile.Hero;
/** The class Model.
 * @author Group 10  */
public class Model implements IModel {
	
	private boolean isKeyPressed = false;
	/**Actual loaded stage.**/
	private Stage stage;
	/**Actual score of the player **/
	private static int score;
	
	/**Bonus point given by the purse **/
	private Bonus bPurse;

	/** Instantiates a new model 
	 * @param texture */
	public Model(String texture) {
		ImageLoader.loadImage(texture);
		score = 0;
	}
	/** Add bonus point to the actual score
	 * 
	 * @param bonus 
	 * Add bonus points to the total score
	 */
	public static void addToScore(int bonus){
		score = score + bonus;
	}
	
	/**the method loadStage
	 * @param numStage
	 * 	load the stage number numstage.
	 */
	public ArrayList<IElement> loadStage(int numStage){
		stage = new Stage(numStage, bPurse);
		try {
			return stage.LoadStage();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**the method playerDirection
	 * 
	 * Launch the playerDirection method in PlayerMove
	 * @throws Exception 
	 * 	playerDir
	 */
	public void playerDirection(Direction direction) throws Exception{
		PlayerMove.playerDirection(direction);
	}
	/**the method playerSHot
	 * Allows to cast the fireball spell
	 * @throws Exception 
	 * 	playerShot
	 */
	public void playerShot() throws Exception {
		ArrayList<Hero> rLorannList = Stage.rLorannList;
		for (int i = 0; i < rLorannList.size(); i++) {
			Stage.fireball.setDirection(fireballDirection(Stage.rLorannList.get(0).getDirection()));
			Stage.fireball.setPosX(Stage.rLorannList.get(0).getPosX());
			Stage.fireball.setPosY(Stage.rLorannList.get(0).getPosY());
			Movement.getElementCoordinates(Stage.fireball, "attack", Stage.elements);
		}
	}
	/** the method fireballDirection
	 * @param playerDir
	 * 	Direction of the player
	 * @return
	 * Gives the new direction of the fireball
	 */
	public Direction fireballDirection(Direction playerDir){
		switch(playerDir){
		case BOTTOM_LEFT: return Direction.UPPER_RIGHT;
		case BOTTOM_RIGHT:return Direction.UPPER_LEFT;
		case DOWN: return Direction.UP;
		case LEFT: return Direction.RIGHT;
		case RIGHT:return Direction.LEFT;
		case UP: return Direction.DOWN;
		case UPPER_LEFT: return Direction.BOTTOM_RIGHT;
		case UPPER_RIGHT: return Direction.BOTTOM_RIGHT;
		}
		return playerDir;
	}
	
	/** Call the monsterMove method 
	 * @throws Exception 
	 * 	monsterMove **/
	public void monsterMove() throws Exception {
		MonsterMove.Move();
	}
	
	/** Call the fireballMove method 
	 * @throws Exception 
	 * 	monstermove **/
	public void fireballMove() throws Exception{
		FireballMove.move();
	}
	
	/** Call the SpriteSwitcher method **/
	public void switchFireBallSprite(){
		SpriteSwitcher.fireBallLoader();
	}
	
	/**Allow Lorann to change his Sprite **/
	public void switchLorannSprite(){
		SpriteSwitcher.lorannloader();;
	}
	
	//getters
	public int getScore(){
		return score;
	}
	
	public int getMonsterNumber(){
		return Stage.monsterList.size();
	}
	
	public int getBonusNumber(){
		return Stage.purseList.size();
	}
	
	public IElement getFireball(){
		return Stage.fireball;
	}
	
	public boolean getKeyPressed() {
		return isKeyPressed;
	}
	
	//setters
	public void setKeyPressed(boolean isKeyPressed) {
		this.isKeyPressed = isKeyPressed;
	}
	public static void nextStage() {
		System.out.println("lkjb");
		
	}

}