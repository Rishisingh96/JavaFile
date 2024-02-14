package com.Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class javaswing9 {
        public JFrame jFrame;
        public javaswing9() {
            jFrame = new JFrame("This is iframe tutorial ");

            JLabel jLabel = new JLabel();
            jLabel.setBounds(100,20,250,30);

            JButton jButton = new JButton("selected item");
            jButton.setBounds(100,50,150,30);

            DefaultListModel<String> l1 = new DefaultListModel<String>();
            l1.addElement("Rishi");
            l1.addElement("Rahul");
            l1.addElement("Rohit");
            l1.addElement("Mahendar");


            DefaultListModel<String> l2 = new DefaultListModel<String>();
            l2.addElement("singh");
            l2.addElement("panday");
            l2.addElement("solanki");
            l2.addElement("Yadav");

            JList name = new JList(l1);
            name.setBounds(100,100,75,75);

            JList surname = new JList(l2);
            surname.setBounds(100,200,75,75);
            jButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String data = "your name is " +name.getSelectedValue() + " surname " +surname.getSelectedValue();
                    jLabel.setText(data);

                }
            });
            jFrame.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    int a = JOptionPane.showConfirmDialog(jFrame,"are you want");
                    if(a == JOptionPane.YES_OPTION){
                        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    }
                }
            });
            jFrame.add(jLabel);
            jFrame.add(jButton);

            jFrame.add(name);
            jFrame.add(surname);

            jFrame.setLayout(null);
            jFrame.setSize(400, 400);
            jFrame.setVisible(true);
           jFrame.setDefaultCloseOperation(jFrame.DO_NOTHING_ON_CLOSE);
        }

        public static void main(String args[]) {
            com.Swing.javaswing9 ns = new com.Swing.javaswing9();
        }
    }



