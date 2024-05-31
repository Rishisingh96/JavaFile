package com.chatApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Serverswing {
    ServerSocket server;
    Socket socket;
    BufferedReader br;
    PrintWriter out;

    private JFrame frame;
    private JTextArea textArea;
    private JTextField textField;
    private JButton sendButton;

    public Serverswing() {
        try {
            server = new ServerSocket(4444);
            System.out.println("Server is ready to accept connection");
            System.out.println("Waiting.......");
            socket = server.accept();

            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream());

            createGUI();
            handleEvents();

            startReading();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void createGUI() {
        frame = new JFrame("Server Chat");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        textArea = new JTextArea();
        textArea.setEditable(false);
        frame.add(new JScrollPane(textArea), BorderLayout.CENTER);

        textField = new JTextField();
        sendButton = new JButton("Send");

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(textField, BorderLayout.CENTER);
        panel.add(sendButton, BorderLayout.EAST);

        frame.add(panel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    private void handleEvents() {
        sendButton.addActionListener(e -> sendMessage());
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    sendMessage();
                }
            }
        });
    }

    private void sendMessage() {
        String content = textField.getText();
        out.println(content);
        out.flush();
        textField.setText("");
    }

    public void startReading() {
        Runnable r1 = () -> {
            System.out.println("Reader started...");
            try {
                while (true) {
                    String msg = br.readLine();
                    if (msg.equals("0")) {
                        System.out.println("Client terminated the chat");
                        break;
                    }
                    textArea.append("Client: " + msg + "\n");
                }
            } catch (Exception e) {
                System.out.println("Connection is closed");
            }
        };
        new Thread(r1).start();
    }

    public static void main(String[] args) {
        System.out.println("This is server..going to start server");
        new Serverswing();
    }
}
