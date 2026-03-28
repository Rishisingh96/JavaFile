package com.interviewQuestion_DSA_Java.Pattern;

public class name {
    public static void main(String[] args) {
        int N = 4; // number of terms
        int a = 0, b = 1;
        int sum = a + b; // start sum with first two terms
        System.out.print(a + " " + b + " "); // print first two terms
        for (int i = 2; i < N; i++) {
            int c = a + b; // next term
            System.out.print(c + " ");
            sum += c; // add to sum
            a = b; // move ahead
            b = c;
        }
        System.out.println("\nSum of Fibonacci Series up to " + N + " terms = " + sum);

    }
}
