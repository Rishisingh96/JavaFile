package com.Java.MultiThreding.LifeCycleOfTread;

import org.w3c.dom.ls.LSOutput;

class Terminate extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName() + " is running.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " has finished execution.");
    }
}
public class Dead_5 {
    public static void main(String[] args) {
        Terminate thread1 = new Terminate();
        thread1.start();

        try {
            // Main thread waits for the created thread to finish.
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // After the complete execution of thread, it goes into the dead state.
        System.out.println("Is thread alive? " + thread1.isAlive());
        System.out.println("Thread has reached the Dead state.");
    }
}

