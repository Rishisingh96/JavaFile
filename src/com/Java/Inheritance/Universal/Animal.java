package com.Java.Inheritance.Universal;


class Animal2 {
    void eat() {
        System.out.println("Eating........");
    }

    void sleep() {
        System.out.println("Sleeping........");
    }
}

class Dog extends Animal2 {
    void bark() {
        System.out.println("Barking........");
    }
}

class Cat extends Animal2 {
    void meow() {
        System.out.println("Meowing........");
    }
}

public class Animal {
    public static void main(String[] args) {
        System.out.println("\n+++++++++++++++++++++++");
        Animal2 animal = new Animal2();
        animal.eat();
        animal.sleep();

        Dog dog = new Dog();
        System.out.println("\n+++++++++++++++++++++++");
        dog.eat();
        dog.sleep();
        dog.bark();

        Cat cat = new Cat();
        System.out.println("\n+++++++++++++++++++++++");
        cat.eat();
        cat.sleep();
        cat.meow();
    }
}
