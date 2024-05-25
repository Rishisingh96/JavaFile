package com.Java.Universal.Week1;

import java.util.Scanner;

public class ReverseNamenew {
    public static void reveres(char[] st) {
        int start = 0;
        int end =  st.length - 1;
        while (start <= end) {
            char temp = st[start];
            st[start] = st[end];
            st[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        char[] st = new char[10];
        System.out.println("Enter your name");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        reveres(st);
        System.out.println("Your reveres name is :"+st);
    }


}
