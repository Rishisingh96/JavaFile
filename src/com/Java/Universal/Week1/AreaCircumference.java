package com.Java.Universal.Week1;


//1. Program to find area and circumference of a circle. (Use Fixed Data , Do
//not take values from user)
public class AreaCircumference {
    public static void main(String[] args) {
        //Area (A) = π * r^2          //π =3.14159.
        int r = 8;
        float pi = 3.14f;
        float A =  pi * (r*r);
        System.out.println("Area of Circle = " + A);

        //Circumference (C) = 2 * π * r
        float C =  2*pi*r ;
        System.out.println("Circumference of Circle = " + C);
    }
}
