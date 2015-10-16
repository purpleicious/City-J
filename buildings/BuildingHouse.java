package city_j.buildings;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import city_j.media.SpriteSheet;

public class BuildingHouse extends BuildingAbstract {
	
	// Added a custom constructor that draws upon instantiating
	public BuildingHouse(Graphics g, int x, int y, int houseNumber) {
		
//		get correct tile
//		Blue, Green 0, Red, Green 2, Orange 2, Green 1, Orange 1, Yellow
		BufferedImage houseTile = SpriteSheet.spriteSheet("/Users/jack.sarick/Schoolwork_15-16/APC/city_j/src/city_j/media/house_tiles.png", 65, 72, 1, 8)[houseNumber];
		
		// this refers to current instance of class
		this.setX(x);
		this.setY(y);
		this.setWidth(65);
		this.setHeight(72);
		this.setTile(houseTile);
		
		// calls the super class draw method.
		// you can also use the this.draw(); this refers to the current instance object
		this.draw(g);
	}
	
}
