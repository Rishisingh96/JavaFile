//package com.Swing.Universal;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.ItemEvent;
//import java.awt.event.ItemListener;
//
//class LoginF{
//    public JFrame jFrame = new JFrame("Login Form");
//
//    void LoginForm() {
//        JLabel emailLabel = new JLabel("Email: ");
//        emailLabel.setBounds(50, 200, 60, 20);
//        jFrame.add(emailLabel);
//
//        JTextField emailField = new JTextField();
//        emailField.setBounds(120, 200, 200, 20);
//        jFrame.add(emailField);
//
//        JLabel passwordLabel = new JLabel("Password: ");
//        passwordLabel.setBounds(50, 250, 80, 20);
//        jFrame.add(passwordLabel);
//
//        JPasswordField passwordField = new JPasswordField();
//        passwordField.setBounds(150, 250, 170, 20);
//        jFrame.add(passwordField);
//
//        JButton loginButton = new JButton("Login");
//        loginButton.setBounds(120, 390, 100, 30);
//        jFrame.add(loginButton);
//
//        JButton signupButton = new JButton("Sign Up");
//        signupButton.setBounds(250, 390, 100, 30);
//        jFrame.add(signupButton);
//
//        // form validation
//        loginButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//                String email = emailField.getText();
//                String password = new String(passwordField.getPassword());
//
//
//                if ( email.isEmpty() || password.isEmpty() ) {
//                    JOptionPane.showMessageDialog(jFrame, "Please fill in all the fields", "Error", JOptionPane.ERROR_MESSAGE);
//                } else {
//                    // Add more detailed validation if needed
//                    if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
//                        JOptionPane.showMessageDialog(jFrame, "Please enter a valid email address", "Error", JOptionPane.ERROR_MESSAGE);
//                    }
//                    else if(password.matches("Rishi@9838") ){
//                        JOptionPane.showMessageDialog(jFrame, "Please enter a valid correct password", "Error", JOptionPane.ERROR_MESSAGE);
//                    }
//                    else {
//                        JOptionPane.showMessageDialog(jFrame, "Login Successful", "Success", JOptionPane.INFORMATION_MESSAGE);
//                    }
//                }
//            }
//        });
//        //For Window
//        jFrame.setSize(400, 600);
//        jFrame.setLayout(null);
//        jFrame.setVisible(true);
//        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }
//}
//
//class SingUP{
//    public JFrame jFrame = new JFrame("Registration Form");
//
//    void RegistrationForm() {
//
//        JLabel nameLabel = new JLabel("Name: ");
//        nameLabel.setBounds(50, 50, 60, 20);
//        jFrame.add(nameLabel);
//
//        JTextField nameField = new JTextField();
//        nameField.setBounds(120, 50, 200, 20);
//        jFrame.add(nameField);
//
//        JLabel ageLabel = new JLabel("Age: ");
//        ageLabel.setBounds(50, 100, 60, 20);
//        jFrame.add(ageLabel);
//
//        JTextField ageField = new JTextField();
//        ageField.setBounds(120, 100, 200, 20);
//        jFrame.add(ageField);
//
//        JLabel phoneLabel = new JLabel("Phone number: ");
//        phoneLabel.setBounds(50, 150, 100, 20);
//        jFrame.add(phoneLabel);
//
//        JTextField phoneField = new JTextField();
//        phoneField.setBounds(150, 150, 170, 20);
//        jFrame.add(phoneField);
//
//        JLabel emailLabel = new JLabel("Email: ");
//        emailLabel.setBounds(50, 200, 60, 20);
//        jFrame.add(emailLabel);
//
//        JTextField emailField = new JTextField();
//        emailField.setBounds(120, 200, 200, 20);
//        jFrame.add(emailField);
//
//        JLabel passwordLabel = new JLabel("Password: ");
//        passwordLabel.setBounds(50, 250, 80, 20);
//        jFrame.add(passwordLabel);
//
//        JPasswordField passwordField = new JPasswordField();
//        passwordField.setBounds(150, 250, 170, 20);
//        jFrame.add(passwordField);
//
//        JLabel genderLabel = new JLabel("Gender: ");
//        genderLabel.setBounds(50, 300, 60, 20);
//        jFrame.add(genderLabel);
//
//        JRadioButton maleRadioButton = new JRadioButton("Male");
//        maleRadioButton.setBounds(120, 300, 80, 20);
//        jFrame.add(maleRadioButton);
//
//        JRadioButton femaleRadioButton = new JRadioButton("Female");
//        femaleRadioButton.setBounds(210, 300, 100, 20);
//        jFrame.add(femaleRadioButton);
//
//        ButtonGroup genderGroup = new ButtonGroup();
//        genderGroup.add(maleRadioButton);
//        genderGroup.add(femaleRadioButton);
//
//        JLabel jLabel = new JLabel("Choose Course:");
//        jLabel.setBounds(50, 345, 110, 30);
//        jFrame.add(jLabel);
//
//        Choice ls = new Choice();
//        ls.setBounds(170, 350, 110, 30);
//        ls.add("Select");
//        ls.add("MCA");
//        ls.add("BCA");
//        ls.add("B.Tec");
//        ls.add("M.Tec");
//        ls.add("MSC");
//        jFrame.add(ls);
//        JButton loginButton = new JButton("Login");
//        loginButton.setBounds(120, 390, 100, 30);
//        jFrame.add(loginButton);
//
//        JButton signupButton = new JButton("Sign Up");
//        signupButton.setBounds(250, 390, 100, 30);
//        jFrame.add(signupButton);
//
//        ls.addItemListener(new ItemListener() {
//            @Override
//            public void itemStateChanged(ItemEvent e) {
//                if ("Select".equals(ls.getSelectedItem())) {
//                    if (e.getStateChange() == ItemEvent.SELECTED) {
//                        SwingUtilities.invokeLater(() -> ls.select("Select"));
//                    }
//                }
//            }
//        });
//
//        // form validation
//        signupButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String name = nameField.getText();
//                String age = ageField.getText();
//                String phone = phoneField.getText();
//                String email = emailField.getText();
//                String password = new String(passwordField.getPassword());
//                String gender = maleRadioButton.isSelected() ? "Male" : (femaleRadioButton.isSelected() ? "Female" : "");
//                String course = ls.getSelectedItem();
//
//                if (name.isEmpty() || age.isEmpty() || phone.isEmpty() || email.isEmpty() || password.isEmpty() || gender.isEmpty() || "Select".equals(course)) {
//                    JOptionPane.showMessageDialog(jFrame, "Please fill in all the fields", "Error", JOptionPane.ERROR_MESSAGE);
//                } else {
//                    // Add more detailed validation if needed
//                    if (!phone.matches("\\d{10}")) {
//                        JOptionPane.showMessageDialog(jFrame, "Please enter a valid 10-digit phone number", "Error", JOptionPane.ERROR_MESSAGE);
//                    } else if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
//                        JOptionPane.showMessageDialog(jFrame, "Please enter a valid email address", "Error", JOptionPane.ERROR_MESSAGE);
//                    } else if (!age.matches("\\d+")) {
//                        JOptionPane.showMessageDialog(jFrame, "Please enter a valid age", "Error", JOptionPane.ERROR_MESSAGE);
//                    } else {
//                        JOptionPane.showMessageDialog(jFrame, "Registration Successful", "Success", JOptionPane.INFORMATION_MESSAGE);
//                    }
//                }
//            }
//        });
//        //For Window
//        jFrame.setSize(400, 600);
//        jFrame.setLayout(null);
//        jFrame.setVisible(true);
//        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//    }
//}
//
//
//public class LoginSingupProject {
//    public static void main(String[] args) {
//        SingUP singUP = new SingUP();
//        singUP.RegistrationForm();
//
//        LoginF loginF = new LoginF();
//        loginF.LoginForm();
//    }
//}