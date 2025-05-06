package com.Java.Inheritance_Inferface.Super_This_keyword;
class Vehicle {
    String brand;
    int maxSpeed;

    // Constructor for Vehicle
    Vehicle(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    // Method to display Vehicle details
    void displayDetails() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Max Speed: " + this.maxSpeed);
    }
}
class Car extends Vehicle {
    int doors;
    String model;

    // Constructor for Car
    Car(String brand, int maxSpeed, int doors, String model) {
        super(brand, maxSpeed); // Call to the constructor of the base class Vehicle
        this.doors = doors;
        this.model = model;
    }

    // Method to display Car details, overriding displayDetails() from Vehicle
    @Override
    void displayDetails() {
        super.displayDetails(); // Call to the displayDetails() method of the base class Vehicle
        System.out.println("Model: " + this.model);
        System.out.println("Doors: " + this.doors);
    }

    // Method specific to Car
    void displayCarInfo() {
        System.out.println("Displaying Car Info:");
        this.displayDetails(); // Call to the displayDetails() method of this class
    }
}

public class Super_This_KeywordEx {
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car("Toyota", 200, 4, "Corolla");

        // Display Car details
        myCar.displayCarInfo();
    }
}
