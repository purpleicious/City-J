package city_j;

import java.awt.Graphics;
import javax.swing.JPanel;

import city_j.buildings.BuildingHouse;


public class CityLayout extends JPanel
{
	private static final long serialVersionUID = 1L;
	
	
    public void paintComponent(Graphics g)
    {
    	super.paintComponent(g);
    	int x_coord = 0;
        BuildingHouse red_house = new BuildingHouse(g, (x_coord * 65), 0, 1);
        x_coord++;
        BuildingHouse blue_house = new BuildingHouse(g, (x_coord * 65), 0, 0);
        x_coord++;
        BuildingHouse green2_house = new BuildingHouse(g, (x_coord * 65), 0, 3);
        x_coord++;
        BuildingHouse orange1_house = new BuildingHouse(g, (x_coord * 65), 0, 6);
        
        // Use the CityBuildingAbstract getArea method to find the area - this is an example of procedural abstraction
        // In other words, the getArea procedure is a "black box". You use it and get back a value,
        // you don't need to know the inner workings of the function.
        System.out.print("Area\n");
        System.out.print(red_house.getArea());
        
    }

}

