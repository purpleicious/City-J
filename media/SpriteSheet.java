package city_j.media;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SpriteSheet {

//	This is class/whole file is not well written.
//	The thing is, it works!
	
	public static BufferedImage[] spriteSheet(String file_name, 
			final int width, final int height, final int rows, final int cols){
//		grabs the spritesheet
		BufferedImage bigImg = null;
		try {
			bigImg = ImageIO.read(new File(file_name));
		} catch (IOException e) {
			e.printStackTrace();
		}

//		makes array to store images
		BufferedImage[] sprites = new BufferedImage[rows * cols];
	
//		goes through each cell to get that subimage
		for (int i = 0; i < rows; i++)
		{
		    for (int j = 0; j < cols; j++)
		    {
		        sprites[(i * cols) + j] = bigImg.getSubimage(
		            j * width,
		            i * height,
		            width,
		            height
		        );
		    }
		}
		
//		return spritesheet
		return sprites;
	}
}
