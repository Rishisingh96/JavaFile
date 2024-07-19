package com.Java.Universal.Week6;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.*;
import java.awt.event.*;

public class R9_DesignFrame implements ActionListener{
    JFrame F=new JFrame();
    JTextField btext;
    JComboBox<String> bcom;

    R9_DesignFrame()
    {
        btext=new JTextField();
        btext.setBounds(30, 50, 100, 30);
        F.add(btext);

        JButton add=new JButton("add");
        add.setBounds(30, 100, 100, 30);
        F.add(add);

        bcom=new JComboBox<>();
        bcom.setBounds(150, 50, 100, 30);
        F.add(bcom);

        F.setSize(400, 400);
        F.setLayout(null);
        F.setVisible(true);

        add.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        String bookname=btext.getText();
        if(!bookname.isEmpty())
        {
            bcom.addItem(bookname);
            btext.setText(" ");
            JOptionPane.showMessageDialog(F, "City added");
        }
        else
        {
            JOptionPane.showMessageDialog(F, "please Enter city");
        }
    }
    public static void main(String args[])
    {
        new R9_DesignFrame();

    }
}