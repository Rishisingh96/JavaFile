package com.Java.OOPs;

public class R_33_Variable_Argument_varArgs {
    /*
    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a,int b, int c){
        return a+b+c;
    }
    static int sum(int a, int b, int c, int d){
        return a+b+c+d;
    }  */

    //  Ninja technic
    /*
    static int sum (int ...arr){   // no fixed argument value not fixed
        int result = 0;
        for(int a:arr){
            result += a;
        }
        return result;
    }    */
    static int sum(int x, int ...arr){
        int  result = 0;
        for(int a : arr){
            result += a;
        }
        return result;
    }
    public static void main(String arg[]){
        System.out.println("Welcome to Varargs Tutorial ");
        System.out.println("The sum of Nothing is "+sum(4));
        System.out.println("The sum of 4 and 5 is :" + sum(4,5));
        System.out.println("The sum of 4 3,and 5 is :"+sum(4 , 3 , 5));
        System.out.println("The sum of 2 , 4, 3 and 5 is :"+sum(2, 4 ,3 ,5));
       System.out.println("The sum of 5 ,6,3,4,5,and 3 is "+sum(5, 6, 3,4,5,3));
//        System.out.println("The sum of 4 and 5 is "+sum());

    }
}
