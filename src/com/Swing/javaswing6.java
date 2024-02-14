package com.Swing;
import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class javaswing6 extends Component implements ActionListener{
    public JFrame jFrame;
    public JLabel jLabel;
    public JRadioButton jRadioButtonone, jRadioButtontwo;
    public javaswing6() {
        jFrame = new JFrame("This is swing.");

        jRadioButtonone = new JRadioButton("Male");
        jRadioButtonone.setBounds(100,50,100,30);
        jFrame.add(jRadioButtonone);

        jRadioButtontwo = new JRadioButton("Female");
        jRadioButtontwo.setBounds(100,100,100,30);
        jFrame.add(jRadioButtontwo);

        JButton jButton = new JButton("click");
        jButton.setBounds(100,250,80,30);
        jFrame.add(jButton);

        jButton.addActionListener(this);

        jFrame.add(jRadioButtonone);
        jFrame.add(jRadioButtontwo);

        jFrame.setLayout(null);
        jFrame.setSize(400, 400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(jRadioButtonone.isSelected()){
            JOptionPane.showMessageDialog(jFrame,"You are male");
            jRadioButtontwo.setSelected(false);
        }
        else if(jRadioButtontwo.isSelected()){
            JOptionPane.showMessageDialog(jFrame,"You are female");
            jRadioButtonone.setSelected(false);
        }
    }

    public static void main(String args[]) {
        javaswing6 ns = new javaswing6();
    }
}