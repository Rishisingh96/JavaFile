package com.Design_Patterns.Singleto_Design_Pattern;

public class LazySingletonExample {
    public static void main(String[] args) {
        // First call - Instance will be created
        LazySingleton singleton1 = LazySingleton.getInstance();
        singleton1.showMessage();
        System.out.println("Instance 1 HashCode: " + singleton1.hashCode());

        // Second call - Same instance will be returned
        LazySingleton singleton2 = LazySingleton.getInstance();
        System.out.println("Instance 2 HashCode: " + singleton2.hashCode());

        // Third call - Still the same instance
        LazySingleton singleton3 = LazySingleton.getInstance();
        System.out.println("Instance 3 HashCode: " + singleton3.hashCode());
    }
}
