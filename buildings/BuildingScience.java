package city_j.buildings;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import city_j.media.SpriteSheet;

public class BuildingScience extends BuildingAbstract {
	
	// Added a custom constructor that draws upon instantiating
	public BuildingScience(Graphics g, int x, int y, int houseNumber) {
		
//		get correct tile
//		Laboratory and Radio
		BufferedImage building_tile = SpriteSheet.spriteSheet("/Users/jack.sarick/Schoolwork_15-16/APC/city_j/src/city_j/media/big_building_tiles.png", 150, 182, 1, 2)[houseNumber];
		
		// this refers to current instance of class
		this.setX(x);
		this.setY(y);
		this.setWidth(150);
		this.setHeight(182);
		this.setTile(building_tile);
		
		// calls the super class draw method.
		// you can also use the this.draw(); this refers to the current instance object
		this.draw(g);
	}
	
}
