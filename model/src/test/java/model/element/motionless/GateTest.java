package model.element.motionless;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.ImageLoader;

public class GateTest {

	/** the attribute gate **/
	Gate gate;
	
	/**BeforeClass
	 * 
	 * @throws Exception
	 *	beforeclass
	 */	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ImageLoader.loadImage("lorann");
		}
	/**
	 * 
	 * @throws Exception
	 * setUp
	 */
	@Before
	public void setUp() throws Exception {
		gate = new Gate(2, 4, ImageLoader.gate);
	}

	/** The test of getOpen **/
	@Test
	public void testGetOpen() {
		assertEquals(false, this.gate.getOpen());
	}

	/** The test of setOpen **/
	@Test
	public void testSetOpen() {
		this.gate.setOpen();
		assertEquals(true, this.gate.getOpen());
	}

}
