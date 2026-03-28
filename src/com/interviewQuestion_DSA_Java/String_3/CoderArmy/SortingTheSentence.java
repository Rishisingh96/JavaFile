package com.interviewQuestion_DSA_Java.String_3.CoderArmy;

public class SortingTheSentence {
    
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        int[] ans = new int[10];
        String temp="";

        int count = 0, intdex =0;

        while (intdex<s.length()) {
            if(s.charAt(intdex)==' '){
                // int pos = temp[temp.length()-1]-'0';
                
            }else{
                temp += s.charAt(intdex);
                intdex++;
            }
        }
    }

}
