package com.interviewQuestion_DSA_Java.String_3.leetCode.count;

public class one_charectorcount {
    public static void main(String[] args) {
        String str2 = "Rishi singh";
        char[] charArray1 = str2.toCharArray();
//        System.out.println(charArray1);
        int count = 0;

        for(char c : charArray1){
            if(c == 'i'){
                count++;
            }
        }
        System.out.println("The letter 'i' appears " + count + " times.");
    }
}
