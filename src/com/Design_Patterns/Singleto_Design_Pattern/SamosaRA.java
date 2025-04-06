package com.Design_Patterns.Singleto_Design_Pattern;

public class SamosaRA {
    private static volatile SamosaRA samosa; // Volatile to ensure visibility across threads

    // Private constructor to prevent instantiation
    private SamosaRA() {
        if (samosa != null) {
            throw new RuntimeException("You are trying to break singleton pattern using Reflection API");
        }
    }

    // Public method to get the instance (Thread-safe with double-checked locking)
    public static SamosaRA getSamosa() {
        if (samosa == null) {
            synchronized (SamosaRA.class) { // Lock the class to prevent multiple instantiations
                if (samosa == null) {
                    samosa = new SamosaRA(); // Create the instance
                }
            }
        }
        return samosa;
    }
}
