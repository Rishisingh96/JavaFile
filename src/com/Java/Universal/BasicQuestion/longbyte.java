package com.Java.Universal.BasicQuestion;

public class longbyte {
    public static void main(String[] args) {
        long x = (long) 200000.255;
        System.out.println(x);  //200000

        short num = 12_9_10;
        System.out.println(num);

//        byte num1 = 129;   //java: incompatible types: possible lossy conversion from int to byte
//        System.out.println(num1);  //	Compile-time error: Type mismatch: cannot convert from int to byte
//This error occurs because the value is out of the range of byte type. The range of byte is -128 to +127.



        double d1 = 5.50f;
        double d2 = 5.0;
        float f1 = 10f;
        //float f2 = 10.00; // Corrected: Added 'f' suffix to indicate it's a float literal

        System.out.println("Value of d1: " + d1);
        System.out.println("Value of d2: " + d2);
        System.out.println("Value of d2: " + f1);
    //    System.out.println("Value of d2: " + f2);
    }
}
