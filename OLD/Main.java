package city_j.OLD;

import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import javax.swing.*;

public class Main {
	public static void makeWindow(String title, BufferedImage[] play_map){
//		Set up the frame
		JFrame frame = new JFrame(title);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(10, 10));
		frame.setResizable(false);
		frame.setVisible(true);
		
		for (int i = 0; i < 100; i++){
//			frame.add(new JLabel("This is a label"));
			frame.add(new JLabel(new ImageIcon(play_map[i])));
		}
		 
//		Pack all of our lovely items into the frame
		frame.pack();
	}
	
	public static void main(String args[]){
		BufferedImage[] play_map = ReadMap.Read_Map("/Users/jack.sarick/Code/Java Game/defence/src/defence/map_1.map", 100);
		makeWindow("Defence", play_map);
	}
}
