package com.interviewQuestion_DSA_Java.String_3.leetCode.ReverseName;

public class ReverseName_Deepaksir {

    public static void main(String[] args) {
        String st = "Rishi";
        String rev = "";
            for(int i = st.length()-1; i>=0; i--){
            rev = rev + st.charAt(i);
        }
        System.out.println("Reverse Name : " + rev);
    }
}
