package com.Java.Basic.Universal;

import java.util.Scanner;
public class AofRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length,width;
        System.out.println("Enter your length:");
        length = sc.nextShort();
        System.out.println("Enter your width:");
        width = sc.nextShort();

        int AofR = length*width;
        System.out.println("Your Area of Rectangle : "+AofR);
    }
}
