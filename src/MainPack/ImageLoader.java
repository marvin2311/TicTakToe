package MainPack;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageLoader {

	static Image imgX, imgO;
	
	public ImageLoader() {
		try {
			imgX = ImageIO.read(new File("res/imgX.png"));
			imgO = ImageIO.read(new File("res/imgO.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
