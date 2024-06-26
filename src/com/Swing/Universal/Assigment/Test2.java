package com.Swing.Universal.Assigment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;

class ListText2 extends JFrame implements ActionListener {

    JButton add;
    JList<String> l1, l2;
    DefaultListModel<String> l1Model, l2Model;
    public ListText2() {
        l1Model = new DefaultListModel<>();
        l1Model.addElement("C");
        l1Model.addElement("C++");
        l1Model.addElement("Java");
        l1Model.addElement("Python");

        l1 = new JList<>(l1Model);

       // l1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        l1.setBounds(80, 80, 150, 100);

        l2Model = new DefaultListModel<>();
        l2 = new JList<>(l2Model);
        l2.setBounds(350, 80, 150, 100);

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
            List<String> selectedItems = l1.getSelectedValuesList();
            for (String item : selectedItems) {
                l2Model.addElement(item);
                l1Model.removeElement(item);
            }
        }
    }

    public static void main(String[] args) {
        new ListText2();
    }
}
