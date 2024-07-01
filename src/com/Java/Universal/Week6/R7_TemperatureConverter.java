package com.Java.Universal.Week6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class TemperatureConverter extends JFrame implements ActionListener {
    JLabel l1, l2, l3;
    JTextField t1, t2;
    JButton convert;

    public TemperatureConverter() {
        setLayout(null);

        // Labels
        l1 = new JLabel("Convertor");
        l2 = new JLabel("Fahrenheit");
        l3 = new JLabel("Celsius");

        // Text Fields
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t2.setEditable(false);

        // Button
        convert = new JButton("Convert");

        // Set Fonts
        Font fontTitle = new Font("SansSerif", Font.BOLD, 18);
        Font font = new Font("SansSerif", Font.BOLD, 14);

        l1.setFont(fontTitle);
        l2.setFont(font);
        l3.setFont(font);
        t1.setFont(font);
        t2.setFont(font);
        convert.setFont(font);

        // Set Bounds
        l1.setBounds(120, 20, 200, 30);
        l2.setBounds(50, 70, 100, 30);
        t1.setBounds(150, 70, 100, 30);
        convert.setBounds(100, 120, 120, 30);
        l3.setBounds(50, 170, 100, 30);
        t2.setBounds(150, 170, 100, 30);

        // Add Components
        add(l1);
        add(l2);
        add(t1);
        add(convert);
        add(l3);
        add(t2);

        // Add Action Listeners
        convert.addActionListener(this);

        // Frame Properties
        setSize(320, 280);
        setTitle("Temperature Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double fahrenheit = Double.parseDouble(t1.getText());
        double celsius = (fahrenheit - 32) * 5 / 9;
        t2.setText(String.format("%.2f", celsius));
    }
}

public class R7_TemperatureConverter {
    public static void main(String[] args) {
        new TemperatureConverter();
    }
}
