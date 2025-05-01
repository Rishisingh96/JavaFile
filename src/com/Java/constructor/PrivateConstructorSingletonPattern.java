package com.Java.constructor;
class Singleton {
    // The sole instance of the class
    private static Singleton instance;
    // Private constructor prevents instantiation from outside the class
    private Singleton() { }
    // Public static method to get the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
class Utilities {
    // Create private constructor to prevent instantiation of the class.
    private Utilities() {
        throw new UnsupportedOperationException("This is a utility class and we cannot instantiate it");
    }
    // Static utility method
    public static int add(int a, int b) {
        return a + b;
    }
}

public class PrivateConstructorSingletonPattern {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println("Single instance obtained.....");

        int result = Utilities.add(5,5);
        System.out.println("Result = "+result);
    }
}
