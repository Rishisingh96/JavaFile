package com.Swing;
import javax.swing.JFrame;
public class R_1_Global_Local_Variable {

    public JFrame jFramex;  // Global variable again again use anywher
    public R_1_Global_Local_Variable(){
    //    JFrame jframex = new JFrame("Swing Frame");  // Local variableJFrame so not access anyone only use under constructor
        jFramex = new JFrame("Swing Frame");  // Global variable JFrame so not access anyone only use under constructor

     //   jframex.setTitle("Swing Frame");
        jFramex.setLayout(null);
        jFramex.setSize(400,400);
        jFramex.setVisible(true);
    }

    public JFrame getjFramex() {
        return jFramex;
    }

    public static void main(String[] args) {

    }
}
