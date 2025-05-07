package com.Java.Polymorphism_interface;
class ParentClass{
    //Declaring a static method
    public static void classMethod(){
        System.out.println("Static method of ParentClass");
    }
    //Declaring a non-static method
    public void instanceMethod(){
        System.out.println("Non-static method of ParentClass");
    }
}

public class MethodHidingPractice {
    public static void main(String[] args) {
        ParentClass p = new ChildClass();
        p.classMethod(); // Calling with reference. (Method hiding)
        p.instanceMethod(); // Calling with object. (Method overriding)

        ChildClass c = new ChildClass();
        c.classMethod(); // Calling with reference.
        c.instanceMethod(); // Calling with object.
        ParentClass p1 = new ParentClass();
        p1.classMethod(); // Calling with reference.
        p1.instanceMethod(); // Calling with object.
    }
}
