package com.Java.loop.Patterns;

public class SolidRectangle {
    public static void main(String[] args) {
        int rows = 4, cols = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
 *****
 *****
 *****
 *****
 */