package AloneTiles;

import java.awt.image.BufferedImage;

import AloneGFX.Assets;

public class DoorTile extends Tile{

	public DoorTile(int id) {
		super(Assets.door, id);
		
	}
	public boolean isSolid(){
		return true;

	}
}
