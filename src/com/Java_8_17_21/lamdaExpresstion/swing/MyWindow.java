package com.Java_8_17_21.lamdaExpresstion.swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MyWindow {
    public static void main(String[] args) {
        //Window : object JFrame
        JFrame frame = new JFrame("My Window");
        frame.setSize(400,400);
        frame.setLayout(new FlowLayout());

        //create button and add jrame
        JButton button = new JButton("Click Me");

//        First Way
   /*     button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Click");
                JOptionPane.showMessageDialog(null,"Hey Button click");
            }
        });*/

        // Second Ways
//        button.addActionListener((ActionEvent e)->{  we can remove ActionEvent
            button.addActionListener((e)->{
            System.out.println("Button Click");
            JOptionPane.showMessageDialog(null,"Hey Button click");
        });

//            button.addMouseMotionListener((e)->{
//                //Multiple non-overriding abstract methods found in interface java.awt.event.MouseMotionListener
//            }); we can not use
        button.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });
        frame.add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
