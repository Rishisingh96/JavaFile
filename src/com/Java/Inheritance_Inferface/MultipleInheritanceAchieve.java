package com.Java.Inheritance_Inferface;

// First Interface
interface Animal {
    void sound(); // Abstract method
}

// Second Interface
interface Mammal {
    void habitat(); // Abstract method
}

// Implementing both interfaces
class Dog implements Animal, Mammal {

    // Implementing sound method from Animal interface
    @Override
    public void sound() {
        System.out.println("The dog barks.");
    }

    // Implementing habitat method from Mammal interface
    @Override
    public void habitat() {
        System.out.println("The dog lives on land.");
    }

    // Dog's specific behavior
    public void breed() {
        System.out.println("The dog is a German Shepherd.");
    }
}

// Main class to test multiple inheritance
public class MultipleInheritanceAchieve {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();   // Method from Animal interface
        dog.habitat(); // Method from Mammal interface
        dog.breed();   // Dog's own method
    }
}
