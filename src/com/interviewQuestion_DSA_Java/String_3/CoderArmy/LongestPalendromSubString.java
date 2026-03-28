package com.interviewQuestion_DSA_Java.String_3.CoderArmy;

import java.util.Scanner;

    class Solution {
    int max = 0, start =0, end =0;

    public boolean isPalindrome(String s, int i, int j){
         while(i<j){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if(ch1!=ch2)
                return false;
            i++;
            j--;
        }
        return true;
    }

    public String longestPalindrome(String s) {
        int n = s.length();
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(isPalindrome(s,i,j)==true){
                    if((j-i+1)>max){
                        max = j-i+1;
                        start = i;
                        end = j;
                    }
                }
            }
        }
       return s.substring(start, end+1);
    }
}

public class LongestPalendromSubString {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    

    System.out.println("Enter your String:");
    String s = sc.nextLine();

    Solution p = new Solution();
    String result = p.longestPalindrome(s);

    System.out.println("Your largest palindrom is "+ result);
}
}
