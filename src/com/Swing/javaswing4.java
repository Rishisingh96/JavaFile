package com.Swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class javaswing4 {
    public JFrame jFrame;
    public JLabel jLabel;

    public javaswing4() {
         jFrame = new JFrame("This is swing.");

        jLabel = new JLabel("Password");
        jLabel.setBounds(40,10,100,20);

        JPasswordField jPasswordField = new JPasswordField();
        jPasswordField.setBounds(150,10,100,20);

        JButton jButton = new JButton("View Password ");
        jButton.setBounds(150,310,150,30);
        jFrame.add(jButton);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel.setText(jPasswordField.getText());
            }
        });

        jFrame.add(jLabel);
        jFrame.add(jPasswordField);

        jFrame.setLayout(null);
        jFrame.setSize(400, 400);
        jFrame.setVisible(true);
    }

    public static void main(String args[]) {

        javaswing4 ns = new javaswing4();
    }
}