package com.Swing;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class javaswing {
        public JFrame jFramex;  // Global variable again again use anywher
        public javaswing(){
            jFramex = new JFrame("Swing Frame");  // Global variable JFrame so not access anyone only use under constructor
            // JButton
            JButton jButton = new JButton("click me");
            jButton.setBounds(100,40, 100,30);
            jFramex.add(jButton);

            // JLabel
            JLabel jLabel = new JLabel("This is java swing");
            jLabel.setBounds(100,90,225,30);
            jFramex.add(jLabel);

            JTextField jTextField = new JTextField();
            jTextField.setBounds(100,150,250,30);
            jFramex.add(jTextField);

            jButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                        jLabel.setText("Please subscribe the My code");
                        jTextField.setText("Please check the My code");
                }
            });
            jFramex.setLayout(null);
            jFramex.setSize(400,400);
            jFramex.setVisible(true);
            jFramex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        }

        public static void main(String[] args) {
            javaswing js = new javaswing();

        }
    }


