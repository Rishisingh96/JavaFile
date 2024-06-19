package com.Swing.Universal.Assigment;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseColour extends JFrame implements MouseListener, ActionListener {
    JLabel label , Incress, Dicress;
    JMenuBar menuBar;
    JMenu textC, bagC, size;
    JMenuItem red, green, blue, redB, greenB, yellowB;


    MouseColour() {
        // Initializing components
        label = new JLabel("Rishi Singh");
        label.setBounds(50, 50, 200, 30);
        label.setFont(new Font("Arial", Font.BOLD, 20));

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
        new MouseColour();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
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
                label.setBackground(Color.RED);
                label.setOpaque(true);
                break;
            case "BgGreen":
                label.setBackground(Color.GREEN);
                label.setOpaque(true);
                break;
            case "BgYellow":
                label.setBackground(Color.YELLOW);
                label.setOpaque(true);
                break;
        }
    }
}

