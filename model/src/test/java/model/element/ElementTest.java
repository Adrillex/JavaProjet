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

	/** The element **/
	private Element element;
	
	/** 
	 * Sprite initialization 
	 * @throws Exception
	 * BeforeClass**/
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ImageLoader.loadImage();
	}

	/** Instantiation of an element object using the hero constructor 
	 * @throws Exception
	 * setup**/
	@Before
	public void setUp() throws Exception {
		this.element = new Hero(Direction.RIGHT, 2, 3, ImageLoader.player);
		}

	/**Testing getSprite with a sprite comparison**/
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
	/** Test of the getPosX method **/
	@Test
	public void testGetPosX() {
		assertEquals(2, this.element.getPosX());
	}

	/**Test of the getPosY method **/
	@Test
	public void testGetPosY() {
		assertEquals(3, this.element.getPosY());
	}

	/**Test of the getPermeability method **/
	@Test
	public void testGetPermeability() {
		assertEquals(Permeability.HERO, this.element.getPermeability());
	}

	/**Test of the getID method **/
	@Test
	public void testGetID() {
		assertEquals(0, this.element.getID());
	}

	@Test
	public void testGetState() {
		assertEquals(true, this.element.getState());
	}

	/**Test of the setExisting method **/
	@Test
	public void testSetExisting() {
		this.element.setExisting(false);
		assertEquals(false, this.element.getState());
	}

	/**Test of the setSprite method **/
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

}
