package com.Java.WrapperClass;

public class Circle_MathClass {
    public static void main(String[] args)
    {
        int radius = 2;
        double areaOfCircle = Math.PI * radius * radius;
        System.out.println("Area of circle = " +areaOfCircle);

        //Max Example
        int x = 20, y = 50;
        // Displaying the maximum of two numbers.
        System.out.println("Math.max(20, 50): " +Math.max(x, y));

        double p = 25.25, q = -25.589 ;
        System.out.println("Math.max(25.25, -25.589): " +Math.max(p, q));
        float a = -10.10f, b = -20.20f;
        System.out.println("Math.max(-10.10f, -20.20f): " +Math.max(a, b));

    }

}
