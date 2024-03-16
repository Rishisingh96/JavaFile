package com.interviewQuestion_DSA_Java.String_3.Basic;

public class byDeepaksir {
    public static void main(String[] args) {
        String s1 = new String("Rishi");
        String s2 = new String("Garima");
        String s4 = new String("Rishi");

        String s3 = "rahul";
        String s6 = "rahul";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s6);

        //imutable
        String s = new String("Rishi");
       // s.concat("Java");
        System.out.println(s);

        s = s.concat("Python");
        System.out.println(s);
    }
}
