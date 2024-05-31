package com.chatApp;
import java.net.*;
import java.io.*;

public class Server {
    ServerSocket server;
    Socket socket;

    BufferedReader br;
    PrintWriter out;

    // Constructor...........
    public Server() {
        try {
            server = new ServerSocket(4444);
            System.out.println("server is ready to accept connection");
            System.out.println("waiting.......");
            socket = server.accept();

            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream());

            startReading();
            startWritting();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        System.out.println("This is server..going to start server");
        new Serverswing();
    }

    public void startReading() {
        // thread - read karke deta rahega
        Runnable r1 = () -> {
            System.out.println("reader started...");
            try {
                while (!socket.isClosed()) {
                    String msg = br.readLine();
                    if (msg.equals("0")) {
                        System.out.println("Client terminated the chat");
                        socket.close();
                        break;
                    }
                    System.out.println("Client : " + msg);
                }
            } catch (Exception e) {
             //   e.printStackTrace();
                System.out.println("Connection is closed");
            }
        };
        new Thread(r1).start();
    }

    public void startWritting() {
        // thread - data user lega and tha send karega client tak
        Runnable r2 = () -> {
            System.out.println("writer started......");
            try {
                while (true) {
                    BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
                    String content = br1.readLine();
                    out.println(content);
                    out.flush();

                    if(content.equals("0")){
                        socket.close();
                        break;
                    }
                }
            } catch (Exception e) {
               // e.printStackTrace();
                System.out.println("Connection is closed");
            }
            System.out.println("Connection is closed");
        };
        new Thread(r2).start();
    }
}
