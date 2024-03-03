package com.Java.Basic;

public class R_4_Unary_Operator {
    public static void main(String[] args) {

        // Increment Operator (++) in Java
        //=============================================
        //	Pre-increment Operator (Prefix) in Java
        //   int x = 2;
        //  int y = ++x;
        //System.out.println("x = " + x + ", " +" y = "+ y);
        //  System.out.println( "y = "+ y);
        // System.out.println("x = "+ x );

    //================================================
        //	Post increment Operator (Postfix) in Java
        /*int x = 2;
        int y = x++;
        System.out.println("x = " +x+ ", " +"y = " +y);
        System.out.println("x = " +x);
        System.out.println("y = " +y);*/
//=====================================================================
        /*int x = 5;
        x = -5;
        System.out.println(x);
*/
        //=====================================================================
//Program code 4:
       /* int i = 0;
        System.out.println(i); // Output 0
        System.out.println(++i); // Output 1, first increment the value of i and then displays it as 1.

        System.out.println(i); // Output 1, displays the value of i because i is already incremented, i.e. 1 at right-hand side.
        System.out.println(i++); // Output 1, first displays the value of i as 1 and then increment it.
        System.out.println(i); // Output 2, displays the incremented value of i, i.e. 2.
*/

        //=====================================================================
      //	Program code 5:
       /* int x = 50;
        int y = 100;   //	b = y;    y = ( y + 1) + 1; - 102
        int z = 200;
        int a, b, c;
        a = ++x;
        b = y++;
        c = x + y++ + ++z;

        System.out.println("x = " +x);   //x = x + 1;
        System.out.println("y = " +y);
        System.out.println("z = " +z);
        System.out.println("a = " +a);  //  a = x;
        System.out.println("b = " +b);
        System.out.println("c = " +c);*/
        /*
        output
        x = 51
y = 102
z = 201
a = 51
b = 100
c = 353*/
//=====================================================================
        //	Program code 6: 
      /*  int x = 10;
        int m = ++x * x++;
        System.out.println("m = " +m);*/
/*
	1. In the above program, the value of variable x is 10. When ++x is executed, the operator will increment the value of x by 1, and then it will assign the value of x as 11.
	2. When x++ is executed, the value of x will not be incremented in the statement because this is post incrementation. Hence, the value of x will stay the same, i.e. 11. Thus, the output will be 11 * 11 = 121.

*/
//=====================================================================
        //Program code 7:
        /*int x = 20;
        int y = ++x * 10 / x++ + ++x;
        System.out.println("x = " +x);
        System.out.println("y = " +y);*/

        /*
        	This question is more complicated than the previous example. So, let’s understand the explanation of the above program.
	1. When ++x will be executed in the numerator of expression, first, value’s x is incremented by 1 and then returned to the expression as 21, which is multiplied by 10.
	So, the operation will occur like this: int y = 21 * 10 / x++ + ++x; // x assigned value of 21.
	2. Next, when x++ in the denominator of expression will be executed, the value of x is again incremented by 1 but the original value 21 of x will use in the expression because it is post-increment.
	So, the next operation will be like this: int y = 21 * 10 / 21 + ++x; // x assigned value of 21.
	3. The final assignment of x increments the value of x by 1 because it is pre-increment. So, the value of x is now 23 because, after post-increment, the value of x returned as 22 to the ++x.
	We can simplify this: int y = 21 * 10 / 21 + 23; // x assigned value of 23.
	4. Finally, we can easily evaluate multiply and division from left to right and perform simple addition. Thus, the final value of x will be printed as 23, and the value of y is 33.
        */

 //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 //	Decrement Operator (- -) in Java
        //=====================================================================
        //Pre-decrement Operator in Java
        /*int x = 10;
        int y = --x;
        System.out.println("x is " +x+ ", y is "+y);
*/
        //=====================================================================
        //	Post-decrement Operator in Java
        /*int a = 1;
        System.out.println(a); // Output 1
        System.out.println(--a); // Output 0

        System.out.println(a); // Output 0
        System.out.println(a--); // Output 0
        System.out.println(a); // Output -1  0-1*/

        //=====================================================================
//        Question
        //Program code 10:
        /*int a = 1;
        ++a;

        int b = a++;
        a--;

        int c= --a;
        int x = a * 10 / (b - c);

        System.out.println("a = " +a);
        System.out.println("x = " +x);*/


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
        //==========================================================

     /*   // Create a Scanner class to accept input from the user.
        Scanner sc = new Scanner(System.in);
        // Prompt the user to input year.
        System.out.println("Enter a year: ");

        int year = sc.nextInt();
        int check4 = year % 4 == 0 ? 1 : 0;
        int check100 = year % 100 == 0 ? -1: 0;
        int check400 = year % 400 == 0 ? 1 : 0;
        int total = check4 + check100 + check400;
// Creating strings.
        reverse_of_number s = "Leap year";
        reverse_of_number str = "Not leap year";
        reverse_of_number leapYear = total == 1 ? s : str;
        System.out.println(leapYear);*/
/*
* 	In the preceding example program, we have used the following logic to test leap year. They are as follows:
	1. If the entered year is divisible by 4, add 1.
	2. If the entered year is divisible by 100, subtract 1.
	3. If the entered year is divisible by 400, add 1.
	4. If the total is 1, the year is a leap year, otherwise not a leap year.
	The general rule to check a leap year is that if a year is divisible by 4, and it is not divisible by 100, unless it is also divisible by 400.
For example, the years 1900 and 2100 are divisible by 100, but not divisible by 400. Therefore, they are not leap year. However, the year 2000 is a leap year.
* */
//============================================
        //Program 2
      /*  // Create a Scanner class to accept input from the user.
        Scanner sc = new Scanner(System.in);
// Prompt the user to input age for voting.
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        reverse_of_number str = "You are eligible to vote";
        reverse_of_number str2 = "You are not eligible to vote";
        reverse_of_number eligible = (age >= 18) ? str : str2;
        System.out.println(eligible);*/

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

        int x = 2;
        int y = 4;
        int z = x++/2 == y-- % 3 ? x : y;
        System.out.println(z);


    }
}
