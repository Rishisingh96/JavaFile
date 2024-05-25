package com.Java.Universal.Week2;

import java.util.Scanner;

public class Lucas_Series_StringQ5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of terms for Lucas series:");
        int LN = in.nextInt();
        int next=0;
        int l1 = 2;  // First term of Lucas series
        int l2 = 1;  // Second term of Lucas series
        System.out.print("Lucas series: ");
        System.out.print(l1+" ");
        System.out.print(l2+" ");

        for (int i = 2; i <= LN; i++) {

                next = l1 + l2;
            System.out.print(next + " ");
                l1 = l2;
                l2 = next;
            }
    }
}
