package com.Java.Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;

class Candidate {
    String name;
    int roll_number;
    String password;
    int obtained_marks = 0;
    int correct = 0;
    int incorrect = 0;
    static int test_id = 1111;
    int tst_id = test_id;

    void createUser(String name, int rollNumber, String password) {
        this.name = name;
        this.roll_number = rollNumber;
        this.password = password;
        this.tst_id = test_id++;
    }

    void updateProfile(String name, int rollNumber, String password) {
        if (name != null && !name.isEmpty()) this.name = name;
        if (rollNumber != -1) this.roll_number = rollNumber;
        if (password != null && !password.isEmpty()) this.password = password;
    }
}

class Portal {
    void runTest(Candidate user) {
        // GUI code for running the test
    }

    void evaluateMarks(Candidate user) {
        // GUI code for evaluating marks
    }
}

public class OnlineExaminationGUI {
    private JFrame frame;
    private JPanel mainPanel, registerPanel, loginPanel, updatePanel, testPanel, resultPanel;
    private JTextField nameField, rollNumberField, loginRollNumberField, updateNameField, updateRollNumberField;
    private JPasswordField passwordField, loginPasswordField, updatePasswordField;
    private JButton registerButton, loginButton, updateButton, startTestButton;
    private JTextArea questionArea;
    private JTextField answerField;
    private JLabel resultLabel;
    private Candidate currentUser;
    private ArrayList<Candidate> candidates;

    public OnlineExaminationGUI() {
        candidates = new ArrayList<>();

        frame = new JFrame("Online Examination System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new CardLayout());

        mainPanel = new JPanel(new GridLayout(3, 1));
        JButton registerPageButton = new JButton("Register");
        JButton loginPageButton = new JButton("Login");
        JButton updatePageButton = new JButton("Update Profile");

        mainPanel.add(registerPageButton);
        mainPanel.add(loginPageButton);
        mainPanel.add(updatePageButton);

        registerPanel = createRegisterPanel();
        loginPanel = createLoginPanel();
        updatePanel = createUpdatePanel();
        testPanel = createTestPanel();
        resultPanel = createResultPanel();

        frame.add(mainPanel, "Main");
        frame.add(registerPanel, "Register");
        frame.add(loginPanel, "Login");
        frame.add(updatePanel, "Update");
        frame.add(testPanel, "Test");
        frame.add(resultPanel, "Result");

        registerPageButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switchToPanel("Register");
            }
        });

        loginPageButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switchToPanel("Login");
            }
        });

        updatePageButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switchToPanel("Update");
            }
        });

        frame.setVisible(true);
    }

    private JPanel createRegisterPanel() {
        JPanel panel = new JPanel(new GridLayout(5, 2));

        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        JLabel rollNumberLabel = new JLabel("Roll Number:");
        rollNumberField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        registerButton = new JButton("Register");

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(rollNumberLabel);
        panel.add(rollNumberField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel());
        panel.add(registerButton);

        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String rollNumberText = rollNumberField.getText();
                String password = new String(passwordField.getPassword());
                if (name.isEmpty() || rollNumberText.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "All fields must be filled!");
                    return;
                }
                int rollNumber = Integer.parseInt(rollNumberText);
                Candidate candidate = new Candidate();
                candidate.createUser(name, rollNumber, password);
                candidates.add(candidate);
                JOptionPane.showMessageDialog(frame, "Registration successful! Test ID: " + candidate.tst_id);
                switchToPanel("Main");
            }
        });

        return panel;
    }

    private JPanel createLoginPanel() {
        JPanel panel = new JPanel(new GridLayout(4, 2));

        JLabel rollNumberLabel = new JLabel("Roll Number:");
        loginRollNumberField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        loginPasswordField = new JPasswordField();
        loginButton = new JButton("Login");

        panel.add(rollNumberLabel);
        panel.add(loginRollNumberField);
        panel.add(passwordLabel);
        panel.add(loginPasswordField);
        panel.add(new JLabel());
        panel.add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String rollNumberText = loginRollNumberField.getText();
                String password = new String(loginPasswordField.getPassword());
                if (rollNumberText.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "All fields must be filled!");
                    return;
                }
                int rollNumber = Integer.parseInt(rollNumberText);
                for (Candidate candidate : candidates) {
                    if (candidate.roll_number == rollNumber && candidate.password.equals(password)) {
                        currentUser = candidate;
                        switchToPanel("Test");
                        return;
                    }
                }
                JOptionPane.showMessageDialog(frame, "Invalid credentials!");
            }
        });

        return panel;
    }

    private JPanel createUpdatePanel() {
        JPanel panel = new JPanel(new GridLayout(5, 2));

        JLabel rollNumberLabel = new JLabel("Enter Roll Number:");
        loginRollNumberField = new JTextField();
        JLabel updateNameLabel = new JLabel("New Name:");
        updateNameField = new JTextField();
        JLabel updateRollNumberLabel = new JLabel("New Roll Number:");
        updateRollNumberField = new JTextField();
        JLabel updatePasswordLabel = new JLabel("New Password:");
        updatePasswordField = new JPasswordField();
        updateButton = new JButton("Update");

        panel.add(rollNumberLabel);
        panel.add(loginRollNumberField);
        panel.add(updateNameLabel);
        panel.add(updateNameField);
        panel.add(updateRollNumberLabel);
        panel.add(updateRollNumberField);
        panel.add(updatePasswordLabel);
        panel.add(updatePasswordField);
        panel.add(new JLabel());
        panel.add(updateButton);

        updateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String rollNumberText = loginRollNumberField.getText();
                String name = updateNameField.getText();
                String newRollNumberText = updateRollNumberField.getText();
                String password = new String(updatePasswordField.getPassword());
                if (rollNumberText.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Roll number must be filled!");
                    return;
                }
                int rollNumber = Integer.parseInt(rollNumberText);
                int newRollNumber = newRollNumberText.isEmpty() ? -1 : Integer.parseInt(newRollNumberText);
                for (Candidate candidate : candidates) {
                    if (candidate.roll_number == rollNumber) {
                        candidate.updateProfile(name, newRollNumber, password);
                        JOptionPane.showMessageDialog(frame, "Profile updated successfully!");
                        switchToPanel("Main");
                        return;
                    }
                }
                JOptionPane.showMessageDialog(frame, "Candidate not found!");
            }
        });

        return panel;
    }

    private JPanel createTestPanel() {
        JPanel panel = new JPanel(new BorderLayout());

        questionArea = new JTextArea();
        questionArea.setEditable(false);
        answerField = new JTextField();
        startTestButton = new JButton("Start Test");

        panel.add(new JScrollPane(questionArea), BorderLayout.CENTER);
        panel.add(answerField, BorderLayout.SOUTH);
        panel.add(startTestButton, BorderLayout.NORTH);

        startTestButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                runTest(currentUser);
            }
        });

        return panel;
    }

    private JPanel createResultPanel() {
        JPanel panel = new JPanel(new BorderLayout());

        resultLabel = new JLabel();
        JButton backButton = new JButton("Back");

        panel.add(resultLabel, BorderLayout.CENTER);
        panel.add(backButton, BorderLayout.SOUTH);

        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switchToPanel("Main");
            }
        });

        return panel;
    }

    private void switchToPanel(String panelName) {
        CardLayout cl = (CardLayout) (frame.getContentPane().getLayout());
        cl.show(frame.getContentPane(), panelName);
    }

    private void runTest(Candidate user) {
        questionArea.setText("");
        try (BufferedReader br = new BufferedReader(new FileReader("question.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains("?")) {
                    questionArea.append(line + "\n");
                    String[] options = new String[4];
                    for (int i = 0; i < 4; i++) {
                        options[i] = br.readLine();
                        questionArea.append(options[i] + "\n");
                    }
                    String answer = br.readLine().trim();
                    String userAnswer = JOptionPane.showInputDialog(frame, "Enter your answer:");
                    if (userAnswer.equalsIgnoreCase(answer)) {
                        user.obtained_marks += 5;
                        user.correct++;
                    } else {
                        user.obtained_marks -= 2;
                        user.incorrect++;
                    }
                }
            }
            evaluateMarks(user);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private void evaluateMarks(Candidate user) {
        String result = "Test ID: " + user.tst_id + "\n" +
                "Name: " + user.name + "\n" +
                "Roll Number: " + user.roll_number + "\n" +
                "Marks: " + user.obtained_marks + "\n" +
                "Correct Answers: " + user.correct + "\n" +
                "Incorrect Answers: " + user.incorrect;
        resultLabel.setText(result);
        switchToPanel("Result");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new OnlineExaminationGUI();
            }
        });
    }
}
