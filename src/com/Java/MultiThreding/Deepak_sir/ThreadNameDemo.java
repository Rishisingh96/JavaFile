package com.Java.MultiThreding.Deepak_sir;

class test extends Thread{
    public void run(){
//  System.out.println("thread task");
        System.out.println("thread task is executed by : " + Thread.currentThread().getName());
    }
}
public class ThreadNameDemo {
    public static void main(String[] args) {
        System.out.println("Hello");
      //  System.out.println(Thread.currentThread().getName()); //main

        //change Thread Name using setName
//        Thread.currentThread().setName("Rishi singh");
//        System.out.println("New Thread Name : " + Thread.currentThread().getName());

       // System.out.println(10/0);

        test t1 = new test(); //thread task is executed by : Thread-0
        t1.start();

        test t2 = new test();
        // if we change thread name than
        t2.setName("Rishi "); //thread task is executed by : Rishi
        t2.start();
    }
}
