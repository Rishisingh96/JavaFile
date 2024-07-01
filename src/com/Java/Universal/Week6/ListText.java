package com.Java.Universal.Week6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListText extends JFrame implements ActionListener {

    JButton add;
    List l1, l2;

    public ListText() {
        l1 = new List(5);
        l1.setBounds(80, 80, 170, 200);

        Font font1 = new Font("Arial",Font.BOLD,15);
        l1.add("Select List");
        l1.add("C");
        l1.add("C++");
        l1.add("Java");
        l1.add("Python");
        l1.setFont(font1);

        Font font = new Font("Arial",Font.BOLD,15);
        l2 = new List(5);
        l2.setBounds(350, 80, 170, 200);
        l2.add("Add List");
        l2.setFont(font);
        add(l1);
        add(l2);

        add = new JButton("Add");
        add.setBounds(250, 80, 80, 30);
        add(add);
        add.addActionListener(this);

        setSize(600, 600);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add) {
            String[] selectedItems = l1.getSelectedItems();
            for (String item : selectedItems) {
//                if(l1.getSelectedItem() == l2.getName()){
//                    JOptionPane.showMessageDialog(this,"Duplicate item not selected");
//                }
                l2.add(item);
                l1.remove(item);
//                l1.remove(item);
                //l1.addNotify();
            }
        }
    }

    public static void main(String[] args) {
        new ListText();
    }
}
