package city_j.OLD;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import city_j.media.SpriteSheet;

public class ReadMap {
	public static BufferedImage[] Read_Map(String filename, int room_size){
//		Get all the tiles
		String spriteSheet_1 = "/Users/jack.sarick/Code/Java Game/defence/src/defence/sheet.png";
		BufferedImage[] sprite_sheet = SpriteSheet.spriteSheet(spriteSheet_1, 63, 63 ,4, 8);
		BufferedImage[] room_map = new BufferedImage[room_size];
		int i = 0;
		
		try {
			File file = new File(filename);
			Scanner scanner = new Scanner(file);
			
			while (scanner.hasNextInt()) {
				room_map[i] = sprite_sheet[scanner.nextInt()];
				i++;
			}
			
			scanner.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		
		return room_map;
		
	}
}
