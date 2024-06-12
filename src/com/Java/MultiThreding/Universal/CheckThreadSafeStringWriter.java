package com.Java.MultiThreding.Universal;

import java.io.StringWriter;

class MyThread1 extends Thread {
    private StringWriter sw;

    public MyThread1(StringWriter sw) {
        this.sw = sw;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (sw) {
                sw.write("Hi, My name is Rishi\n");
                System.out.println(sw.toString());
            }
        }
    }
}

class MyThread2 extends Thread {
    private StringWriter sw;

    public MyThread2(StringWriter sw) {
        this.sw = sw;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (sw) {
                sw.write("How are you?\n");
                System.out.println(sw.toString());
            }
        }
    }
}

public class CheckThreadSafeStringWriter {
    public static void main(String[] args) {
        StringWriter sw = new StringWriter();
        MyThread1 thread1 = new MyThread1(sw);
        MyThread2 thread2 = new MyThread2(sw);
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.err.println("Threads interrupted: " + e.getMessage());
        }
    }
}
