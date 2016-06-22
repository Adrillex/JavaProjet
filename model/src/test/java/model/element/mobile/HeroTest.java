package model.element.mobile;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.Direction;
import model.ImageLoader;

public class HeroTest {
	/** The test hero **/
	private Hero hero;
	/** Sprite initialization 
	 * @throws Exception
	 * BeforeClass**/
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ImageLoader.loadImage("lorann");
	}
	/** Instantiation of an element object using the hero constructor 
	 * @throws Exception
	 * setup**/
	@Before
	public void setUp() throws Exception {
		this.hero = new Hero(Direction.RIGHT, 2, 4, ImageLoader.player);
	}

	/** Compare Images
	 * @param i
	 * 		the sprite number i
	 */
	public void ImageComparison(int i){
		if (this.hero.getSprite().getWidth() == ImageLoader.player[i].getWidth() && this.hero.getSprite().getHeight() == ImageLoader.player[i].getHeight()) {
	        for (int x = 0; x < this.hero.getSprite().getWidth(); x++) {
	            for (int y = 0; y < this.hero.getSprite().getHeight(); y++) {
	                if (this.hero.getSprite().getRGB(x, y) != ImageLoader.player[i].getRGB(x, y))
	                	fail("Images are different");
	            }
	        }
	    } else {
	    	fail("Images are different");
	    }
	}
	/** Test of setMoveSprite when moving to the right **/
	@Test
	public void testSetMoveSpriteRight() {
		this.hero.setMoveSprite();
		ImageComparison(2);
	}
	/** Test of setMoveSprite when moving to the left **/
	@Test
	public void testSetMoveSpriteLeft() {
		this.hero.setDirection(Direction.LEFT);
		this.hero.setMoveSprite();
		ImageComparison(6);
	}
	/** Test of setMoveSprite when moving to the top **/
	@Test
	public void testSetMoveSpriteUp() {
		this.hero.setDirection(Direction.UP);
		this.hero.setMoveSprite();
		ImageComparison(4);
	}
	/** Test of setMoveSprite when moving to the bottom **/
	@Test
	public void testSetMoveSpriteDown() {
		this.hero.setDirection(Direction.DOWN);
		this.hero.setMoveSprite();
		ImageComparison(0);
	}
	/** Test of setMoveSprite when moving to the UpperRight **/
	@Test
	public void testSetMoveSpriteUpperRight() {
		this.hero.setDirection(Direction.UPPER_RIGHT);
		this.hero.setMoveSprite();
		ImageComparison(3);
	}
	/** Test of setMoveSprite when moving to the UpperLeft **/
	@Test
	public void testSetMoveSpriteUpperLeft() {
		this.hero.setDirection(Direction.UPPER_LEFT);
		this.hero.setMoveSprite();
		ImageComparison(5);
	}
	/** Test of setMoveSprite when moving to the BottomRight **/
	@Test
	public void testSetMoveSpriteBottomRight() {
		this.hero.setDirection(Direction.BOTTOM_RIGHT);
		this.hero.setMoveSprite();
		ImageComparison(1);
	}
	/** Test of setMoveSprite when moving to the BottomLeft **/
	@Test
	public void testSetMoveSpriteBottomLeft() {
		this.hero.setDirection(Direction.BOTTOM_LEFT);
		this.hero.setMoveSprite();
		ImageComparison(7);
	}
}
