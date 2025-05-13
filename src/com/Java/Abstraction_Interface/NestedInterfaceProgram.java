package com.Java.Abstraction_Interface;
interface Outer
{
    void m1(); // Outer interface contains m1() method.
    interface Inner
    {
        void m2(); // Inner interface contains m2() method.
    }
}
// Implementation of top-level interface:
class MyClass1 implements Outer
{
    public void m1()
    {
        System.out.println("Java Outer Interface....");
    }
}
// Implementation of inner interface:
class MyClass2 implements Outer.Inner
{
    public void m2()
    {
        System.out.println("Java Inner Interface.....");
    }
}

public class NestedInterfaceProgram {
    public static void main(String[] args) {
        // Creating an object of class MyClass1.
        MyClass1 c1 = new MyClass1();
        c1.m1(); // Calling m1() method.

        // Creating an object of class MyClass2.
        MyClass2 c2 = new MyClass2();
        c2.m2(); // Calling m2() method.

    }
}
