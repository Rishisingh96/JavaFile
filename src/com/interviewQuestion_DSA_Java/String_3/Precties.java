package com.interviewQuestion_DSA_Java.String_3;

public class Precties {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Good bye");
        String s4 = new String("Hello");

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(args));
        System.out.println(s1.equals(null));

    }
}
