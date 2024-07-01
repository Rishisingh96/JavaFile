package com.Java.Universal.Week6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculator extends JFrame implements ActionListener {
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton add, sub, mul, div;

    public Calculator() {
        setLayout(null);

        // Labels
        l1 = new JLabel("First Value:");
        l2 = new JLabel("Second Value:");
        l3 = new JLabel("Result:");

        // Text Fields
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);

        // Buttons
        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");

        // Set Fonts
        Font font = new Font("SansSerif", Font.BOLD, 14);
        l1.setFont(font);
        l2.setFont(font);
        l3.setFont(font);
        t1.setFont(font);
        t2.setFont(font);
        t3.setFont(font);
        add.setFont(font);
        sub.setFont(font);
        mul.setFont(font);
        div.setFont(font);

        // Set Bounds
        l1.setBounds(50, 50, 120, 20);
        t1.setBounds(180, 50, 100, 20);
        l2.setBounds(50, 100, 120, 20);
        t2.setBounds(180, 100, 100, 20);
        l3.setBounds(50, 200, 120, 20);
        t3.setBounds(180, 200, 100, 20);

        add.setBounds(50, 150, 50, 30);
        sub.setBounds(110, 150, 50, 30);
        mul.setBounds(170, 150, 50, 30);
        div.setBounds(230, 150, 50, 30);

        // Add Components
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(add);
        add(sub);
        add(mul);
        add(div);

        // Add Action Listeners
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        // Frame Properties
        setSize(350, 300);
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int x = Integer.parseInt(t1.getText());
        int y = Integer.parseInt(t2.getText());
        int result = 0;

        if (e.getSource() == add) {
            result = x + y;
        } else if (e.getSource() == sub) {
            result = x - y;
        } else if (e.getSource() == mul) {
            result = x * y;
        } else if (e.getSource() == div) {
            result = x / y;
        }

        t3.setText(String.valueOf(result));
    }
}

public class R6_Calculator {
    public static void main(String[] args) {
        new Calculator();
    }
}
