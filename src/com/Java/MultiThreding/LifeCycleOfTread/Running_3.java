package com.Java.MultiThreding.LifeCycleOfTread;

public class Running_3 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread is in RUNNING state, executing run() method.");
    }

    public static void main(String[] args) {
        // Create a new thread. This thread is in NEW state.
        Running_3 thread = new Running_3();


        // Check thread state (NEW)
        System.out.println("Thread state before start: " + thread.getState());

        // Start the thread by calling start() method. Now the thread moves from New to Runnable state.
        thread.start();
// Check the current thread state after calling start.
        System.out.println("Thread state after start: " + thread.getState());
    }

}
