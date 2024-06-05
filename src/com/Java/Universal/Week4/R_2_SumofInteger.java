package com.Java.Universal.Week4;

import java.util.Arrays;

/*
2. Input data exactly in the following format and print sum of all integer values.
“67,89,23,67,12,55,66”(Hint: use String class split() and Integer class parseInt()
method)
*/
public class R_2_SumofInteger {
    public static void main(String[] args) {
        String string = "67,89,23,67,12,55,66";
        String str[] = string.split(",");
        int sum = 0,sumvalue;
        for(String stringcode : str){
            sumvalue = Integer.parseInt(stringcode);
            sum = sum + sumvalue;
            // System.out.println(stringcode);
        }
        System.out.println("Sum of String = " + sum);
    }
}
