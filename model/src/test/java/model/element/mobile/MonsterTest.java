package model.element.mobile;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.Direction;
import model.ImageLoader;

public class MonsterTest {
	
	/**The monster**/
	private Monster arrbarr;

	/** 
	 * @throws Exception
	 * 	BeforeClass
	 */	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ImageLoader.loadImage("Lorann");
	}

	/**
	 * @throws Exception
	 * 	setUp
	 */
	@Before
	public void setUp() throws Exception {
		this.arrbarr = new Arrbarr(Direction.UP, 2, 8, ImageLoader.monster_1);
	}
	/**
	 * test if the reverse goes to down from up
	 */
	@Test
	public void testReverseUp() {
		this.arrbarr.reverse();
		assertEquals(Direction.DOWN, this.arrbarr.getDirection());
	}
	/**
	 * test if the reverse goes to up from down
	 */
	@Test
	public void testReverseDown() {
		this.arrbarr.setDirection(Direction.DOWN);
		this.arrbarr.reverse();
		assertEquals(Direction.UP, this.arrbarr.getDirection());
	}
	/**
	 * test if the reverse goes to left from right
	 */
	@Test
	public void testReverseRight() {
		this.arrbarr.setDirection(Direction.RIGHT);
		this.arrbarr.reverse();
		assertEquals(Direction.LEFT, this.arrbarr.getDirection());
	}
	/**
	 * test if the reverse goes to right from left
	 */
	@Test
	public void testReverseLeft() {
		this.arrbarr.setDirection(Direction.LEFT);
		this.arrbarr.reverse();
		assertEquals(Direction.RIGHT, this.arrbarr.getDirection());
	}



}
