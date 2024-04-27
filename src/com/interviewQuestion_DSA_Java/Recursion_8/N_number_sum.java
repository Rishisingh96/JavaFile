package com.interviewQuestion_DSA_Java.Recursion_8;

//Problem 4 - Print sum of first n natural numbers.
public class N_number_sum {
    public static int calcSum(int n){
        if(n==1){  // This is Base case he is important
            return 1;
        }
        int sum1 = calcSum(n-1);
        int Sn = n + sum1;
        return Sn;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(calcSum(n));
    }
}
