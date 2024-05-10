package com.Java.Basic.Universal;

import java.util.Scanner;

public class AofTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height, base;
        System.out.println("Enter your height:");
        height = sc.nextShort();
        System.out.println("Enter your base:");
        base = sc.nextShort();

        float AofT =  0.5f * base *height;
        System.out.println("Your Area of Triangle : "+AofT);
    }
}
