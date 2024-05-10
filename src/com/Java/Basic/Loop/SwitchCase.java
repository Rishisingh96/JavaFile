package com.Java.Basic.Loop;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ch;
        do {
            System.out.println("Enter your Choice:\n1. Check if a number is Positive or Negative\n2. Print Table\n3. Print factorial\n00. Exit");
            ch = in.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter your number:");
                    int n = in.nextInt();
                    String result = (n >= 0) ? "Positive" : "Negative";
                    System.out.println("The number is " + result);
                    break;
                case 2:
                    System.out.println("Enter your number:");
                    int m = in.nextInt();
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(m + " x " + i + " = " + (m * i));
                    }
                    break;
                case 3:
                    System.out.println("Enter your number:");
                    int f = in.nextInt();
                    int fact = 1;
                    while (f > 1) {
                        fact *= f;
                        f--;
                    }
                    System.out.println("Factorial: " + fact);
                    break;
                case 00:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        } while (ch != 00);
    }
}
