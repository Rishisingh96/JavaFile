package com.Swing.Universal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyLogin {
    private JFrame jFrame = new JFrame("Login");
    private JButton bok = new JButton("Ok");

    public MyLogin() {
        jFrame.setLayout(null);  // Set layout before adding components
        bok.setBounds(170, 320, 60, 20);
        jFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        jFrame.getContentPane().add(bok); // Add the button to the content pane only once
        bok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.dispose();
                new SecondFrame().setVisible(true);  // Set the second frame visible
            }
        });
        jFrame.setSize(400, 400);
        jFrame.setVisible(true);
    }

    static class SecondFrame extends JFrame {
        JButton button = new JButton("Login");

        public SecondFrame() {
            super("LoginSecondP");
            setLayout(null); // Set layout before adding components
            button.setBounds(150, 200, 80, 30);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(400, 400);
            add(button);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    dispose();
                    new MyLogin();
                }
            });
        }
    }

    public static void main(String[] args) {
        MyLogin myLogin = new MyLogin();
    }
}
