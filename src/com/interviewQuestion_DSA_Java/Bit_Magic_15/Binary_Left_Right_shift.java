package com.interviewQuestion_DSA_Java.Bit_Magic_15;

public class Binary_Left_Right_shift {
    public static void main(String[] args) {
        //Binary Left Shift
        System.out.println(5<<2);

        //right shift operator >>
        System.out.println(6>>1);


        //Notes.md - If int x = -10 then calculate x >> 2 value.
        //The value of x is -10 that is a negative number. So, we will use 2’s
        /*int x = -10,
                c = 0;
        c = x >> 2;
        System.out.println("x >> 2 = " +c);*/

        // Unsigned Right Shift Operator >>>
        int x = 10;
        int y = -10;
        System.out.println("x >> 1 = " + (x >> 1));
        System.out.println("x >>> 1 = " + (x >>> 1));
        System.out.println("y >> 2 = " + (y >> 2));
        System.out.println("y >>> 2 = " + (y >>> 2));

    }
}
