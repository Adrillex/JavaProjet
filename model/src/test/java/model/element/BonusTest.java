package model.element;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BonusTest {

	/** The bonus test **/
	Bonus bonus;

	/** The setUp **/
	@Before
	public void setUp() throws Exception {
		bonus = new Bonus(10);
	}

	/** The getter test **/
	@Test
	public void testGetBonus() {
		assertEquals(10, this.bonus.getBonus());
	}

}
