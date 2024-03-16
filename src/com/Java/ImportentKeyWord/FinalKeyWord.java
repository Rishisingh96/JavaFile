package com.Java.ImportentKeyWord;

public class FinalKeyWord {
    public static void main(String[] args) {
        final int a =10;// we can not change class and method and not extend
       // a = a+20;  // error  - cannot assign a value to final variable a
        //System.out.println(a);

        final StringBuffer sb = new StringBuffer("Rishi singh");
       // sb=sb.append("java");   //Error = cannot assign a value to final variable sb
       sb.append("java");   //Error = cannot assign a value to final variable sb
        System.out.println(sb);

    }
}
