package com.Java.constructor;

public class FlavorTest {
    public static void main(String[] args)
    {
        Mango m1 = new Mango(true);
        Mango m2 = new Mango(m1);
        m1.flavor();
        m1.sweet = false;
        m2.flavor();
        m1.flavor();
    }
}
