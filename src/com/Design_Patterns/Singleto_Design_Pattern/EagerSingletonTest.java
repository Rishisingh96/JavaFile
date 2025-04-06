package com.Design_Patterns.Singleto_Design_Pattern;

public class EagerSingletonTest {
    public static void main(String[] args) {
        // Fetching the Singleton instance
        EagerSingleton singleton1 = EagerSingleton.getInstance();
        singleton1.showMessage();

        // Fetching again to verify it’s the same instance
        EagerSingleton singleton2 = EagerSingleton.getInstance();

        // Checking if both instances have the same hash code (confirming Singleton behavior)
        System.out.println("Hashcode of singleton1: " + singleton1.hashCode());
        System.out.println("Hashcode of singleton2: " + singleton2.hashCode());

        // Both hashcodes should be the same, proving that only one instance exists
    }
}
