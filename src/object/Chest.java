package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class Chest extends GameObject{
	public Chest() {
		name = "Door";
		
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/chest.png"));
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
