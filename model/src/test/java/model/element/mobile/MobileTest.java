package model.element.mobile;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.Direction;
import model.ImageLoader;

public class MobileTest {

	
	private Mobile mobile;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ImageLoader.loadImage();
	}

	@Before
	public void setUp() throws Exception {
	mobile = new Hero(Direction.RIGHT, 5, 6, ImageLoader.player);	
	}

	@Test
	public void testGetDirection() {
		assertEquals(Direction.RIGHT, this.mobile.getDirection());
	}

	@Test
	public void testSetDirection() {
		this.mobile.setDirection(Direction.LEFT);
		assertEquals(Direction.LEFT, this.mobile.getDirection());
	}
	
	@Test
	public void testMoveRight() {
		this.mobile.move();
		assertEquals(6, this.mobile.getPosX());
	}
	
	@Test
	public void testMoveUp() {
		this.mobile.setDirection(Direction.UP);
		this.mobile.move();
		assertEquals(5, this.mobile.getPosY());	
		}
	
	@Test
	public void testMoveDown() {
		this.mobile.setDirection(Direction.DOWN);
		this.mobile.move();
		assertEquals(7, this.mobile.getPosY());	}
	
	@Test
	public void testMoveLeft() {
		this.mobile.setDirection(Direction.LEFT);
		this.mobile.move();
		assertEquals(4, this.mobile.getPosX());	}
	
	@Test
	public void testMoveUpperRight() {
		this.mobile.setDirection(Direction.UPPER_RIGHT);
		this.mobile.move();
		assertEquals(6, this.mobile.getPosX());	
		assertEquals(5, this.mobile.getPosY());
		}
	
	@Test
	public void testMoveUpperLeft() {
		this.mobile.setDirection(Direction.UPPER_LEFT);
		this.mobile.move();
		assertEquals(4, this.mobile.getPosX());
		assertEquals(5, this.mobile.getPosY());
	}
	
	@Test
	public void testMoveBottomRight() {
		this.mobile.setDirection(Direction.BOTTOM_RIGHT);
		this.mobile.move();
		assertEquals(6, this.mobile.getPosX());	
		assertEquals(7, this.mobile.getPosY());
		}
	
	@Test
	public void testMoveBottomLeft() {
		this.mobile.setDirection(Direction.BOTTOM_LEFT);
		this.mobile.move();
		assertEquals(4, this.mobile.getPosX());
		assertEquals(7, this.mobile.getPosY());
	}

}
