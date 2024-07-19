package com.Java.Universal.Week6;
import javax.swing.*;
import java.awt.*;

public class R5_DetailsAdd {
    public void SingUP() {
        JFrame jFrame = new JFrame("Login Form");
        jFrame.setLayout(null);
        JLabel nameLabel = new JLabel("Name: ");
        nameLabel.setBounds(50, 50, 60, 20);
        jFrame.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(120, 50, 200, 20);
        jFrame.add(nameField);

        JLabel phoneLabel = new JLabel("Phone number: ");
        phoneLabel.setBounds(50, 150, 100, 20);
        jFrame.add(phoneLabel);

        JTextField phoneField = new JTextField();
        phoneField.setBounds(150, 150, 170, 20);
        jFrame.add(phoneField);

        JLabel emailLabel = new JLabel("Email: ");
        emailLabel.setBounds(50, 200, 60, 20);
        jFrame.add(emailLabel);

        JTextField emailField = new JTextField();
        emailField.setBounds(120, 200, 200, 20);
        jFrame.add(emailField);

        JButton signupButton = new JButton("Submit");
        signupButton.setBounds(250, 390, 100, 30);
        jFrame.add(signupButton);

        jFrame.setSize(400,500);
        jFrame.setVisible(true);

}
        public static void main(String[] args) {
        R5_DetailsAdd Add = new R5_DetailsAdd();
        Add.SingUP();
        }
    }

