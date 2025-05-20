package com.Java.MultiThreding.LifeCycleOfTread;

import com.Java.MultiThreding.Deepak_sir.MyThread;

public class New_1 {
    public static void main(String[] args) {
        // Create a new thread. This thread is in NEW state.
        MyThread thread = new MyThread();
        Thread th = new Thread(thread);

        // Check thread state (NEW)
        System.out.println("Thread state before start: " + th.getState());

    }
}
