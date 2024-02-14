package com.Swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class javaswing5  implements ActionListener{
    public JFrame jFrame;
    public JLabel jLabel;
    public  JCheckBox checkBoxone, checkBoxtwo,checkBoxthree ;

    public javaswing5() {
        jFrame = new JFrame("This is swing.");

        jLabel = new JLabel("Food Billing");
        jLabel.setBounds(50,50,300,20);
        jFrame.add(jLabel);

        checkBoxone = new JCheckBox("Pizza 100");
        checkBoxone.setBounds(100,100,150,20);
        jFrame.add(checkBoxone);

        checkBoxtwo = new JCheckBox("burger 100");
        checkBoxtwo.setBounds(100,150,150,20);
        jFrame.add(checkBoxtwo);

        checkBoxthree = new JCheckBox("tea 35");
        checkBoxthree.setBounds(100,200,150,20);
        jFrame.add(checkBoxthree);

        JButton jButton = new JButton("Total ",new ImageIcon("C:\\Users\\Rishi singh\\OneDrive\\Pictures\\Capture 23.JPG\\"));
        jButton.setBounds(100,250,80,30);
        jFrame.add(jButton);

        jButton.addActionListener(this);


        jFrame.setLayout(null);
        jFrame.setSize(400, 400);
        jFrame.setVisible(true);
    }
    @Override
public void actionPerformed(ActionEvent e) {
    float amount = 0;
    String msg = " ";
    if (checkBoxone.isSelected()) {
        amount += 100; //
        msg += "Piza 100\n";
    }
    if (checkBoxtwo.isSelected()) {
        amount +=100;
        msg +="Burger 100\n ";
    }
    if(checkBoxthree.isSelected()){
        amount += 35;
        msg = "Tea 35\n";
    }
    msg = "----------------";
    JOptionPane.showMessageDialog(jFrame,msg+"Total"+amount);
    }
    public static void main(String args[]) {
        javaswing5 ns = new javaswing5();
    }
}