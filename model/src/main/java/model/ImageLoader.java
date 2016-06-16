package model;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageLoader {
	
	public static BufferedImage[] player;
	public static BufferedImage[] fireball;
	public static BufferedImage[] gate;
	public static BufferedImage bone;
	public static BufferedImage crystal_ball;
	public static BufferedImage horizontal_bone;
	public static BufferedImage vertical_bone;
	public static BufferedImage purse;
	public static BufferedImage monster_1;
	public static BufferedImage monster_2;
	public static BufferedImage monster_3;
	public static BufferedImage monster_4;
	
	public static void loadImage(){
		
		player = new BufferedImage[8];
		fireball = new BufferedImage[5];
		gate = new BufferedImage[2];
				
		try {
			player[0] = ImageIO.read((ImageLoader.class.getResource("lorann_b.png")));
			player[1] = ImageIO.read((ImageLoader.class.getResource("lorann_br.png")));
			player[2] = ImageIO.read((ImageLoader.class.getResource("lorann_r.png")));
			player[3] = ImageIO.read((ImageLoader.class.getResource("lorann_ur.png")));
			player[4] = ImageIO.read((ImageLoader.class.getResource("lorann_u.png")));
			player[5] = ImageIO.read((ImageLoader.class.getResource("lorann_ul.png")));
			player[6] = ImageIO.read((ImageLoader.class.getResource("lorann_l.png")));
			player[7] = ImageIO.read((ImageLoader.class.getResource("lorann_bl.png")));
			
			fireball[0] = ImageIO.read(ImageLoader.class.getResource("fireball_1.png"));
			fireball[1] = ImageIO.read(ImageLoader.class.getResource("fireball_2.png"));
			fireball[2] = ImageIO.read(ImageLoader.class.getResource("fireball_3.png"));
			fireball[3] = ImageIO.read(ImageLoader.class.getResource("fireball_4.png"));
			fireball[4] = ImageIO.read(ImageLoader.class.getResource("fireball_5.png"));
			
			gate[0] = ImageIO.read(ImageLoader.class.getResource("gate_closed.png"));
			gate[1] = ImageIO.read(ImageLoader.class.getResource("gate_open.png"));
			
			bone = ImageIO.read(ImageLoader.class.getResource("bone.png"));
			crystal_ball = ImageIO.read(ImageLoader.class.getResource("crystal_ball.png"));
			horizontal_bone = ImageIO.read(ImageLoader.class.getResource("horizontal_bone.png"));
			vertical_bone = ImageIO.read(ImageLoader.class.getResource("vertical_bone.png"));
			purse = ImageIO.read(ImageLoader.class.getResource("purse.png"));
			monster_1 = ImageIO.read(ImageLoader.class.getResource("monster_1.png"));
			monster_2 = ImageIO.read(ImageLoader.class.getResource("monster_2.png"));
			monster_3 = ImageIO.read(ImageLoader.class.getResource("monster_3.png"));
			monster_4 = ImageIO.read(ImageLoader.class.getResource("monster_4.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
}

