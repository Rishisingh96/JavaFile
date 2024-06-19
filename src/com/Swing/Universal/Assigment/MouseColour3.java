package com.Swing.Universal.Assigment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseColour3 extends JFrame implements MouseListener, ActionListener {
    JLabel label;
    JMenuBar menuBar;
    JMenu textC, bagC, size;
    JMenuItem red, green, blue, redB, greenB, yellowB;

    private Color[] textColors = {Color.RED, Color.GREEN, Color.BLUE};
    private Color[] bgColors = {Color.RED, Color.GREEN, Color.YELLOW};
    private int textColorIndex = 0;
    private int bgColorIndex = 0;

    MouseColour3() {
        // Initializing components
        label = new JLabel("Rishi Singh");
        label.setBounds(50, 50, 200, 30);
        label.setFont(new Font("Arial", Font.BOLD, 20));
        label.setOpaque(true); // To change background color

        red = new JMenuItem("Red");
        green = new JMenuItem("Green");
        blue = new JMenuItem("Blue");
        redB = new JMenuItem("Red");
        greenB = new JMenuItem("Green");
        yellowB = new JMenuItem("Yellow");

        // Setting action commands and listeners
        red.setActionCommand("TextRed");
        green.setActionCommand("TextGreen");
        blue.setActionCommand("TextBlue");
        redB.setActionCommand("BgRed");
        greenB.setActionCommand("BgGreen");
        yellowB.setActionCommand("BgYellow");

        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);
        redB.addActionListener(this);
        greenB.addActionListener(this);
        yellowB.addActionListener(this);

        // Initializing menu bar and menus
        menuBar = new JMenuBar();
        textC = new JMenu("Text Color");
        bagC = new JMenu("Background Color");
        size = new JMenu("Size");

        // Adding menu items to menus
        textC.add(red);
        textC.add(green);
        textC.add(blue);

        bagC.add(redB);
        bagC.add(greenB);
        bagC.add(yellowB);

        // Adding menus to menu bar
        menuBar.add(textC);
        menuBar.add(bagC);
        menuBar.add(size);

        // Adding components to frame
        setJMenuBar(menuBar);
        add(label);

        // Setting frame properties
        setLayout(null);
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Adding mouse listener
        label.addMouseListener(this);
    }

    public static void main(String[] args) {
        new MouseColour3();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == label) {
            // Cycle through text colors
            textColorIndex = (textColorIndex + 1) % textColors.length;
            label.setForeground(textColors[textColorIndex]);

            // Cycle through background colors of the whole frame
            bgColorIndex = (bgColorIndex + 1) % bgColors.length;
            getContentPane().setBackground(bgColors[bgColorIndex]);
        }
    }
    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "TextRed":
                label.setForeground(Color.RED);
                break;
            case "TextGreen":
                label.setForeground(Color.GREEN);
                break;
            case "TextBlue":
                label.setForeground(Color.BLUE);
                break;
            case "BgRed":
                getContentPane().setBackground(Color.RED);
                break;
            case "BgGreen":
                getContentPane().setBackground(Color.GREEN);
                break;
            case "BgYellow":
                getContentPane().setBackground(Color.YELLOW);
                break;
        }
    }
}
