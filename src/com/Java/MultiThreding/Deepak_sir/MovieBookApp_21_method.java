package com.Java.MultiThreding.Deepak_sir;

class TotalEarnings extends Thread{
    int total = 0;
    public void run() {
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                total = total + 100;
            }
            this.notify();  // for one thread
//            this.notifyAll(); // for more thread
        }
    }
}
public class MovieBookApp_21_method {
    public static void main(String[] args) throws InterruptedException {
        TotalEarnings te = new TotalEarnings();
        te.start();
        // System.out.println("Total earnings : " + te.total + " Rs");  //wrong answer total_E = 0 so we use wait notify
        synchronized (te) {
            te.wait();
            System.out.println("Total earnings : " + te.total + " Rs");
        }
    }
}
