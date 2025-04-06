package com.Design_Patterns.Singleto_Design_Pattern;

public class BillPughSingleton {
    // Private constructor prevents instantiation from other classes
    private BillPughSingleton() {
        System.out.println("Singleton Instance Created!");
    }

    // Static inner class responsible for holding Singleton instance
    private static class SingletonHelper {
        // JVM loads this class only when getInstance() is called
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    // Global access point for the Singleton instance
    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    // Sample method to demonstrate functionality
    public void showMessage() {
        System.out.println("Hello from Bill Pugh Singleton!");
    }
}
