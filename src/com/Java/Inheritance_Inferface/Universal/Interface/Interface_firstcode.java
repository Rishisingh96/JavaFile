package com.Java.Inheritance_Inferface.Universal.Interface;
interface Vehicle {
    void speed(); // public abstract

    void breaking(); // This code is bydefault abstract this is compalsary
}

class Car implements Vehicle {
    public void speed() {
        System.out.println("speeding......");
    }

    public void breaking() {
        System.out.println("Break.....");
    }

    void MyName() {
        System.out.println("My name is Rishi singh");
    }
}
public class Interface_firstcode {
    public static void main(String[] args) {

            Car in = new Car();
            in.speed();
            in.breaking();
            in.MyName();
    }
}
