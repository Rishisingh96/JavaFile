package com.interviewQuestion_DSA_Java.Array_3.Basic;

import java.util.Scanner;

public class R1_Max_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[10];
        int max;

        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            a[i] = scanner.nextInt();
        }
        max = a[0];
        for (int i = 1; i < 10; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        System.out.println("\nMax Number is " + max);
    }
}
