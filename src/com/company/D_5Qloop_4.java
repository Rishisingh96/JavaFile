package com.company;

import java.util.Scanner;

public class D_5Qloop_4 {
    public static void main(String arg[]) {


        // Selecting a loop
        // Jumps in loop
//    Break statement

        /*
        Scanner x = new Scanner(System.in);
        int a =10;
        if (a >20) {
            System.out.println("1");
        }
        else if(a > 30){
            System.out.println("2");

        }
//        break;
        else if(a>5){
            System.out.println("3");
        }
        else if (a>6) {
            System.out.println("4");
        }
        else{

            System.out.println(" NOt match");
        }
*/
/*
        int i;
        for(i=0; i<10 ; i++){
            System.out.println(i);
            if(i == 5){
                break;
            }
        }
        */


//    go to statement
//        1 - Forward jump                    upar se niche
//        2 - Backward jump                   niche se upar
        /*
        int i = 2;
        while (1) {
            System.out.println("%d\t" + i);
            i = i + 2;
            if (i >= 20) {
            goto outside;
            }
        }
        outside:
        System.out.println("Over\n");
        */
        /*
        Scanner y = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the value of a and b");
        a = y.nextInt();
        b = y.nextInt();
        if(a>b){
            goto out_1;
        }
        else{
            goto out_2;
        }
        out_1 :
        System.out.println("Largest is = %d "+a);
        out_2 :
        System.out.println("Largest is = %d"+b);

        Java does not support goto Statement because it provides a way to branch in an arbitrary and
        **/

//  The continue Statement
        //        int i;
        for (int i = 1; i <= 20; i++) {
            if (i % 5 == 0) {
                continue;
            }
            System.out.println(i);
        }

//    exit() Statement
/*
        System.out.println("C program is old language.");
        exit(0);
        System.out.println(" Java is a Object orianted language.");
  */
    }
}

