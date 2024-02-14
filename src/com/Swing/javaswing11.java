package com.Swing;

import javax.swing.*;
import java.awt.event.*;

public class javaswing11 {
    public JFrame jFrame;
    public javaswing11() {
        jFrame = new JFrame("This is iframe tutorial ");

        JLabel jLabel = new JLabel();
        jLabel.setHorizontalAlignment(JLabel.CENTER);
        jLabel.setSize(400,100);

        JScrollBar jScrollBar = new JScrollBar();
        jScrollBar.setBounds(100,100,20,200);

        jScrollBar.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                jLabel.setText("your position is " +jScrollBar.getValue());
            }
        });

        jFrame.add(jLabel);
        jFrame.add(jScrollBar);



        jFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int a = JOptionPane.showConfirmDialog(jFrame,"are you want");
                if(a == JOptionPane.YES_OPTION){
                    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // We use Do_Nothing_On_close in close option
                }
            }
        });

        jFrame.setLayout(null);
        jFrame.setSize(400, 400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(jFrame.DO_NOTHING_ON_CLOSE);
    }

    public static void main(String args[]) {
        com.Swing.javaswing11 ns = new com.Swing.javaswing11();
    }
}



