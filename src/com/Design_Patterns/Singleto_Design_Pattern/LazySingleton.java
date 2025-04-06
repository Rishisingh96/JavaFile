package com.Design_Patterns.Singleto_Design_Pattern;

public class LazySingleton {
    private static LazySingleton instance; // Singleton instance

    // Private constructor to prevent instantiation
    private LazySingleton() {
        System.out.println("LazySingleton Instance Created");
    }

    // Public method to get the instance
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton(); // Create instance only when needed
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Lazy Singleton!");
    }
}
