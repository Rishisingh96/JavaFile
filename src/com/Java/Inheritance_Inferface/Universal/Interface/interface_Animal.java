package com.Java.Inheritance_Inferface.Universal.Interface;


interface  Animal{
    void movement();
    void speak();
    default void eat(){
        System.out.println("Eating..........");
    }
}


public class interface_Animal {
    public static void main(String[] args) {

    }
}
