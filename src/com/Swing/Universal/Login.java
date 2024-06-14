package com.Swing.Universal;

import javax.swing.*;
import java.awt.*;

public class Login {
    JFrame jFrame = new JFrame("Rishi singh");
    void Window(){
        jFrame.setSize(600,600);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }
    void RegistrationForm(){
        Window();
        JLabel jLabel = new JLabel("Name : ");
        jLabel.setBounds(100,200,100,20);
        jLabel.add(jFrame);

    }
    void LoginForm(){

    }
    public static void main(String[] args) {
        Login login = new Login();
        login.RegistrationForm();
    }
}
