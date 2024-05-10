package com.interviewQuestion_DSA_Java.String_3.leetCode;

public class Palendrom {
    public static void main(String[] args) {
        String st = "madam";
        String rev = "";
        for(int i = st.length()-1; i>=0; i--){
            rev = rev + st.charAt(i);
        }
        System.out.println("Reverse Name : " + rev);

        if(st.equals(rev)){
            System.out.println("palindrome ");
        }
        else {
            System.out.println("Not palindrome");
        }
    }
}
