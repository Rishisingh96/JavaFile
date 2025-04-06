package com.Design_Patterns.Singleto_Design_Pattern;

public class EnumSingletonTest {
    public static void main(String[] args) {
        // Access Singleton instance
        EnumSingleton singleton1 = EnumSingleton.INSTANCE;
        EnumSingleton singleton2 = EnumSingleton.INSTANCE;

        // Calling method
        singleton1.showMessage();

        // Checking if both instances are the same
        System.out.println("HashCode of singleton1: " + singleton1.hashCode());
        System.out.println("HashCode of singleton2: " + singleton2.hashCode());

        if (singleton1 == singleton2) {
            System.out.println("Both instances are the same (Singleton verified).");
        } else {
            System.out.println("Different instances (Singleton failed).");
        }
    }
}
