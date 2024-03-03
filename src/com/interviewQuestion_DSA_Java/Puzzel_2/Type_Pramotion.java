package com.interviewQuestion_DSA_Java.Puzzel_2;//package com.shd;

public class Type_Pramotion {
    public static void main(String arg[]){
       /* char a = 'a';  //97
        char b = 'b';  //98
        System.out.println((int)(b));
        System.out.println((int)(a));
        System.out.println(b-a);  // 1 */

        //
        //Type 1
   /*     short a = 5;
    byte b = 25;
    char c = 'c';
    byte bt = (byte)(a+b+c);
        System.out.println((byte) (c)); // 99
        System.out.println(bt);
        //-127
        */
        // Type 2
        int a = 10;
        float b = 20.25f;
        long c = 25;
        double d = 30;
        double ans = a+b+c+d;
        System.out.println(ans); //  85.25
        }
}

