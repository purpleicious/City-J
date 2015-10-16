package city_j;

import javax.swing.JFrame;

import city_j.CityLayout;

public class CityMain {

    public static void main(String[] args)
   {
        // create and configure the frame (window) for the program
        JFrame frame = new JFrame();
       
        frame.setSize(800 /* x */, 600 /* y */);
        frame.setTitle("Cityscape");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        // a frame contains a single component; create the Cityscape component and add it to the frame
        CityLayout component = new CityLayout();
        frame.add(component);
       
        // make the frame visible which will result in the paintComponent method being invoked on the
        //  component.
        frame.setVisible(true);
    }

}
