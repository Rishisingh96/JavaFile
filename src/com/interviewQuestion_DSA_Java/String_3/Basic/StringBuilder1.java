package com.interviewQuestion_DSA_Java.String_3.Basic;

public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char ch ='a'; ch<='z'; ch++){
            sb.append(ch);
        } // abcdfghijklmnopqrst
        System.out.println(sb.length());
    } 
}
