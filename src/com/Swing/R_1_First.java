package com.Swing;
//import javax.swing.*;
import javax.swing.JFrame;
public class R_1_First {
    //Using Constructor
    public R_1_First(){
        JFrame jframex = new JFrame();
        jframex.setTitle("Swing Frame");
        jframex.setLayout(null);
        jframex.setSize(400,400);
        jframex.setVisible(true);
    }
    public static void main(String[] args) {
       // new R_1_First();   // by using new keyword
        R_1_First ns = new R_1_First();

       /* //Simple Java Swing Example create a frame
        //JFrame = a GUI window to add components to

        JFrame frame = new JFrame();
        frame.setTitle("JFrame title goes here");
        frame.setSize(420,420);
        frame.setVisible(true);*/
    }
}
