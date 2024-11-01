package main;

import entity.Entity;

public class CollisionDetection {
	GamePanel gp;
	
	public CollisionDetection(GamePanel gp) {
		this.gp = gp;
	}
	
	public void checkTile(Entity entity) {
		int entityLeftWorldX = entity.worldX + entity.collisionArea.x;
		int entityRightWorldX = entity.worldX + entity.collisionArea.x + entity.collisionArea.width;
		int entityTopWorldY = entity.worldY + entity.collisionArea.y;
		int entityBottomWorldY = entity.worldY + entity.collisionArea.y + entity.collisionArea.height;
		
		int entityLeftCol = entityLeftWorldX / gp.tileSize;
		int entityRightCol = entityRightWorldX / gp.tileSize;
		int entityTopRow = entityTopWorldY / gp.tileSize;
		int entityBopttomRow = entityBottomWorldY / gp.tileSize;
		
		int tileNum1, tileNum2;
		
		switch(entity.direction) {
		case "up":
			entityTopRow = (entityTopWorldY - entity.speed) / gp.tileSize;
			tileNum1 = gp.tileManager.mapTileNum[entityLeftCol][entityTopRow];
			tileNum2 = gp.tileManager.mapTileNum[entityRightCol][entityTopRow];
			
			if(gp.tileManager.tile[tileNum1].collision || gp.tileManager.tile[tileNum2].collision) {
				entity.isColliding = true;
			}
			break;
		case "down":
			entityBopttomRow = (entityBottomWorldY + entity.speed) / gp.tileSize;
			tileNum1 = gp.tileManager.mapTileNum[entityLeftCol][entityBopttomRow];
			tileNum2 = gp.tileManager.mapTileNum[entityRightCol][entityBopttomRow];
			
			if(gp.tileManager.tile[tileNum1].collision || gp.tileManager.tile[tileNum2].collision) {
				entity.isColliding = true;
			}
			break;
		case "left":
			entityLeftCol = (entityLeftWorldX - entity.speed) / gp.tileSize;
			tileNum1 = gp.tileManager.mapTileNum[entityLeftCol][entityTopRow];
			tileNum2 = gp.tileManager.mapTileNum[entityLeftCol][entityBopttomRow];
			
			if(gp.tileManager.tile[tileNum1].collision || gp.tileManager.tile[tileNum2].collision) {
				entity.isColliding = true;
			}
			break;
		case "right":
			entityRightCol = (entityRightWorldX + entity.speed) / gp.tileSize;
			tileNum1 = gp.tileManager.mapTileNum[entityRightCol][entityTopRow];
			tileNum2 = gp.tileManager.mapTileNum[entityRightCol][entityTopRow];
			
			if(gp.tileManager.tile[tileNum1].collision || gp.tileManager.tile[tileNum2].collision) {
				entity.isColliding = true;
			}
			break;
		}
	}
}
