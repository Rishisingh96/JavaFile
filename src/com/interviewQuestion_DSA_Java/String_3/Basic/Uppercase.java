package com.interviewQuestion_DSA_Java.String_3.Basic;

public class Uppercase {
    public static String toUppercase(String str){
        StringBuilder sb = new StringBuilder("");   // time complexity O(n)

        char ch = Character.toUpperCase(str.charAt(0));  // for taking [0] value of string
            sb.append(ch);
            
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) ==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
       // String str = "hi , my name is rishi singh";
        String str = "hi , my name is RISHI Rishi";
        System.out.println(toUppercase(str));
    }
    
}
