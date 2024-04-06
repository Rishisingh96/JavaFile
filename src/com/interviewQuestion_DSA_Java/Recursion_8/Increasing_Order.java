package com.interviewQuestion_DSA_Java.Recursion_8;

public class Increasing_Order {
    public static void main(String[] args) {
        int n= 10;
        printDec(n);
    }

    private static void printDec(int n) {
        if(n==1){
            System.out.println(n);
            return;
        }
        printDec(n-1);
        System.out.println(n+" ");
    }
}