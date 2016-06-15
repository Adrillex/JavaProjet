package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PositionTest {
	
	private Position position;

	@Before
	public void setUp() throws Exception {
		this.position = new Position(2,3);
	}

	@Test
	public void testGetX() {
		assertEquals(this.position.getX(), 2);
	}

	@Test
	public void testGetY() {
		assertEquals(this.position.getY(), 3);
	}

	@Test
	public void testGetPosition() {
		assertEquals(this.position, position.getPosition());
	}
	
	@Test
	public void testSetX(){
		this.position.setX(10);
		assertEquals(this.position.getX(), 10);
	}
	
	@Test
	public void testSetY(){
		this.position.setY(15);
		assertEquals(this.position.getY(), 15);
	}

}
