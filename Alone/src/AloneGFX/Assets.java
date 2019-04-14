package AloneGFX;

import java.awt.image.BufferedImage;

public class Assets {

	private static final int width = 32, height = 32;
	
	public static BufferedImage player, walls, grass, door, enemy;
	
	public static void init(){
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/Sprite1.png"));
		
		player = sheet.crop(0, 256, width, height);
		grass = sheet.crop(480, 32, width, height);
		walls = sheet.crop(480, 0, width, height);
		door = sheet.crop(128, 0, width, height);
		enemy = sheet.crop(0, 384, width, height);
		
	}
}
