package com.Java.Polymorphism_interface;

public class ChildClass extends ParentClass{
    //Overriding the static method
    public static void classMethod(){
        System.out.println("Static method of ChildClass");
    }
    //Overriding the non-static method
    public void instanceMethod(){
        System.out.println("Non-static method of ChildClass");
    }
}


