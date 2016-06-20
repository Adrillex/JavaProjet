package model;

import java.util.ArrayList;

import contract.Direction;
import contract.IElement;
import contract.IModel;
import contract.Permeability;
import model.actions.MonsterMove;
import model.actions.Movement;
import model.actions.PlayerMove;
import model.element.Bonus;
import model.element.mobile.Fireball;
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
			Direction playerDir = object.getDirection();
			IElement goalPosition = Movement.getElementCoordinates(object, "attack", Stage.elements);
			if(goalPosition.getPermeability() == Permeability.KILLER){
			}
		}
	}
	
	public void castFireball(Direction direction, int x, int y){
		Fireball.getInstance(direction, x, y, ImageLoader.fireball[0]);
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

}