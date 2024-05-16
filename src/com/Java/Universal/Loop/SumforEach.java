package com.Java.Universal.Loop;

import java.util.Scanner;

public class SumforEach {
    public static void main(String[] args) {
        int sum = 0;
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
        int arr[] = {10,40,20,10};
        for(int i:arr){
            sum  = sum+i;
        }
        System.out.println(sum);
    }
}
