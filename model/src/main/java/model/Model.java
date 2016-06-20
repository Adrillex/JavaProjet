package model;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import contract.Direction;
import contract.IElement;
import contract.IModel;
import contract.Permeability;
import model.database.DBConnection;
import model.element.mobile.Arrbarr;
import model.element.mobile.Cargyv;
import model.element.mobile.Fireball;
import model.element.mobile.Hero;
import model.element.mobile.Kyrac;
import model.element.mobile.Maarcg;
import model.element.mobile.Mobile;
import model.element.mobile.Monster;
import model.element.motionless.CrystalBall;
import model.element.motionless.Gate;
import model.element.motionless.Purse;
import model.element.motionless.Wall;

/**
 * The Class Model.
 *
 * @author Jean-Aymeric Diet
 */
public class Model implements IModel {
	private boolean isKeyPressed = false;
	
	public ArrayList <Wall> vWallList;
	public ArrayList <Wall> hWallList;
	public ArrayList <Wall> rWallList;
	public ArrayList <CrystalBall> cBallList;
	public ArrayList <Purse> purseList;
	public ArrayList <Gate> gateCList;
	public ArrayList <Gate> gateOList;
	public ArrayList <Monster> monster1List;
	public ArrayList <Monster> monster2List;
	public ArrayList <Monster> monster3List;
	public ArrayList <Monster> monster4List;
	public ArrayList <Hero> rLorannList;
	public ArrayList <IElement> elements;
	public ArrayList <IElement> elementsMobile;
	/**
	 * Instantiates a new model.
	 */
	public Model() {
		ImageLoader.loadImage();
	}
	
	public ArrayList<IElement> loadStage(int Stage){
		vWallList = new ArrayList <Wall>();
		hWallList = new ArrayList <Wall>();
		rWallList = new ArrayList <Wall>();
		cBallList = new ArrayList <CrystalBall>();
		purseList = new ArrayList <Purse>();
		gateCList = new ArrayList <Gate>();
		gateOList = new ArrayList <Gate>();
		monster1List = new ArrayList <Monster>();
		monster2List = new ArrayList <Monster>();
		monster3List = new ArrayList <Monster>();
		monster4List = new ArrayList <Monster>();
		rLorannList = new ArrayList <Hero>();
		elements = new ArrayList <IElement>();
		elementsMobile = new ArrayList <IElement>();
		
		
		int numStage = 1;
		DBConnection instance = DBConnection.getInstance();
		final String sql = "{call seeStage" + numStage + "}";
		CallableStatement call;
		ResultSet rs;
		try {
			call = instance.getConnection().prepareCall(sql);
			call.execute();
			rs = call.getResultSet();
			
		} catch (SQLException e) {
			e.printStackTrace();
			return elements;
		}
		
		try {
			while (rs.next()){
				switch (rs.getInt("id_elements")) {
				case 1:
					// horizontal wall
					Wall wall = new Wall(rs.getInt("coord_X"), rs.getInt("coord_Y"), ImageLoader.horizontal_bone);
					hWallList.add(wall);
					elements.add(wall);
					break;
				case 2:
					// vertical wall
					Wall wall2 = new Wall(rs.getInt("coord_X"), rs.getInt("coord_Y"), ImageLoader.vertical_bone);
					vWallList.add(wall2);
					elements.add(wall2);

					break;
				case 3:
					// round wall
					Wall wall3 = new Wall(rs.getInt("coord_X"), rs.getInt("coord_Y"), ImageLoader.bone);
					rWallList.add(wall3);
					elements.add(wall3);
					break;
				case 4:
					// round wall
					CrystalBall crystalBall = new CrystalBall(rs.getInt("coord_X"), rs.getInt("coord_Y"), ImageLoader.crystal_ball);
					cBallList.add(crystalBall);
					elements.add(crystalBall);
					break;
				case 5:
					// round wall
					Purse purse = new Purse(rs.getInt("coord_X"), rs.getInt("coord_Y"), ImageLoader.purse);
					purseList.add(purse);
					elements.add(purse);
					break;
				case 6:
					// round wall
					Gate gate = new Gate(rs.getInt("coord_X"), rs.getInt("coord_Y"), ImageLoader.gate);
					gateCList.add(gate);
					elements.add(gate);
					break;
				case 7:
					// round wall
					Gate gate2 = new Gate(rs.getInt("coord_X"), rs.getInt("coord_Y"), ImageLoader.gate);
					gateOList.add(gate2);
					elements.add(gate2);
					break;
				case 8:
					// round wall
					Arrbarr arrbarr = new Arrbarr(Direction.UP ,rs.getInt("coord_X"), rs.getInt("coord_Y"), ImageLoader.monster_1);
					monster1List.add(arrbarr);
					elements.add(arrbarr);
					elementsMobile.add(arrbarr);
					break;
				case 9:
					// round wall
					Cargyv cargyv = new Cargyv(Direction.UP ,rs.getInt("coord_X"), rs.getInt("coord_Y"), ImageLoader.monster_2);
					monster2List.add(cargyv);
					elements.add(cargyv);
					elementsMobile.add(cargyv);
					break;
				case 10:
					// round wall
					Kyrac kyrac = new Kyrac(Direction.UP ,rs.getInt("coord_X"), rs.getInt("coord_Y"), ImageLoader.monster_3);
					monster3List.add(kyrac);
					elements.add(kyrac);
					elementsMobile.add(kyrac);
					break;
				case 11:
					// round wall
					Maarcg maarcg = new Maarcg(Direction.UP ,rs.getInt("coord_X"), rs.getInt("coord_Y"), ImageLoader.monster_4);
					monster4List.add(maarcg);
					elements.add(maarcg);
					elementsMobile.add(maarcg);
					break;
				case 12:
					Hero hero = new Hero(Direction.UP ,rs.getInt("coord_X"), rs.getInt("coord_Y"), ImageLoader.player);
					rLorannList.add(hero);
					elements.add(hero);
					break;
				default:
					break;
				}

				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return elements;
		
	}
	
	public ArrayList<IElement> getMobile(){
		return elementsMobile;
	}
	
	public void monsterMove(){
		
	}
	
	public void playerDirection(Direction direction){
		for(Hero object : rLorannList){
			object.setDirection(direction);
			object.setMoveSprite();
		}
		playerMove();
	}
	
	public void playerMove(){
		for(Hero object : rLorannList){
			IElement goalPosition = getElementCoordinates(object, "move");
			if(goalPosition != null){
				switch(goalPosition.getPermeability()){
				case PENETRABLE: move(object, goalPosition.getPosX(), goalPosition.getPosY());
				goalPosition.setExisting();
				elements.remove(goalPosition);
					break;
				case BLOCKING:
					break;
				case KILLING:
					break;
				case KILLER:
					break;
				default: move(object, goalPosition.getPosX(), goalPosition.getPosY());
					break;
				}
			}
		}
	}

	public void move(Mobile mobile, int x, int y){
		mobile.setPosX(x);
		mobile.setPosY(y);
		System.out.println("Nouvelles coordonnées   : x = "+elements.get(26).getPosX()+" y = "+elements.get(26).getPosY()+"\n");
	}
	
	public IElement getElementCoordinates(Mobile mobile, String order) {
		int x = mobile.getPosX() ,y = mobile.getPosY();
		switch(mobile.getDirection()){
		case UP: y = mobile.getPosY() - 1; 
		break;
	case DOWN: y = mobile.getPosY() + 1;
		break;
	case LEFT: x = mobile.getPosX() - 1;
		break;
	case RIGHT: x = mobile.getPosX() + 1;
		break;
	case UPPER_RIGHT: y = mobile.getPosY() - 1; 
					  x = mobile.getPosX() + 1;
		break;
	case UPPER_LEFT: y = mobile.getPosY() - 1; 
					 x = mobile.getPosX() - 1;
		break;
	case BOTTOM_RIGHT: y = mobile.getPosY() + 1;
					   x = mobile.getPosX() + 1;
		break;
	case BOTTOM_LEFT: y = mobile.getPosY() + 1;
					  x = mobile.getPosX() - 1;
		break; 
		}
		System.out.println("Coordonnées précédentes : x = "+mobile.getPosX()+" y = "+mobile.getPosY());
		for(IElement goalPosition : elements)
			if(goalPosition.getPosX() == x && goalPosition.getPosY() == y){
				return goalPosition;
			}
		if(order == "move")
			move(mobile, x, y);
		else{
			castFireball(fireballDirection(mobile.getDirection()), x, y);
			
		}
		return null;
	}

	public void playerShot() {
		for(Hero object : rLorannList){
			Direction playerDir = object.getDirection();
			IElement goalPosition = getElementCoordinates(object, "attack");
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

}