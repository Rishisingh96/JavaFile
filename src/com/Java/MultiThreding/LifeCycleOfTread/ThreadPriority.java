package com.Java.MultiThreding.LifeCycleOfTread;

public class ThreadPriority implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread());
    }

    public static void main(String[] args) {
        ThreadPriority a = new ThreadPriority();

        Thread t1 = new Thread(a, "First Thread");
        Thread t2 = new Thread(a, "Second Thread");
        Thread t3 = new Thread(a, "Third Thread");

        t1.setPriority(4); // Setting priority of the first thread.
        t2.setPriority(2); // Setting priority of the second thread.
        t3.setPriority(8); // Setting priority of the third thread.

        t1.start();
        t2.start();
        t3.start();


    }
}
