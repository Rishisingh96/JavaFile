package com.Swing.Universal;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MouseListenerE extends JFrame implements MouseListener{
    JLabel label;
    MouseListenerE(){
        addMouseListener(this);
        label = new JLabel();
        Font font = new Font("Arial",Font.BOLD,25);
        label.setFont(font);
        label.setBounds(20,50,200,40);
        add(label);

        //addMouseListener(this)
        setSize(400,400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setText("Mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited");
    }
}
public class MouseListenerExample  {
    public static void main(String[] args) {
        MouseListenerE x = new MouseListenerE();

    }
}
