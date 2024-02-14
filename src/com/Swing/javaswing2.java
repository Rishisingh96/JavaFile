package com.Swing;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class javaswing2 implements ActionListener {
    public JLabel jLabel;
    public JTextField jTextField;
    public JButton jButton;
    public JFrame jFramex;  // Global variable again again use anywher
    public javaswing2(){
        jFramex = new JFrame("Swing Frame");  // Global variable JFrame so not access anyone only use under constructor
        // JButton
        jButton = new JButton("click me");
        jButton.setBounds(100,40, 100,30);
        jFramex.add(jButton);
        jButton.addActionListener(this);
        // JLabel
        jLabel = new JLabel("This is java swing");
        jLabel.setBounds(100,90,225,30);
        jFramex.add(jLabel);

        jTextField = new JTextField();
        jTextField.setBounds(100,150,250,30);
        jFramex.add(jTextField);

        jFramex.setLayout(null);
        jFramex.setSize(400,400);
        jFramex.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e){
        jLabel.setText("Please go to my shop Garima studio.");
        jTextField.setText("please perches my Book");
    }

    public static void main(String[] args) {
        javaswing2 js = new javaswing2();

    }
}


