package com.Java.Universal.Week2;

class PersonCo {
    String name1;
    int age;

    // Default age of person should be 18
    public PersonCo(String name, int age) {
        this.name1 = name;
        this.age = (age == 0) ? 18 : age; // if age is not provided, set it to 18
    }

    // Method to display name and age of person
    void display() {
        System.out.println("Name: " + name1);
        System.out.println("Age: " + age);
    }
}

public class PersonConstructor {
    public static void main(String[] args) {
        PersonCo p1 = new PersonCo("Rishi Singh", 0); // Age not provided, should be set to 18
        p1.display();
    }
}
