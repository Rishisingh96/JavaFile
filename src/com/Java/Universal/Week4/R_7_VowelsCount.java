package com.Java.Universal.Week4;

import java.util.Scanner;

public class R_7_VowelsCount {
    public static void main(String[] args) {
        String string = "Rishi singh How are you";
     //   String sp[] = string.split("");
        /*int count =0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i< string.length(); i++){
            if(vowels.indexOf(string.charAt(i))!=-1){
                count++;
            }
        }
        System.out.println("Number of vowels: ="+count);*/

        //using For-Each loop
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of a person : ");
        String str = scanner.nextLine();

        int count =0;
        String vowels = "aeiouAEIOU";
        char[] charsArray = str.toCharArray();
//        System.out.println(charsArray);
        for(char vov : charsArray){
            if(vowels.indexOf(vov) != -1) {
                count++;
                System.out.print(vov+" ");
            }
        }

        System.out.println("Number of vowels: = "+count);
    }

}
