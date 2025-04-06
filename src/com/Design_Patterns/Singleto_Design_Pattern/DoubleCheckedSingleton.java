package com.Design_Patterns.Singleto_Design_Pattern;

public class DoubleCheckedSingleton {
    // Volatile keyword ensures visibility of changes across threads
    private static volatile DoubleCheckedSingleton instance;

    // Private constructor prevents instantiation
    private DoubleCheckedSingleton() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create Singleton instance");
        }
    }

    // Public method to get instance
    public static DoubleCheckedSingleton getInstance() {
        if (instance == null) {  // First check (No locking)
            synchronized (DoubleCheckedSingleton.class) { // Locking the class
                if (instance == null) {  // Second check (Thread-safety)
                    instance = new DoubleCheckedSingleton(); // Create instance
                }
            }
        }
        return instance;
    }
}
