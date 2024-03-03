package com.Java.Basic;//package Rishicode;
import java.util.Scanner;
class R_1_simple_interest{
    public static void main(String[] arg){
        //int p, i,n,SI;
        System.out.println("Enter your number :\nprincpal(p) \n rate(I) \ntime(N)\n");
        Scanner a = new Scanner(System.in);
        int p = a.nextInt();
        int i = a.nextInt();
        int n = a.nextInt();
        int  SI = (p*i*n)/100;
        System.out.println("Simple interest  "  +SI);

    }
}