package com.Java.Basic;

import java.util.Scanner;

public class R_4_Unary_Operator {
    public static void main(String[] args) {

        // Increment Operator (++) in Java
        //=============================================
        //	Pre-increment Operator (Prefix) in Java
//        int x=5;
//        x++;
      //  ++x;
//        int y= ++x;
//        int z= x++;   //7 6 6 8

//        int y= x++;
//        int z= ++x;
//
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(x++);
//        System.out.println(z);
//        System.out.println(++x);



//           int x = 2;
//           int y = ++x;
//          System.out.println("x = " + x + ", " +" y = "+ y);
//          System.out.println( "y = "+ y);
//         System.out.println("x = "+ x );

    //================================================
        //	Post increment Operator (Postfix) in Java
//        int x = 2;
//        int y = x++;
//        System.out.println("x = " +x+ ", " +"y = " +y);  //Right to left
//        System.out.println("x = " +x);
//        System.out.println("y = " +y);
//==============================Unary minus operator(-)======================
//        int x = 5;
//        x = -5;
//        System.out.println(x);
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
        int a = 1;
        ++a;

        int b = a++;
        a--;  //3  but dec 2
//        System.out.println("a = " +a); //2
        int c= --a;    //2-1 = 1
//        System.out.println("c = "+c); c=1
        int x = a * 10 / (b - c);

        System.out.println("a = " +a);
        System.out.println("x = " +x);
        System.out.println("c = " +c);
        System.out.println("b = " +b);
//Dry run -
        /*Sure, let's dry run your code step by step:

1. `int a = 1;`: You initialize variable `a` with the value `1`.
2. `++a;`: You increment `a` by 1, so now `a` becomes `2`.
3. `int b = a++;`: You assign the current value of `a` (which is `2`) to `b`, and then increment `a`. So after this line, `b` becomes `2`, and `a` becomes `3`.
4. `a--;`: You decrement `a` by 1, so now `a` becomes `2` again.
5. `int c= --a;`: You decrement `a` by 1 and assign the new value to `c`. So `c` becomes `1`, and `a` becomes `1`.
6. `int x = a * 10 / (b - c);`: You calculate the value of `x` using the values of `a`, `b`, and `c`.
   - `a` is `1`.
   - `b` is `2`.
   - `c` is `1`.
   So, `b - c` is `2 - 1 = 1`, and `a * 10 / (b - c)` becomes `1 * 10 / 1 = 10`.

7. `System.out.println("a = " +a);`: You print the value of `a`, which is `1`.
8. `System.out.println("x = " +x);`: You print the value of `x`, which is `10`.

So, the output of the program will be:
```
a = 1
x = 10
```
*/

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


//============================================




    }
}
