package com.interviewQuestion_DSA_Java.String_3.leetCode.count;

public class character_count {
    public static void main(String[] args) {
        String str2 = "Rishi singh";
        int count = countCharactersWithoutSpaces(str2);
        System.out.println(STR."Total characters (excluding spaces): \{count}");

        System.out.println(str2.length());

        String[] str = "Rishi singh".split("");
        System.out.println(str.length);
    }

    public static int countCharactersWithoutSpaces(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c != ' ') {
                count++;
            }
        }
        return count;
    }
}
