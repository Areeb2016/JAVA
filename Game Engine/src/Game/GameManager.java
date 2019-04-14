package Game;

import java.awt.event.KeyEvent;

import GameEngine.GameAbstract;
import GameEngine.GameContainer;
import GameEngine.GameRenderer;
import GameEngine.audio.SoundClip;
import GameEngine.gfx.Image;
import GameEngine.gfx.ImageTile;
import GameEngine.gfx.Light;

public class GameManager extends GameAbstract {
			
	private Image image;
	private SoundClip clip;
	private ImageTile image2;
	private Light light;
	
	public GameManager(){
		image = new Image("/test.png");
		image.setLightBlock(Light.FULL);
		image.setAlpha(false);
		image2 = new ImageTile("/test2.png", 16, 16);
		image2.setAlpha(false);
		light = new Light(100, 0xfffb23fb);
		clip = new SoundClip("/audio/test.wav");
		clip.setVolume(0);
	}
	
	public void reset(){
		
	}

	@Override
	public void update(GameContainer gc, float dt) {
		if(gc.getInput().isKeyDown(KeyEvent.VK_A)){
			System.out.println("A is pressed");
			clip.play();
		}
		
		temp += dt * 10;
		if(temp > 4){
			temp = 0;
		}
				
	}
	
	float temp = 0;
			
	@Override
	public void render(GameContainer gc, GameRenderer r) {
		
		r.setzDepth(0);
		r.drawImage(image2, 0, 0);
		r.drawImage(image, 120, 100);
		r.drawLight(light, gc.getInput().getMouseX(), gc.getInput().getMouseY());
		
				
	}
	
	public static void main(String[] args){
		GameContainer gc = new GameContainer(new GameManager());
		gc.setWidth(320);
		gc.setHeight(240);
		gc.setScale(2f);
		gc.start();
	}

}
