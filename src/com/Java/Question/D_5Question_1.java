package com.Java.Question;
import java.util.Scanner;
public class D_5Question_1 {
    public static void main(String args[]) {
        /*/ 1:  First 10 Natural number
        Scanner c = new Scanner(System.in);
            int i = 0, x;
            int j = 2;
            x = c.nextInt();
            do {
                System.out.println(j);
                j = j + 2;
                i++;
    //            System.out.println("%d".j);
            } while (i < x);
         */

    /*/ 2: Factorial of Number using for loop
        int x,fact = 1;
        Scanner c = new Scanner(System.in);
    x = c.nextInt();

    for (int i = 0; i>=x; i--){
        fact = fact * x;
        x = x-1;
    }
        System.out.println(fact);
    // 3 : Factorial of number using While loop
        while(x>0){
            fact = fact*x;
            x = x-1;
        }
        System.out.println(fact);
     */

        // 4: The following program will add number unitil the use enter zero.
//        int n,sum = 0;
//        for(int i = 0; i<=n; i++){
        /*
        int n ,  sum =0;
        Scanner x = new Scanner(System.in);
        do {
            System.out.print("Enter you number: ");
        n = x.nextInt();
        sum = sum +n;
    }while(n!= 0);
        System.out.println("Total sum is = " + sum);
        */
        // 5 : Fibonacci series
       /*
        int N , i, a = 1, b = 0, c;  // or a = -1 , b = 1   r

        int x;
        Scanner g = new Scanner(System.in);
        N = g.nextInt();
        for( i =1;i<=N; i++){
            c = a+b;
            System.out.println(c);
            a = b;
            b = c;
            */
/* Dry run a -1 and b 1 ,c = -1+1 = 0*/

        //Array number print
    //    int i;
        int [] marks = new int[5];
        Scanner x = new Scanner(System.in);
        int  a= x.nextInt();
        System.out.println(a);
        System.out.println(marks[5]);

       // System.out.println(marks[5]);
//        for(i = 0; i<=marks[4]; i++){
//            System.out.println("Enter your number ");
//            System.out.println(marks[i]);
//        }
        }
        }

