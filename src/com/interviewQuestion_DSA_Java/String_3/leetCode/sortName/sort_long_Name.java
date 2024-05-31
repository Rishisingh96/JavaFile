package com.interviewQuestion_DSA_Java.String_3.leetCode.sortName;

public class sort_long_Name {
    public static void main(String[] args) {
        String str2 = "Rishi singh kumar jain tyagi";
        String[] words = str2.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (i < words.length - 1) {
                result.append(words[i].charAt(0)).append(" ");
            } else {
                result.append(words[i]);
            }
        }

        System.out.println(result.toString());
    }
}
