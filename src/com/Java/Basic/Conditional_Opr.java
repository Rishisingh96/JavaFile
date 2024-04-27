package com.Java.Basic;

import java.util.Scanner;

public class Conditional_Opr {
    public static void main(String[] args) {
        // Create a Scanner class to accept input from the user.
        Scanner sc = new Scanner(System.in);
// Prompt the user to input age for voting.
       /* System.out.println("Enter your age: ");
        int age = sc.nextInt();

        String str = "You are eligible to vote";
        String str2 = "You are not eligible to vote";
        String eligible = (age >= 18) ? str : str2;
        System.out.println(eligible);*/

        // Create a Scanner class to accept input from the user.
        Scanner sc1 = new Scanner(System.in);
        // Prompt the user to input year.
        System.out.println("Enter a year: ");

        int year = sc1.nextInt();
        int check4 = year % 4 == 0 ? 1 : 0;
        int check100 = year % 100 == 0 ? -1: 0;
        int check400 = year % 400 == 0 ? 1 : 0;
        int total = check4 + check100 + check400;
// Creating strings.
        String s = "Leap year";
        String str = "Not leap year";
        String leapYear = total == 1 ? s : str;
        System.out.println(leapYear);

        //============================================
//        Try It Yourself

//        Program code 4:

      /*  int x = 20;
        int y = 20;
        ++x;
        y--;
        int z = x < y ? x : y;
        System.out.println(z);
*/
        //	Program code 5:
//
       /* int x = 2;
        int y = 4;
        int z = ++x < y-- - 1 ? x : y;
        System.out.println(z);
//*/
//        //	Program code 6:
//
//        int x = 2;
//        int y = 4;
//        int z = x++/2 == y-- % 3 ? x : y;
//        System.out.println(z);

        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//        Conditional Operator in Java | Ternary, Example
/*	Syntax:
	variable = exp1 ? exp2 : exp3;
       where exp1, exp2, and exp3 are expressions.
	Conditional Operator ? : works as follows:
*/
        /*int a = 40;
        int b = 30;
        int x = (a > b) ? a : b;
        System.out.println(x);*/

/*	if(a > b)
    {
    x = a;
    }
    else {
    x = b;
 }
*/
    }
}
