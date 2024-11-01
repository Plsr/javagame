package main;

import object.Key;
import object.Door;
import object.Chest;

public class AssetManager {
	GamePanel gp;
	
	public AssetManager(GamePanel gp) {
		this.gp = gp;
	}
	
	public void setObject() {
		gp.objects[0] = new Key();
		gp.objects[0].worldX = 23 * gp.tileSize;
		gp.objects[0].worldY = 7 * gp.tileSize;
		
		gp.objects[1] = new Key();
		gp.objects[1].worldX = 25 * gp.tileSize;
		gp.objects[1].worldY = 40 * gp.tileSize;
		
		gp.objects[2] = new Key();
		gp.objects[2].worldX = 38 * gp.tileSize;
		gp.objects[2].worldY = 8 * gp.tileSize;
		
		gp.objects[3] = new Door();
		gp.objects[3].worldX = 10 * gp.tileSize;
		gp.objects[3].worldY = 11 * gp.tileSize;
		
		gp.objects[4] = new Door();
		gp.objects[4].worldX = 12 * gp.tileSize;
		gp.objects[4].worldY = 22 * gp.tileSize;
		
		gp.objects[5] = new Chest();
		gp.objects[5].worldX = 10 * gp.tileSize;
		gp.objects[5].worldY = 7 * gp.tileSize;
	
	}
}
