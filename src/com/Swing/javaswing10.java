package com.Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class javaswing10 {
    public JFrame jFrame;
    public javaswing10() {
        jFrame = new JFrame("This is iframe tutorial ");

        jFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int a = JOptionPane.showConfirmDialog(jFrame,"are you want");
                if(a == JOptionPane.YES_OPTION){
                    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // We use Do_Nothing_On_close in close option
                }
            }
        });

        jFrame.setLayout(null);
        jFrame.setSize(400, 400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(jFrame.DO_NOTHING_ON_CLOSE);
    }

    public static void main(String args[]) {
        com.Swing.javaswing10 ns = new com.Swing.javaswing10();
    }
}



