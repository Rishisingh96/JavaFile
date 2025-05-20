package com.Java.MultiThreding.Deepak_sir;

public class MyThread implements Runnable{
    int a = 20, b = 10;
    public void run()
    {
        addition(); // task1
        subtraction(); // task2
        multiplication(); // task3
    }
    void addition()
    {
        int sum = a + b;
        System.out.println("Addition of two numbers: " +sum);
    }
    void subtraction()
    {
        int sub = a - b;
        System.out.println("Subtraction of two numbers: " +sub);
    }
    void multiplication()
    {
        int multiply = a * b;
        System.out.println("Multiplication of two numbers: " +multiply);
    }

    public static void main(String[] args) {
        System.out.println("Main thread started");
        MyThread myThread = new MyThread();
        Thread t1 = new Thread(myThread);
        t1.start();
    }
}
