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

}
