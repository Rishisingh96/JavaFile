package com.Java.WrapperClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntegerTest {
    public static void main(String[] args) throws IOException
    {
        // Accept an Integer number from keyboard.
        InputStreamReader sr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(sr);

        System.out.println("Enter an integer number:");
        String str = bf.readLine();

        // Converting string into int type.
        int i = Integer.parseInt(str);
        System.out.println("In decimal format: " +i);

        // Converting into other number systems.
        str = Integer.toBinaryString(i);
        System.out.println("In binary format: " +str);

        // Converting into hexadecimal format.
        str = Integer.toHexString(i);
        System.out.println("In hexdecimal format: " +str);

        // Converting into octal format.
        str = Integer.toOctalString(i);
        System.out.println("In octal format: " +str);
    }
}

