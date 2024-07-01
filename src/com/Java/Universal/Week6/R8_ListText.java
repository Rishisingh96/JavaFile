package com.Java.Universal.Week6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class R8_ListText extends JFrame implements ActionListener {

    JButton add,addr,alladd,alladdr;
    List l1, l2;

    public R8_ListText() {
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

        add = new JButton(">>");
        add.setBounds(250, 80, 80, 20);
        add(add);
        add.addActionListener(this);

        addr = new JButton("<<");
        addr.setBounds(250, 120, 80, 20);
        add(addr);
        addr.addActionListener(this);

        alladd = new JButton(">>>");
        alladd.setBounds(250, 160, 80, 20);
        add(alladd);
        alladd.addActionListener(this);

        alladdr = new JButton("<<<");
        alladdr.setBounds(250, 220, 80, 20);
        add(alladdr);
        alladdr.addActionListener(this);

        setSize(600, 600);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add) {
            String[] selectedItems1 = l1.getSelectedItems();
            for (String item : selectedItems1) {
                l2.add(item);
                l1.remove(item);
            }
        }
            if (e.getSource() == addr) {
                String[] selectedItems2 = l2.getSelectedItems();
                for (String item : selectedItems2) {
                    l1.add(item);
                    l2.remove(item);
                }
            }

            if (e.getSource() == alladd) {
                String[] selectedItems4 = l1.getItems();
                for (String item : selectedItems4) {
                    l2.add(item);
                    l1.remove(item);
                }
            }
            if (e.getSource() == alladdr) {
                String[] selectedItems4 = l2.getItems();
                for (String item : selectedItems4) {
                    l1.add(item);
                    l2.remove(item);
                }
            }
        }


    public static void main(String[] args) {
        new R8_ListText();
    }
}
