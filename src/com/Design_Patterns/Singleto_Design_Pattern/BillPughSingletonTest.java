package com.Design_Patterns.Singleto_Design_Pattern;

public class BillPughSingletonTest {
    public static void main(String[] args) {
        // Access Singleton instance
        BillPughSingleton instance1 = BillPughSingleton.getInstance();
        instance1.showMessage();

        // Getting another instance
        BillPughSingleton instance2 = BillPughSingleton.getInstance();
        instance2.showMessage();

        // Checking if both instances have the same hashcode (ensuring Singleton property)
        System.out.println("Instance 1 HashCode: " + instance1.hashCode());
        System.out.println("Instance 2 HashCode: " + instance2.hashCode());
    }
}
