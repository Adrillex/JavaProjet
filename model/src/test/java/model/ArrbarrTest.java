package model;

import static org.junit.Assert.*;

import java.io.IOException;

import javax.imageio.ImageIO;

import org.junit.Before;
import org.junit.Test;

import contract.Direction;

public class ArrbarrTest {
	
	private Arrbarr arrbarr;

	@Before
	public void setUp() throws Exception {
		arrbarr = new Arrbarr(Direction.RIGHT, 2, 3, ImageLoader.monster_1);
		}

	@Test
	public void testArrbarr() {
		try {
			assertEquals(arrbarr.getSprite(), ImageIO.read(ImageLoader.class.getResource("monster_1.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
