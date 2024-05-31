package com.interviewQuestion_DSA_Java.String_3.leetCode.ReverseName;

public class ReverseName_Deepaksir {

    public static void main(String[] args) {
        /*String st = "Rishi singh is a Hero";
        String rev = "";
            for(int i = st.length()-1; i>=0; i--){
            rev = rev + st.charAt(i);
        }
        System.out.println("Reverse Name : " + rev);*/



            // I want to print Hero a is singh Rishi
        String s[] = "Rishi singh is a Hero".split(" ");
        String ans = "";
        for(int i = s.length-1; i>=0; i--){
            ans = ans+s[i]+" ";
        }
//        System.out.println(ans.substring(0,ans.length()-1));
        System.out.println(ans);
    }
}
