package model.element;

public class Bonus implements IBonus{

	private int bonus;
	
	/** the constructor Bonus
	 * 
	 * @param bonus
	 * 	the bonus value of the object
	 */
	public Bonus(int bonus){
		this.bonus = bonus;
	}
	
	//getter
	public int getBonus() {
		return bonus;
	}

}
