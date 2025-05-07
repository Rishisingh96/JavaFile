package com.Java.Polymorphism_interface;
class A
{
    public Object m1()
    {
        System.out.println("Hello, this is a superclass");
        return null;
    }
}
class B extends A
{
    @Override
    public String m1()
    {
        System.out.println("Hello, this is the subclass");
        return null;
    }
}

public class CovariantReturnType {
    public static void main(String[] args) {
        A a = new A();
        a.m1();
        B b = new B();
        b.m1();
        // Creating an object of the parent class
        System.out.println("-----------------");
        A a1 = new B();
        a1.m1();
    }
}
