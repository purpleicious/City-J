package city_j;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import city_j.buildings.BuildingHouse;
import city_j.media.SpriteSheet;


public class CityLayout extends JPanel
{
	private static final long serialVersionUID = 1L;
	
	
    @SuppressWarnings("unused")
	public void paintComponent(Graphics g)
    {
//    	I dunno. Makes things draw
    	super.paintComponent(g);
    	
//    	Draw a background (I'm lazy, so load it as a spritesheet with one image)
    	BufferedImage background_img = SpriteSheet.spriteSheet("/Users/jack.sarick/Schoolwork_15-16/APC/city_j/src/city_j/media/grass.png", 800, 600, 1, 1)[0];
    	g.drawImage(background_img, 0, 0, null);
    			
//    	Make the little houses
        BuildingHouse red_house = new BuildingHouse(g, 0, 0, 1);
        BuildingHouse blue_house = new BuildingHouse(g, 65, 0, 0);
        BuildingHouse green2_house = new BuildingHouse(g, 0, 72, 3);
        BuildingHouse orange1_house = new BuildingHouse(g,65, 72, 6);
        BuildingHouse yellow_house = new BuildingHouse(g, 130, 0, 7);

        // Use the CityBuildingAbstract getArea method to find the area - this is an example of procedural abstraction
        // In other words, the getArea procedure is a "black box". You use it and get back a value,
        // you don't need to know the inner workings of the function.
        System.out.print("Area\n");
        System.out.print(red_house.getArea());
        
    }

}

