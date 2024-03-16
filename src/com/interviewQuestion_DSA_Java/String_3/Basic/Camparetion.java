package com.interviewQuestion_DSA_Java.String_3.Basic;

public class Camparetion {
    public static void main(String args[]) {
/*/ Creating two string literals.
        String s1 = "Hello";
        String s2 = "Hello";

// Creating two string objects with values "Good bye" and "Hello".
        String s3 = new String("Good bye");
        String s4 = new String("Hello");
        // Compares the content of s1 and s2 using the equals method.
        System.out.println(s1.equals(s2)); // true because content and case is same.
        // Compares the content of s1 and s3 using the equals method.
        System.out.println(s1.equals(s3)); // false because the content is different.
        // Compares the content of s1 and the argument 'args'.
        System.out.println(s1.equals(args)); // false because 'args' is not equal to "Hello".
        // Compares the content of s1 and a null value.
        System.out.println(s1.equals(null)); // false because null is not equal to "Hello".
// Compares the content of s2 and s4 using the equals method and if-else statement.
// Since s2 and s4 have the same content ("Hello"), it prints "Both strings are equal".
        if (s2.equals(s4)) {
            System.out.println("Both strings are equal");
        } else {
            System.out.println("Both strings are unequal");
        }
*/
        //	String Compare by = = Operator in Java

    /*    String s7 = "Cricket";
        String s5 = "Cricket";
        String s6 = new String("Cricket");
        System.out.println(s7 == s5); // true
        System.out.println(s7 == s6); // false
*/

///	Java String Compare by compareTo method
        String s1 = "mumbai";
        String s2 = "mumbai";
        String s3 = "ranchi";
        String s4 = "pune";
        String s5 = " "; // Empty string.
        // This statement will print 0 because both are equal.
        System.out.println(s1.compareTo(s2));
        // This statement will print -5 because 'm' is 5 times lower than 'm'.
        System.out.println(s1.compareTo(s3));
        // This statement will print -3 because 'm' is 3 times lower than 'p'.
        System.out.println(s1.compareTo(s4));
        // This statement will print 2 because 'r' is 2 times greater than 'p'.
        System.out.println(s3.compareTo(s4));
// This statement will print 4 because there are 4 characters in pune, whereas empty string has no characters.
        System.out.println(s4.compareTo(s5));

    }
}