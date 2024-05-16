package com.interviewQuestion_DSA_Java.Array_3.Universal.MDArray;

import java.util.Scanner;

public class Jagged_Array_Inputuser {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your Row 1");
        int row0 = in.nextInt();

        System.out.println("Enter your Row 2 ");
        int row1 = in.nextInt();

        System.out.println("Enter your Row 3 ");
        int row2 = in.nextInt();


        int arr1[] = new int[row0];
        int arr2[] = new int[row1];
        int arr3[] = new int[row2];

        System.out.println("Enter Your row "+row0);
        for (int i=0; i<row0; i++){
            arr1[i] =in.nextInt();
        }
        System.out.println("Enter Your row "+row1);
        for (int i1=0; i1<row1; i1++){
            arr2[i1] =in.nextInt();
        }
        System.out.println("Enter Your row "+row2);
        for (int i2=0; i2<row2; i2++){
            arr3[i2] = in.nextInt();
        }



        for (int i=0; i<row0; i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println(" ");
        for (int i1=0; i1<row1; i1++){
            System.out.print(arr2[i1] +" ");
        }
        System.out.println(" ");
        for (int i2=0; i2<row2; i2++){
            System.out.print(arr3[i2]+" ");
        }
        System.out.println(" ");

    }
}
