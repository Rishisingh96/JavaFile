package com.Java.Universal.Week6;

import javax.swing.*;

public class R4_Frame_Button  extends JFrame {
    JButton One,Two;
    public R4_Frame_Button() {
        setLayout(null);
        One = new JButton("One");
        One.setBounds(200, 200, 70, 30);

        Two = new JButton("Two");
        Two.setBounds(300, 200, 70, 30);

        add(One);
        add(Two);

        setSize(600, 600);
        setVisible(true);

    }

    public static void main(String[] args){
         new R4_Frame_Button();
        }
    }

