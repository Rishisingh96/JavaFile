package com.Java.WrapperClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ByteTest {
    public static void main(String[] args) throws IOException
    {
// Create an object of InputStreamReader and BufferedReader class to accept data from keyboard.
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

// Take a byte value as string str1.
        System.out.println("Enter first byte number: ");
        String str1 = br.readLine();

// Create an object of Byte class and pass the str1 as a parameter to its constructor.
        Byte b1 = new Byte(str1);

// Take another byte value as string str2.
        System.out.println("Enter second byte number: ");
        String str2 = br.readLine();
// Create another object of Byte class and pass str2 as parameter to its constructor.
        Byte b2 = new Byte(str2);

// Now compare the content of both Byte objects.
        int num = b1.compareTo(b2);

        if(num == 0)
            System.out.println("Contents of both Bytes are equal");
        else
        if(num < 0)
            System.out.println(+b1 +" is less than " +b2);
        else
            System.out.println(+b1 +" is greater than " +b2);
    }
}

