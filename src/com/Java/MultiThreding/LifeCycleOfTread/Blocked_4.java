package com.Java.MultiThreding.LifeCycleOfTread;

public class Blocked_4 {
    public static void main(String[] args) {
        Object lock = new Object();
        // Create two threads that will try to acquire the same lock.
        MyThreadCode thread1 = new MyThreadCode("Thread 1", lock);
        MyThreadCode thread2 = new MyThreadCode("Thread 2", lock);
// Start both threads using start() method.
        thread1.start();
        thread2.start();

    }

}
