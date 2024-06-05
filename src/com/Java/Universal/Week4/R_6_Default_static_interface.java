package com.Java.Universal.Week4;

interface Animal{
    void speak();
    default void sleep(){
        System.out.println("sleep in night......");
    }
    static void eat(){
        System.out.println("Eating food ..........");
    }
}
class Cat implements Animal{

    @Override
    public void speak(){
        System.out.println("Meow.......");
    }
}
public class R_6_Default_static_interface {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sleep();
        cat.speak();
        Animal.eat();

    }
}
