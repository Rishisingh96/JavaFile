package com.Java.InnerClass;

// Interface definition
interface Greeting {
    void sayHello();
}

// Outer class
public class AnonymousInnerClassExample {
    public static void main(String[] args) {
        // Anonymous inner class implementing Greeting interface
        Greeting greet = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello! This is an anonymous inner class.");
            }
        };

        // Calling the method
        greet.sayHello();
    }
}

