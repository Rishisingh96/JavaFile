package com.interviewQuestion_DSA_Java.Stack_12;

import java.util.Stack;

public class ReverseString {

    public static String reverseStringC(String str){
        Stack<Character> s = new Stack<>();
        int index = 0;
        while (index < str.length()){
            s.push(str.charAt(index));
            index++;
        }

        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()){
            char current = s.pop();
            result.append(current);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str = "Rishi singh";
        String result = reverseStringC(str);
        System.out.println(result);

    }
}
