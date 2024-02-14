package com.Swing;
import javax.swing.*;
import java.awt.*;

public class R_2_Jlable {

    public JFrame jFramex;  // Global variable again again use anywher
    public R_2_Jlable(){
        //    JFrame jframex = new JFrame("Swing Frame");  // Local variableJFrame so not access anyone only use under constructor
        jFramex = new JFrame("Swing Frame");  // Global variable JFrame so not access anyone only use under constructor
        // JButton
        JButton jButton = new JButton("click me");
        jButton.setBounds(100,40, 100,30);
        // JLabel
        JLabel jLabel = new JLabel("This is the swing Button click heare");
        jLabel.setBounds(100,40,100,30);

        JTextField jTextField = new JTextField();
        jTextField.setBounds(100,150,250,30);

        jFramex.add(jTextField);

        jFramex.add(jButton);
        jFramex.add(jLabel);

        jFramex.setLayout(null);
        jFramex.setSize(400,400);
        jFramex.setVisible(true);
    }



    public static void main(String[] args) {
        R_2_Jlable nb = new R_2_Jlable();
    }
}
