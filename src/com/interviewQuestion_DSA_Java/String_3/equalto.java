package com.interviewQuestion_DSA_Java.String_3;

public class equalto {
    public static void main(String[] args) {
        String s1 = "Rishi";
        String s2 = "Rishi";
        String s3 = new String("Rishi");

        if (s1 == s2) {
            System.out.println("String are equal");
        }
        else{
            System.out.println("String are not equal");
        }
        if (s1 == s3) {
            System.out.println("String are equal");
        }
        else{
            System.out.println("String are not equal");
        }
        if (s1.equals(s3)) {
            System.out.println("String are equal");
        }else{
            System.out.println("String are not equal");
        }

    }
    
}
