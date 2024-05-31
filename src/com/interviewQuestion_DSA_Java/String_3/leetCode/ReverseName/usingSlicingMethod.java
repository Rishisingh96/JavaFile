package com.interviewQuestion_DSA_Java.String_3.leetCode.ReverseName;

import java.util.Arrays;
import java.util.Collections;

public class usingSlicingMethod {
   /*Reverse words in a given string using constant space: using the slicing method and join functions:*/
    public static void main(String[] args) {

        String text = "I am Hero";
        String str[] = text.split(" ");
        Collections.reverse(Arrays.asList(str));
        System.out.println(String.join(" ",str));
    }
}
