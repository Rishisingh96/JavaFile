package com.Java.Question;

public class D_5Q_ch7_3 {
    public static void main(String arg[]){

        /*Q 1 : Multiplication
        int n;
        System.out.print("Enter your number that you want to print tabla :  ");
        Scanner x = new Scanner(System.in);
        n = x.nextInt();
        for(int i =1; i <=10; i++){
            System.out.format("%d X %d = %d\n", n,i,n*i);
        }

        /*  Q2 :
        *
        * *
        *  *  *
        *  *  *  *
        int n;
        Scanner c = new Scanner(System.in);
        System.out.println("Enter your number:");
        n = c.nextInt();
        for(int i =1 ; i<=n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print("*\t");
            }
            System.out.println(" ");
        }

        int j;
        for(j=1; j<=6; j++){
            System.out.print("*");
        }
        System.out.println( "\n");
        */

        int i,j,k;
        for(i = 1; i<=5;i++){
            for(j=1; i<=9;j++){
                if(j>=6-i && j<=4+i ){
                    System.out.print("*\t");
                }
                System.out.println("\n");
            }
        }
    }
}
