package model.actions;

import model.ImageLoader;
import model.Stage;

public class SpriteSwitcher {
	static int i = 0;
	static int j = 0;
	
	public static void fireBallLoader(){
		if (i < 4) i ++;
		else i = 0;
		Stage.fireball.setSprite(ImageLoader.fireball[i]);
	}
	
	public static void lorannloader(){
		if (j < 7) j ++;
		else j = 0;
		if(!Stage.rLorannList.isEmpty())Stage.rLorannList.get(0).setSprite(ImageLoader.player[j]);
	}
}
