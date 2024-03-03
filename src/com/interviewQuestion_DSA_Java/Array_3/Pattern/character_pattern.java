package com.interviewQuestion_DSA_Java.Array_3.Pattern;

public class character_pattern {
    public static void main(String[] args){
        int n =4;
        char ch ='A';
        for(int i=0; i<n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(ch);
                ch++;

            }
            System.out.println();
        }
    }
}
