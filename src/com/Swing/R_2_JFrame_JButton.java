package com.Swing;
import javax.swing.*;
// Simple Java Swing Example
public class R_2_JFrame_JButton {
    public static void main(String[] args) {
        JFrame f =new JFrame();
        JButton b = new JButton("click");
        b.setBounds(130,100,100,40);
        // b.setBounds(2);
      // b.setBackground();
        f.add(b);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}
//Swing by Association inside Constructor