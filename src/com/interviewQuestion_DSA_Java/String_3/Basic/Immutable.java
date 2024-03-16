package com.interviewQuestion_DSA_Java.String_3.Basic;

public class Immutable {
    public static void main(String[] args) {
        // Creating a sting literal object with content.
        String s = "hello";

        // Calling concat() method to add string at the end.
        s.concat("world");
        System.out.println(s); // It will print "hello" because string is an immutable object.

    }
}
