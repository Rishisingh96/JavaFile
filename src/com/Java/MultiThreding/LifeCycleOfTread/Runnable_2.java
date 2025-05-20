package com.Java.MultiThreding.LifeCycleOfTread;

import com.Java.MultiThreding.Deepak_sir.MyThread;

public class Runnable_2 {
    public static void main(String[] args) {
        // Create a new thread. This thread is in NEW state.
        MyThread thread = new MyThread();
        Thread th = new Thread(thread);

        // Check thread state (NEW)
        System.out.println("Thread state before start: " + th.getState());

        // Start the thread. Now the thread moves from New to Runnable state.
        th.start();
        // Check the current thread state after calling start.
        System.out.println("Thread state after start: " + th.getState());

    }
}
