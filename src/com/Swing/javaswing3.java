package com.Swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class javaswing3 {
    public javaswing3() {
        JFrame jFrame = new JFrame("This is swing.");
       // jFrame.setTitle("Swing Frame me");

       JTextArea jTextArea = new JTextArea();
        jTextArea.setBounds(40,40,250,240);

        JButton jButton = new JButton("word count");
        jButton.setBounds(150,310,150,30);
        jFrame.add(jButton);

        JLabel jLabel  = new JLabel(" ");
        jLabel.setBounds(40,10,250,20);
        jFrame.add(jLabel);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String text = jTextArea.getText();
            String word[] = text.split(" ");
            jLabel.setText("Total char "+ text.length() +" total word " +word.length);

            }
        });


        jTextArea.setBackground(Color.cyan);
        jFrame.setForeground(Color.red);

        jFrame.add(jTextArea);
        jFrame.setLayout(null);
        jFrame.setSize(400, 400);
        jFrame.setVisible(true);
//jFrame.setText("Swing ");

    }

    public static void main(String args[]) {
        javaswing3 ns = new javaswing3();
    }
}