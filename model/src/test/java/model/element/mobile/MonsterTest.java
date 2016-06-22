package model.element.mobile;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.Direction;
import model.ImageLoader;

public class MonsterTest {

	
	Monster monster;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ImageLoader.loadImage("lorann");
	}

	@Before
	public void setUp() throws Exception {
		this.monster = new Arrbarr(Direction.UP, 3,5, ImageLoader.monster_1);
	}

	@Test
	public void testReverse() {
		this.monster.reverse();
		assertEquals(Direction.DOWN, this.monster.getDirection());
	}

}
