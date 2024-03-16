package com.interviewQuestion_DSA_Java.String_3.Basic;

public class Compare {
    public static boolean equals(String str,String val){

        if (str.equals(val))
            return true;
        else return false;
    }
    public static void main(String[] args) {
        //	String Compare by equals() Method in Java
        String str = "Rishi singh";
        String val = "Rishi singh";
        System.out.println(equals(str,val));

     /*   String s1 = "Cricket";
        String s2 = "Cricket";
        String s3 = new String("Cricket");
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
*/


        //string constant pool. SCP
        String s1 = new String("Football");
        String s2 = new String("Football");

        String s3 = "Football";
        String s4 = "Football";
        System.out.println(s1 == s2); // false
        System.out.println(s1 == s3); // false
        System.out.println(s1 == s4); // false
        System.out.println(s3 == s4); // true


    }
}
