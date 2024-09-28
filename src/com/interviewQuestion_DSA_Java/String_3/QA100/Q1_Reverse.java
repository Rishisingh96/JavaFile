package com.interviewQuestion_DSA_Java.String_3.QA100;

public class Q1_Reverse {
    public static void main(String[] args) {
        String str = "Hello word";
        String reverse = new StringBuilder(str).reverse().toString();
        System.out.println("Reverse word :"+reverse);
    }
}
