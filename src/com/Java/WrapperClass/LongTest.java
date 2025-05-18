package com.Java.WrapperClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongTest {
    public static void main(String[] args) throws IOException
    {
// Accept an Integer number from keyboard.
        InputStreamReader sr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(sr);

        System.out.println("Enter an integer number:");
        String str = bf.readLine();

// Converting string into long type.
        long l = Long.parseLong(str);
        System.out.println("In decimal format: " +l);
// Converting into other number systems.
        str = Long.toBinaryString(l);
        System.out.println("In binary format: " +str);

        str = Long.toHexString(l);
        System.out.println("In hexdecimal format: " +str);

        str = Long.toOctalString(l);
        System.out.println("In octal format: " +str);
    }
}

