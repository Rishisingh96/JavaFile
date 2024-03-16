package com.interviewQuestion_DSA_Java.Bit_Magic_15;

public class OddEven {
    public static void oddEvne1(int n){
        int bitMask = 1;
        if((n & bitMask)==0){
            //even number
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }
    public static void main(String[] args) {
        oddEvne1(3);
        oddEvne1(11);
        oddEvne1(4);
    }

}
