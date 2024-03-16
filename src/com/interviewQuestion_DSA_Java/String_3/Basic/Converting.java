package com.interviewQuestion_DSA_Java.String_3.Basic;

public class Converting {
    public static void main(String[] args) {

        char arr[] = {'j','a','v','a'};
        String s = new String(arr);
        System.out.println(s);


        String s1 = new String(arr,1,3);
        System.out.println(s1);

    }
}
