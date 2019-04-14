package AloneSt;

import java.awt.Graphics;

import Alone.Game;
import AloneEnty.Cre.Player;
import AloneGFX.Assets;
import AloneTiles.Tile;
import AloneWorld.World;

public class GameState extends State{
	
	private Player player;
	private World world;
	
	public GameState(Game game){
		super(game);
		player = new Player(game, 100, 100);
		world = new World("res/worlds/map1.txt");
	}

	@Override
	public void tick() {
		world.tick();
		player.tick();
	}

	@Override
	public void render(Graphics g) {
		world.render(g);
		player.render(g);
	}
}