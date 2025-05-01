package com.Java.InnerClass;

//How to access Instance variables of Outer class & local variables of method local inner class?
public class AccessingVar
{
    int a = 20;  // Instance variables of outer class.
    static int b = 30; // Static variables of outer class.
    // Instance method of the outer class.
    public void m1()
    {
        // Instance area.
        class InnerClass
        {
            // Local variables of inner class.
            int c = 30;
            public void printSum(){
                System.out.println("Sum of three numbers: " +(a+b+c)); // Accessing instance, static, and local variables inside the method local inner class.
            }
        }
        InnerClass ic = new InnerClass();
        ic.printSum();
    }
    public static void main(String[] args)
    {
// Create an object of the outer class.
        AccessingVar av = new AccessingVar();
        av.m1();
    }
}
