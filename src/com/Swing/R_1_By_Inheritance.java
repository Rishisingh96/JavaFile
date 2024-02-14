package com.Swing;
import javax.swing.JFrame;
public class R_1_By_Inheritance extends JFrame{
    // By using Inheritance create Jframe
    /*public R_1_By_Inheritance(){ // Bu method
        setTitle("Swing Frame ");
        setLayout(null);
        setSize(400 , 400);
        setVisible(true);
    }
*/
    public static void main(String[] args) {
        R_1_By_Inheritance Jframe = new R_1_By_Inheritance();
        Jframe.setTitle("Swing Frame ");
        Jframe.setLayout(null);
       Jframe.setSize(400 , 400);
       Jframe.setVisible(true);
    }
}
