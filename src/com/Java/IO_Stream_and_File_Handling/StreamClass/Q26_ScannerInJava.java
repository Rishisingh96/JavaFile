package com.Java.IO_Stream_and_File_Handling.StreamClass;

import java.util.Scanner;

public class Q26_ScannerInJava {
    public static void main(String[] args) {
        // Scanner is a class in Java that is used to read input from various sources
        // It can read input from the console, files, and other sources
        // It is part of the java.util package
        // It is used to parse primitive types and strings using regular expressions

       //Example
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        System.out.println("You entered: " + x);

    }
}
