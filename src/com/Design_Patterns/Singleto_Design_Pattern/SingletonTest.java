package com.Design_Patterns.Singleto_Design_Pattern;

import com.Design_Patterns.Singleto_Design_Pattern.DoubleCheckedSingleton;

public class SingletonTest {
    public static void main(String[] args) {
        // Creating multiple threads to test thread-safety
        Thread thread1 = new Thread(() -> {
            DoubleCheckedSingleton instance1 = DoubleCheckedSingleton.getInstance();
            System.out.println("Instance 1 HashCode: " + instance1.hashCode());
        });

        Thread thread2 = new Thread(() -> {
            DoubleCheckedSingleton instance2 = DoubleCheckedSingleton.getInstance();
            System.out.println("Instance 2 HashCode: " + instance2.hashCode());
        });

        thread1.start();
        thread2.start();
    }
}
