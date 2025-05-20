package com.Java.MultiThreding.LifeCycleOfTread;

public class MyThreadCode extends Thread {
    private Object lock;
    public MyThreadCode(String name, Object lock) {
        super(name);
        this.lock = lock;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is trying to acquire the lock.");
        synchronized (lock) {
            System.out.println(Thread.currentThread().getName() + " has acquired the lock.");
            try {
                // Hold the lock for 2 seconds.
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " is releasing the lock.");
        }
    }
}

