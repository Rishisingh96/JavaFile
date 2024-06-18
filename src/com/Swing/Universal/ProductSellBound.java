package com.Swing.Universal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Product1 extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4, l5, l6;
    JTextField jl2, jl3, jl4, jl5, jl6;
    JButton TPrice, TSaveMoney, Reset;

    public Product1() {
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        l1 = new JLabel("Choose Product :");
        add(l1);

        Choice ls = new Choice();
        ls.add("Select");
        ls.add("TV");
        ls.add("Phone");
        ls.add("Fridge");
        ls.add("Laptop");
        ls.add("PC");
        add(ls);

        l2 = new JLabel("Product Quantity :");
        l3 = new JLabel("Product Price:");
        l4 = new JLabel("Product Discount:");

        jl2 = new JTextField(16);
        jl3 = new JTextField(16);
        jl4 = new JTextField(16);

        TPrice = new JButton("Click to Total Price");
        TSaveMoney = new JButton("Check to SaveMoney");
        Reset = new JButton("Reset");

        l1.setBounds(100,100,120,30);
        l2.setBounds(100,140,120,30);
        l3.setBounds(100,180,120,30);
        l4.setBounds(100,220,120,30);

        ls.setBounds(270,100,100,30);
        jl2.setBounds(270,140,100,30);
        jl3.setBounds(270,180,100,30);
        jl4.setBounds(270,220,100,30);

        TPrice.setBounds(100,280,170,30);
        TSaveMoney.setBounds(260,280,190,30);
        Reset.setBounds(450,280,130,30);
        
        add(l2);
        add(jl2);
        add(l3);
        add(jl3);
        add(l4);
        add(jl4);
        add(TPrice);
        add(TSaveMoney);
        add(Reset);

        l5 = new JLabel("Total Price:");
        l6 = new JLabel("Total Save Money:");

        jl5 = new JTextField(16);
        jl6 = new JTextField(16);

//        jl5.setEditable(false);
//        jl6.setEditable(false);

        l5.setBounds(80,380,180,30);
        l6.setBounds(80,450,180,30);

        jl5.setBounds(200,380,140,30);
        jl6.setBounds(200,450,140,30);
        add(l5);
        add(jl5);
        add(l6);
        add(jl6);

        TPrice.addActionListener(this);
        TSaveMoney.addActionListener(this);
        Reset.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == TPrice) {
            try {
                int PQ = Integer.parseInt(jl2.getText());
                int PP = Integer.parseInt(jl3.getText());
                float PD = Float.parseFloat(jl4.getText());

                float totalPrice = PQ * PP;
                jl5.setText(String.valueOf(totalPrice));
            } catch (NumberFormatException | NullPointerException ex) {
                JOptionPane.showMessageDialog(this, "Please enter valid numbers.");
            }
        } else if (e.getSource() == TSaveMoney) {
            try {
                int PP = Integer.parseInt(jl3.getText());
                int Q = Integer.parseInt( jl2.getText());
                float PD = Float.parseFloat(jl4.getText());
                int TQ = PP * Q;
                double TS = TQ * PD/ 100.0;
                jl6.setText(String.valueOf(TS));
            } catch (NumberFormatException | NullPointerException ex) {
                JOptionPane.showMessageDialog(this, "Please enter valid numbers.");
            }
        } else if (e.getSource() == Reset) {
            jl2.setText("");
            jl3.setText("");
            jl4.setText("");
            jl5.setText("");
            jl6.setText("");
        }
    }
}

public class ProductSellBound {
    public static void main(String[] args) {
        Product1 product = new Product1();
        product.setVisible(true);
    }
}
