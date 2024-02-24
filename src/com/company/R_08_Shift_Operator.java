package com.company;

public class R_08_Shift_Operator {
    public static void main(String[] args) {

        //	Signed Right Shift Operator

//        Program code 1:
       /* int x = -10,
                c = 0;
        c = x >> 2;
        System.out.println("x >> 2 = " +c);
*/


//        Unsigned Right Shift Operator
//        Program code 2:

        int x = 10;
        int y = -10;
        System.out.println("x >> 1 = " + (x >> 1));
        System.out.println("x >>> 1 = " + (x >>> 1));
        System.out.println("y >> 2 = " + (y >> 2));
        System.out.println("y >>> 2 = " + (y >>> 2));


    }
}
