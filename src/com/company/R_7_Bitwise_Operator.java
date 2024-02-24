package com.company;

public class R_7_Bitwise_Operator {
    public static void main(String[] args) {
/*	Operator	Meaning
	1. &	bitwise AND (Binary)
	2. |	bitwise OR (Binary)
	3. ^	bitwise exclusive OR (Binary)
	4. ~	bitwise NOT (Unary)
	5. <<	shift left
	6. >>	shift right
	7. >>>	unsigned right shift
*/
        //===================================
//        	Bitwise AND Operator (&) in Java

        /*int a = 10, b = 11;
        System.out.println("(10 & 11): " +(a & b));*/
/*	From the truth table shown in figure, if both compared input bits are 1, we get output 1. Otherwise, we get output 0.
From the truth table, On multiplying the individual bits of x and y, we get x & y = 0 0 0 0 1 0 1 0. It is nothing but 10 in decimal form. Let’s take an example program based on it.
*/
//==================================================================
//        Bitwise OR Operator ( | ) in Java
        //	Program code 2:
       /* int a = 20, b = 10;
        System.out.println("(20 | 10): " +(a | b));
*/
        //==================================================================
//	Bitwise Exclusive OR (XOR) Operator (^)

       /* int a = 20, b = 10;
        System.out.println("(20 ^ 10): " +(a ^ b));
*/
        ////==================================================================
        ////   Bitwise NOT operator (~)
        int a = 2, b = 10;
        System.out.println("(2 & 10): " +(a & b));
        System.out.println("(2 | 10): " +(a | b));
        System.out.println("(2 ^ 10): " +(a ^ b));
        System.out.println("~10: " +~b);

    }
}
