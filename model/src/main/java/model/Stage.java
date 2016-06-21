package model;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import contract.Direction;
import contract.IElement;
import model.database.DBConnection;
import model.element.Bonus;
import model.element.mobile.Arrbarr;
import model.element.mobile.Cargyv;
import model.element.mobile.Fireball;
import model.element.mobile.Hero;
import model.element.mobile.Kyrac;
import model.element.mobile.Maarcg;
import model.element.mobile.Monster;
import model.element.motionless.CrystalBall;
import model.element.motionless.Gate;
import model.element.motionless.Purse;
import model.element.motionless.Wall;

public class Stage {
	
	private int numStage;
	private Bonus bPurse;
	public static ArrayList <CrystalBall> cBallList;
	public static ArrayList <Purse> purseList;
	public static ArrayList <Gate> gateCList;
	public static ArrayList <Gate> gateOList;
	public static ArrayList <Hero> rLorannList;
	public static ArrayList <IElement> elements;
	public static ArrayList <Monster> monsterList;
	
	public static Fireball fireball;
	
	public Stage(int numStage, Bonus bPurse){
		this.numStage = numStage;
		this.bPurse = bPurse;
	}

	/** the method LoadStage
	 * 
	 * @return IElements
	 * Create ArrayLists of elements for a later user.
	 */
	public ArrayList <IElement> LoadStage()throws Exception{
		cBallList = new ArrayList <CrystalBall>();
		purseList = new ArrayList <Purse>();
		gateCList = new ArrayList <Gate>();
		gateOList = new ArrayList <Gate>();
		rLorannList = new ArrayList <Hero>();
		elements = new ArrayList <IElement>();
		monsterList = new ArrayList <Monster>();
		fireball = new Fireball(Direction.UP, 19, 11, ImageLoader.fireball[0]);
		fireball.setExisting(false);
		elements.add(fireball);
		
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
					elements.add(new Wall(rs.getInt("coord_X"), rs.getInt("coord_Y"), ImageLoader.horizontal_bone));
					break;
				case 2:
					// vertical wall
					elements.add(new Wall(rs.getInt("coord_X"), rs.getInt("coord_Y"), ImageLoader.vertical_bone));

					break;
				case 3:
					// round wall
					elements.add(new Wall(rs.getInt("coord_X"), rs.getInt("coord_Y"), ImageLoader.bone));
					break;
				case 4:
					// round wall
					CrystalBall crystalBall = new CrystalBall(rs.getInt("coord_X"), rs.getInt("coord_Y"), ImageLoader.crystal_ball);
					cBallList.add(crystalBall);
					elements.add(crystalBall);
					break;
				case 5:
					// round wall
					Purse purse = new Purse(rs.getInt("coord_X"), rs.getInt("coord_Y"), ImageLoader.purse, bPurse);
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
					Arrbarr arrbarr = new Arrbarr(Direction.RIGHT ,rs.getInt("coord_X"), rs.getInt("coord_Y"), ImageLoader.monster_1);
					elements.add(arrbarr);
					monsterList.add(arrbarr);
					break;
				case 9:
					// round wall
					Cargyv cargyv = new Cargyv(Direction.UP ,rs.getInt("coord_X"), rs.getInt("coord_Y"), ImageLoader.monster_2);
					elements.add(cargyv);
					monsterList.add(cargyv);
					break;
				case 10:
					// round wall
					Kyrac kyrac = new Kyrac(Direction.UP ,rs.getInt("coord_X"), rs.getInt("coord_Y"), ImageLoader.monster_3);
					elements.add(kyrac);
					monsterList.add(kyrac);
					break;
				case 11:
					// round wall
					Maarcg maarcg = new Maarcg(Direction.UP ,rs.getInt("coord_X"), rs.getInt("coord_Y"), ImageLoader.monster_4);
					elements.add(maarcg);
					monsterList.add(maarcg);
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
}