package com.Java.Universal.Week2;

class Person {
    String name;
    int age;

    // Default age of person should be 18
    public Person() {
        this.age = 18;
    }

    // Parameterized constructor to initialize Person object
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display name and age of person
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class PersonProperties {
    public static void main(String[] args) {
        Person p1 = new Person("Rishi Singh", 22);
        p1.display();

        Person p2 = new Person("Garima", 25);
        p2.display();

        Person p3 = new Person();
        p3.name = "Default Person";
        p3.display();
    }
}
