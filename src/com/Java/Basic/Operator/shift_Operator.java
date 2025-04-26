package com.Java.Basic.Operator;

public class shift_Operator {
    public static void main(String[] args) {
        // Left shift operator
        int a = 20;
        System.out.println("Left shift operator: " + (a << 3)); // 20 * 2^3 = 160

        // Right shift operator
        int b = 10;
        System.out.println("Right shift operator: " + (b >> 3)); // 10 / 2^3 = 1

        // Unsigned right shift operator
        int c = -20;
        System.out.println("Unsigned right shift operator: " + (c >>> 2)); // -20 / 2^2 = -5
    }
}
