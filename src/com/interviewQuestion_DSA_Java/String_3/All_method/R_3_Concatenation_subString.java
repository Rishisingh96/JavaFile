package com.interviewQuestion_DSA_Java.String_3.All_method;

public class R_3_Concatenation_subString {
    public static void main(String[] args) {
        String s1  = "Rishi";
        String s2 = "Java";
        // 2 Ways to add String
        // 1 Way
        System.out.println(s1+s2); //RishiJava
        System.out.println(s1+10);  //Rishi10
        System.out.println(s1+10+20); //Rishi1020
        System.out.println(10+20+s1);  //30Rishi
        System.out.println(10+s1+20);  //10Rishi20
        System.out.println(s1+20/10);  //Rishi2
        System.out.println(s1+20*10);  //Rishi200
      //  System.out.println(s1+10-5); //Operator '-' cannot be applied to 'java.lang.String', 'int'

       //2nd Way concat method
        System.out.println(s1.concat(s2));  //RishiJava

        //join
//        static join(charSquence delimiter, charSquence ..elements);

        System.out.println(String.join(",",s1,s2));  //Rishi,Java
        System.out.println(String.join(",",s1,s2,s2));  //Rishi,Java,Java

        //1 = we must provide delimiter Otherwise he not add // Java
        System.out.println(String.join(s1,s2));  //Java

        //2 =
        System.out.println(String.join(",",s2));  //Java
        System.out.println(String.join("+",s1,s2));  //Java


        System.out.println("\n---------- SUBSEQUENCE---------------------- ");
        String s4 = "Rishi singh";
        System.out.println(s4.substring(3,9));  //hi sin  // return substring
        System.out.println(s4.subSequence(3,9)); //hi sin
        System.out.println(s4.substring(3)); //hi singh
    }
}
