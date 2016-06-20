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

public class Model implements IModel {
	private boolean isKeyPressed = false;
	
	private Stage stage;
	private static int score;
	private Bonus bPurse;
	private static Bonus bMonster;

	/** Instantiates a new model */
	public Model() {
		ImageLoader.loadImage();
		score = 0;
		bPurse = new Bonus(650);
		bMonster = new Bonus(100);
	}
	
	public static void addToScore(int bonus){
		score = score + bonus;
	}
	
	public int getScore(){
		return score;
	}
	
	public int getMonsterNumber(){
		return Stage.monsterList.size();
	}
	
	public int getBonusNumber(){
		return Stage.purseList.size();
	}
	
	public ArrayList<IElement> loadStage(int numStage){
		stage = new Stage(numStage, bPurse);
		return stage.LoadStage();
	}
	
	public void playerDirection(Direction direction){
		PlayerMove.playerDirection(direction);
	}

	public void playerShot() {
		for(Hero object : Stage.rLorannList){
			stage.fireball.setDirection(fireballDirection(stage.rLorannList.get(0).getDirection()));
			stage.fireball.setPosX(stage.rLorannList.get(0).getPosX());
			stage.fireball.setPosY(stage.rLorannList.get(0).getPosY());
			IElement goalPosition = Movement.getElementCoordinates(stage.fireball, "attack", Stage.elements);
		}
	}

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
		return null;
	}

	public void setKeyPressed(boolean isKeyPressed) {
		this.isKeyPressed = isKeyPressed;
	}
	
	public boolean getKeyPressed() {
		return isKeyPressed;
	}

	public void monsterMove() {
		MonsterMove.Move();
	}
	
	public void fireballMove(){
		FireballMove.move();
	}
	
	public void switchFireBallSprite(){
		SpriteSwitcher.fireBallLoader();
	}
	
	public void switchLorannSprite(){
		SpriteSwitcher.lorannloader();;
	}
	
	public IElement getFireball(){
		return stage.fireball;
	}

}