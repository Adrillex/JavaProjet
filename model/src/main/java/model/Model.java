package model;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import contract.Direction;
import contract.IElement;
import contract.IModel;

/**
 * The Class Model.
 *
 * @author Jean-Aymeric Diet
 */
public class Model implements IModel {
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
		ArrayList <IElement> elements = new ArrayList <IElement>();
		
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
			// TODO Auto-generated catc block
			e.printStackTrace();
			return elements;
		}
		
		try {
			while (rs.next()){
				switch (rs.getInt("id_elements")) {
				case 1:
					// horizontal wall
					hWallList.add(new Wall(rs.getInt("coord_X"), rs.getInt("coord_Y"), ImageLoader.horizontal_bone));
					elements.add(new Wall(rs.getInt("coord_X"), rs.getInt("coord_Y"), ImageLoader.horizontal_bone));
					break;
				case 2:
					// vertical wall
					vWallList.add(new Wall(rs.getInt("coord_X"), rs.getInt("coord_Y"), ImageLoader.vertical_bone));
					elements.add(new Wall(rs.getInt("coord_X"), rs.getInt("coord_Y"), ImageLoader.vertical_bone));
					break;
				case 3:
					// round wall
					rWallList.add(new Wall(rs.getInt("coord_X"), rs.getInt("coord_Y"), ImageLoader.bone));
					elements.add(new Wall(rs.getInt("coord_X"), rs.getInt("coord_Y"), ImageLoader.bone));
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
	
	private ArrayList<Mobile> getMobile(){
		return null;
	}
	
	public void monsterMove(){
	}
	
	public void playerMove(Direction direction){
		for(Hero object : rLorannList){
			object.setDirection(direction);
			if(object.isThisMovePossible()){
				move(direction, object);
			}
		}
	}

	private void move(Direction direction, Mobile mobile){
		switch(direction){
		case UP: mobile.setPosY(mobile.getPosY() - 1); 
		break;
	case DOWN: mobile.setPosY(mobile.getPosY() + 1); 
		break;
	case LEFT: mobile.setPosX(mobile.getPosX() - 1); 
		break;
	case RIGHT: mobile.setPosX(mobile.getPosX() + 1); 
		break;
	case UPPER_RIGHT: mobile.setPosY(mobile.getPosY() - 1); 
					  mobile.setPosX(mobile.getPosX() + 1); 
		break;
	case UPPER_LEFT: mobile.setPosY(mobile.getPosY() - 1); 
					 mobile.setPosX(mobile.getPosX() - 1); 
		break;
	case BOTTOM_RIGHT: mobile.setPosY(mobile.getPosY() - 1); 
					   mobile.setPosX(mobile.getPosX() + 1); 	
		break;
	case BOTTOM_LEFT: mobile.setPosY(mobile.getPosY() - 1); 
					  mobile.setPosX(mobile.getPosX() - 1); 
		break; 
		}
	}
	
	
	private void moveUp(){
		
	}
	
	private void moveDown(){
		
	}



}
