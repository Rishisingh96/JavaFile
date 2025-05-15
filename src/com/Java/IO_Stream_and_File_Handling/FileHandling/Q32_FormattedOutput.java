package com.Java.IO_Stream_and_File_Handling.FileHandling;

public class Q32_FormattedOutput {
    public static void main(String[] args) {
        // Formatted output in Java
        // The printf() method is used to print formatted output in Java.
        // It is similar to the printf() function in C/C++.
        // The printf() method takes a format string and a variable number of arguments.
        // The format string contains format specifiers that specify how the arguments should be formatted.

        String name = "Rishi";
        int age = 25;
        double salary = 50000.50;

        System.out.printf("Name: %s, Age: %d, Salary: %.2f%n", name, age, salary);

    }
}
