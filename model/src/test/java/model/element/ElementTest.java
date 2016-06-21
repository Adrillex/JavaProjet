package model.element;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.Direction;
import contract.Permeability;
import model.ImageLoader;
import model.element.mobile.Hero;

public class ElementTest {

	private Element element;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ImageLoader.loadImage();
	}

	@Before
	public void setUp() throws Exception {
		this.element = new Hero(Direction.RIGHT, 2, 3, ImageLoader.player);
		}

	@Test
	public void testGetSprite() {
		if (this.element.getSprite().getWidth() == ImageLoader.player[0].getWidth() && this.element.getSprite().getHeight() == ImageLoader.player[0].getHeight()) {
	        for (int x = 0; x < this.element.getSprite().getWidth(); x++) {
	            for (int y = 0; y < this.element.getSprite().getHeight(); y++) {
	                if (this.element.getSprite().getRGB(x, y) != ImageLoader.player[0].getRGB(x, y))
	                	fail("Images are different");
	            }
	        }
	    } else {
	    	fail("Images are different");
	    }

	}

	@Test
	public void testGetPosX() {
		assertEquals(2, this.element.getPosX());
	}

	@Test
	public void testGetPosY() {
		assertEquals(3, this.element.getPosY());
	}

	@Test
	public void testGetPermeability() {
		assertEquals(Permeability.HERO, this.element.getPermeability());
	}

	@Test
	public void testGetID() {
		assertEquals(0, this.element.getID());
	}

	@Test
	public void testGetState() {
		assertEquals(true, this.element.getState());
	}

	@Test
	public void testSetExisting() {
		this.element.setExisting(true);
		assertEquals(true, this.element.getState());
	}

	@Test
	public void testSetSprite() {
		this.element.setSprite(ImageLoader.player[1]);
		if (this.element.getSprite().getWidth() == ImageLoader.player[1].getWidth() && this.element.getSprite().getHeight() == ImageLoader.player[1].getHeight()) {
	        for (int x = 0; x < this.element.getSprite().getWidth(); x++) {
	            for (int y = 0; y < this.element.getSprite().getHeight(); y++) {
	                if (this.element.getSprite().getRGB(x, y) != ImageLoader.player[1].getRGB(x, y))
	                	fail("Images are different");
	            }
	        }
	    } else {
	    	fail("Images are different");
	    }
	}

	@Test
	public void testSetPosX() {
		this.element.setPosX(3);
		assertEquals(3, this.element.getPosX());
	}

	@Test
	public void testSetPosY() {
		this.element.setPosY(10);
		assertEquals(10, this.element.getPosY());
	}

}
