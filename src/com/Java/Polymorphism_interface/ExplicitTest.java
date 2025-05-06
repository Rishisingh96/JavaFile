package com.Java.Polymorphism_interface;

public class ExplicitTest {
    public static void main(String[] args)
    {
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("Conversion of int to byte.");
        b = (byte) i;
        System.out.println("i = " + i + " b = " + b); //i = 257 b = 1
        System.out.println("nConversion of double to int.");

        i = (int) d;
        System.out.println("d = " + d + " b = " + i);  //d = 323.142 b = 323
        System.out.println("nConversion of double to byte.");
        b = (byte) d;
        System.out.println("d = " + d + " b = " + b); //d = 323.142 b = 67
    }
}
