package com.chatApp;
import java.net.*;
import java.io.*;
public class Client {

    Socket socket;

    BufferedReader br;
    PrintWriter out;
    public Client(){
        try {
            System.out.println("Sending request to server");
            socket = new Socket("127.0.0.1",4444);
            System.out.println("connection done.");

            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream());

            startReading();
            startWritting();
        }catch (Exception e){
            // TODO : handle exception

        }
    }
    public void startReading() {
        // thread - read karke deta rahega
        Runnable r1 = () -> {
            System.out.println("reader started...");
            try {
                while (true) {
                    String msg = br.readLine();
                    if (msg.equals("0")) {
                        System.out.println("Server terminated the chat");
                        break;
                    }
                    System.out.println("Server : " + msg);
                }
            } catch (Exception e) {
               // e.printStackTrace();
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
                while (!socket.isClosed()) {
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
                //e.printStackTrace();
                System.out.println("Connection is closed");
            }
            System.out.println("Connection is closed");
        };
        new Thread(r2).start();
    }

    public static void main(String[] args) {
        System.out.println("This is client.......");
        new Client();
    }
}
