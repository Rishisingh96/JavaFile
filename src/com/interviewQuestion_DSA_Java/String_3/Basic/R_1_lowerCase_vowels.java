package com.interviewQuestion_DSA_Java.String_3.Basic;

import java.util.Scanner;

public class R_1_lowerCase_vowels {
    //Question 1 : Count how many times lowercase vowels occurred in a String entered by the
    //user.
    public static void main(String[] args) {
        String str = new Scanner(System.in).next();
        int count = 0;
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' ||ch == 'i' || ch == 'o' ||ch == 'u') {
                count++;
            }
        }
        System.out.println("count of vowels is :" + count);



        ////////////////////////  Question 2
        String strr = "ShradhaDidi";
        String str1 = "ApnaCollege";
        String str2 = "ShradhaDidi";
        System.out.println(strr.equals(str1) + " " + strr.equals(str2));


        ///////////////Question 3
        String strx = "ApnaCollege".replace("l", "");
        System.out.println(strx);
    }
}
