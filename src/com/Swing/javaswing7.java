package com.Swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class javaswing7{
    public JFrame jFrame;
   // public JLabel jLabel;
    public JRadioButton jRadioButtonone, jRadioButtontwo;
    public javaswing7() {
        jFrame = new JFrame("This is iframe tutorial ");

        String cityname[] = {"mumbai", "surat", "Basti","Uttar Pradesh"};

        JComboBox jComboBox = new JComboBox(cityname);
        jComboBox.setBounds(100,20,100,20);
        jFrame.add(jComboBox);

        JButton jButton = new JButton("click");
        jButton.setBounds(100,250,80,30);
        jFrame.add(jButton);

        JLabel jLabel = new JLabel(" ");
        jLabel.setBounds(100,50,250,30);
        jFrame.add(jLabel);
       // jButton.addActionListener(this);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel.setText("you select this city " +jComboBox.getItemAt(jComboBox.getSelectedIndex()));
                System.out.println("working");
            }
        });

        /* jButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            }
        });*/

        jFrame.setLayout(null);
        jFrame.setSize(400, 400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        javaswing7 ns = new javaswing7();
    }
}