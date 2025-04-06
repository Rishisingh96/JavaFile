package com.Design_Patterns.Singleto_Design_Pattern;

public class EagerSingleton {
    // Step 1: Create a private static final instance of the class
    private static final EagerSingleton instance = new EagerSingleton();

    // Step 2: Private constructor to prevent instantiation
    private EagerSingleton() {
        System.out.println("EagerSingleton instance created!");
    }

    // Step 3: Public method to provide the single instance
    public static EagerSingleton getInstance() {
        return instance;
    }

    // Example method
    public void showMessage() {
        System.out.println("Hello from Eager Singleton!");
    }
}
