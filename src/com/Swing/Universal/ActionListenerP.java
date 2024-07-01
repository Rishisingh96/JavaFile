package com.Swing.Universal;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class LoginApp extends JFrame implements ActionListener {
    JLabel l1, l2, l3;
    JTextField textFnum, textSnum, textAns;
    JButton btnOk, btnClear;

    public LoginApp() {
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
//        setLayout(null);
        l1 = new JLabel("Enter The First Name: ");
        l2 = new JLabel("Enter Second Number: ");
        l3 = new JLabel("Sum");

        textFnum = new JTextField(16);
        textSnum = new JTextField(17);
        textAns = new JTextField(19);

        btnOk = new JButton("Click to sum");
        btnClear = new JButton("Reset");

        add(l1); add(textFnum);
        add(l2); add(textSnum);
        add(l3); add(textAns);
        add(btnOk); add(btnClear);

        Font ft = new Font("Arial", Font.PLAIN, 20);
        l1.setFont(ft); l2.setFont(ft); l3.setFont(ft);
        textFnum.setFont(ft); textSnum.setFont(ft); textAns.setFont(ft);
        btnOk.setFont(ft); btnClear.setFont(ft);

//        btnOk.addActionListener(this);
//        btnClear.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

public class ActionListenerP {
    public static void main(String[] args) {
        LoginApp2 l = new LoginApp2();
        l.setVisible(true);
    }
}