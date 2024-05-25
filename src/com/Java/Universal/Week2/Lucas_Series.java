package com.Java.Universal.Week2;

import java.util.Scanner;

    public class Lucas_Series {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the number of terms for Lucas series:");
            int LN = in.nextInt();

            int l1 = 2;  // First term of Lucas series
            int l2 = 1;  // Second term of Lucas series

            System.out.print("Lucas series: ");

            // Print the Lucas series terms
            for (int i = 0; i < LN; i++) {
                if (i == 0) {
                    System.out.print(l1 + " ");
                } else if (i == 1) {
                    System.out.print(l2 + " ");
                } else {
                    int next = l1 + l2;
                    System.out.print(next + " ");
                    l1 = l2;
                    l2 = next;
                }
            }
        }
    }


