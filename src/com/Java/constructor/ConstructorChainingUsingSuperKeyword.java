package com.Java.constructor;// File name should be ConstructorChainingUsingSuperKeyword.java

class Parent1 {
    Parent1() {
        // super(); // It calls Object class constructor.
        System.out.println("Parent class constructor");
    }
}
// Here, extends is used for developing inheritance between two classes.

class Child extends Parent1 {
    // super(); // It calls parent class constructor.

    Child() {
        // super(); // super() is implicitly called, so this line is optional
        System.out.println("Child class constructor");
    }
}

public class ConstructorChainingUsingSuperKeyword {
    public static void main(String[] args) {
        Child child = new Child();
    }
}
