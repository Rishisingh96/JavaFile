package com.Swing;
import javax.swing.*;

public class R_2_JButton {

    public JFrame jFramex;  // Global variable again again use anywher
    public R_2_JButton(){
        //    JFrame jframex = new JFrame("Swing Frame");  // Local variableJFrame so not access anyone only use under constructor
        jFramex = new JFrame("Swing Frame");  // Global variable JFrame so not access anyone only use under constructor

        JButton jButton = new JButton("click me");
        jButton.setBounds(100,40, 100,30);

        jFramex.add(jButton);

        jFramex.setLayout(null);
        jFramex.setSize(400,400);
        jFramex.setVisible(true);
    }



    public static void main(String[] args) {
    R_2_JButton nb = new R_2_JButton();
    }
}
