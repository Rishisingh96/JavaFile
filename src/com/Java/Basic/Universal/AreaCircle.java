package com.Java.Basic.Universal;

import java.util.Scanner;

public class AreaCircle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your radius:");
        float r =sc.nextFloat();
        float AreaC =  3.14f * r*r;
        System.out.println(AreaC);
    }
}
