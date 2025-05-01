package com.Java.modifiers;

public class AmbiguousVarargsExample {
    public static void print(int... nums) {
        System.out.println("Varargs method");
    }
    public static void print(Integer i) {
        System.out.println("Single Integer method");
    }
    public static void main(String[] args) {
        // This will cause ambiguity because both methods could be called
        print(5);  // Which method? Varargs or Single Integer?
    }
}
