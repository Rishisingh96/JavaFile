package com.chatApp;
import javax.swing.*;

public class Clientswing {
    public JFrame jFramex;
    public JLabel jLabel;
    public Clientswing(){
        jFramex = new JFrame("Client Chat Box");

        // JLabel
        jLabel = new JLabel("WhatsApp");
        jLabel.setBounds(200,10,300,50);
        jFramex.add(jLabel);

        JTextField jTextField = new JTextField();
        jTextField.setBounds(10,700,500,40);
        jFramex.add(jTextField);

       /* jLabel  = new JLabel(" ");
        jLabel.setBounds(40,10,250,20);
        jFramex.add(jLabel);*/

        jFramex.setLayout(null);
        jFramex.setSize(600,800);
        jFramex.setVisible(true);
        jFramex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args){
    Clientswing js = new Clientswing();
    }
}
