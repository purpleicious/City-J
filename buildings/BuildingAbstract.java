package city_j.buildings;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public abstract class BuildingAbstract {

	// hide data or encapsulate, so setters and getters have to be used in case input has to be checked
	// int data possible data values are between -2,147,483,648 to 2,147,483,647, youtube can't use int anymore due to Justin Bieber! 
	private int xCoord;
	private int yCoord;
	private int width;
	private int height;
	private BufferedImage tile;
		
	public BuildingAbstract() {

		xCoord = 0;
		yCoord = 0;
		width = 100;
		height = 100;
		
	}
	
	public void setWidth(int d) {
		width = d;
	}
	
	public void setHeight(int d) {
		height = d;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getX() {
		return xCoord;
	}
	
	public void setX(int x) {
		xCoord = x;
	}
	
	public int getY() {
		return yCoord;
	}
	
	public void setY(int y) {
		yCoord = y;
	}
	
	public double getArea() {
		return width * height;
	}
	
	public void setTile(BufferedImage tileToSet){
		tile = tileToSet;
	}
	
	public void setCoord(int x, int y){
		xCoord = x;
		yCoord = y;
	}
	
	// The "signature of a method" in java is its name and parameters, which allows you to use it
	public void draw(Graphics g) {
		g.drawImage(tile, xCoord, yCoord, null);
	}
	
}
