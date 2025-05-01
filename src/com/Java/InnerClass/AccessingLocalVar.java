package com.Java.InnerClass;

public class AccessingLocalVar
{
    public void m1()
    {
        int x = 20; // local variable of m1().
        class InnerClass
        {
            public void printSum() {
                System.out.println(x); // Compile time error.
            }
        }
        InnerClass ic = new InnerClass();
        ic.printSum();
    }
    public static void main(String[] args) {
        AccessingLocalVar av = new AccessingLocalVar();
        av.m1();
    }
}