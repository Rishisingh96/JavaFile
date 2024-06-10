package com.Java.Exception_and_File_Handling;
import java.util.Scanner;
class R_79_SyntaxErrors{
    public static void main(String[] args) {
        //Syntax Error
    /*
	int a = 10  //Error: we forgot the ';' semicolon so occur expected
	b = 34; // not declare data type , can't find symbol
	System.out.println(a);
	*/
        //Logical Error
        //WAP to print prime number
        System.out.println("2");
        for (int i = 0; i < 5; i++) {
            System.out.println(2 * i + 1);
        }
/*2
    1
    3
    5
    7
    9
	*/

        // Runtime Error
        int n;
        System.out.println("\n\nEnter your number:");
        Scanner x = new Scanner(System.in);
        n=x.nextInt();
        System.out.println(1000/n);
/* 0
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at R_79_SyntaxErrors.main(R_79_SyntaxErrors.java:30) */
    }
}