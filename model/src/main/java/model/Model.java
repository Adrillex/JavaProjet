package model;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import contract.IModel;

/**
 * The Class Model.
 *
 * @author Jean-Aymeric Diet
 */
public class Model implements IModel {

	/**
	 * Instantiates a new model.
	 */
	public Model() {
	}
	
	public void LoadStage(int Stage){
		ArrayList <Wall> vWallList = new ArrayList <Wall>();
		ArrayList <Wall> hWallList = new ArrayList <Wall>();
		ArrayList <Wall> rWallList = new ArrayList <Wall>();
		ArrayList <CrystalBall> cBallList = new ArrayList <CrystalBall>();
		ArrayList <Purse> purseList = new ArrayList <Purse>();
		ArrayList <Gate> gateCList = new ArrayList <Gate>();
		ArrayList <Gate> gateOList = new ArrayList <Gate>();
		ArrayList <Monster> monster1List = new ArrayList <Monster>();
		ArrayList <Monster> monster2List = new ArrayList <Monster>();
		ArrayList <Monster> monster3List = new ArrayList <Monster>();
		ArrayList <Monster> monster4List = new ArrayList <Monster>();
		ArrayList <Hero> rLorannList = new ArrayList <Hero>();
		
		int numStage = 1;
		DBConnection instance = DBConnection.getInstance();
		final String sql = "{call VoirStage" + numStage + "}";
		final CallableStatement call = instance.getConnection().prepareCall(sql);
		call.execute();
		final ResultSet rs = call.getResultSet();
		
		while (rs.next()){
			switch (rs.getInt(id)) {
			case 1:
				// horizontal wall
				
				break;
			case 2:
				// vertical wall
				break;
			case 3:
				// round wall
				break;
			
			default:
				break;
			}
		}
		
	}
	
	private ArrayList<Mobile> getMobile(){
		return null;
	}
	
	



}
