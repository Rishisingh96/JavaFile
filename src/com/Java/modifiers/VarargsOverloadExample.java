package com.Java.modifiers;

public class VarargsOverloadExample {
    public static void printNumbers(int a, int b) {
        System.out.println("Two arguments: " + a + ", " + b);
    }
    public static void printNumbers(int... numbers) {
        System.out.print("Varargs: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        printNumbers(5, 10);          // Calls the two-argument method
        printNumbers(1, 2, 3, 4, 5);  // Calls the varargs method
    }
}
