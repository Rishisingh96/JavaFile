package com.interviewQuestion_DSA_Java.String_3.Basic;

public class StringConstructors {
    public static void main(String[] args) {
       /* String s2 = "";
        String s3 = new String();
        String s4 = new String("Rishi");  //mutable object create
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);*/

//        StringBuffer
       /* StringBuffer sb = new StringBuffer("Rishi singh");  //immutable object create
        String s6 = new String(sb);
        System.out.println(sb);
        System.out.println(s6);*/

//        StringBuilder
       /* StringBuilder s8 = new StringBuilder("Rishi");
        String s7 = new String(s8);
        System.out.println(s7);*/

//        byte
        /*byte[] b = {101,102,103};
        String s9 = new String(b);
        System.out.println(b);
        System.out.println(s9);*/

//        char
       /* char[] c = {'a','b','c'};
        String sb2 = new String(c);
        System.out.println(sb2);
        System.out.println(c);

        //charArray
        char[] s0 = new char[]{ 'a', 'b', 'c'};

        String s10 = new String("abc");

        System.out.println("s1 :-"+ s0);
        System.out.println("s10 :-" +s10);*/

//4.    String(char chars[ ], int startIndex, int count):
        /*String str = new String(char chars[], int sI,int count);
//        For example:
        char chars[] = { 'w', 'i', 'n', 'd', 'o', 'w', 's'};
        String str = new String(chars, 2, 3);*/

       /* char chars[] = { 'w', 'i', 'n', 'd', 'o', 'w', 's' };
        String s = new String(chars, 0,4);
        System.out.println(s);*/

        char chars[] = { 'F', 'A', 'N' };
        String s1 = new String(chars);

        String s2 = new String(s1);
        System.out.println(s1);
        System.out.println(s2);

    }
}
