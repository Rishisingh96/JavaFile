package com.interviewQuestion_DSA_Java.Recursion_8;





public class xtoPower_n_print {
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
//        int xn1 = power(x,n-1);
//        int xn = x * xn1;
//        return xn;

        return x * power(x,n-1);
    }
    public static void main(String[] args) {
        System.out.println(power(2,10));
    }
}
