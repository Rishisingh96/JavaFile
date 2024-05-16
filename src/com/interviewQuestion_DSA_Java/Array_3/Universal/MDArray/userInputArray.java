package com.interviewQuestion_DSA_Java.Array_3.Universal.MDArray;

import java.util.Scanner;

public class userInputArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Row ");
        int row = in.nextInt();
        System.out.println("Enter your column");
        int clo = in.nextInt();
        int arr[][] = new int[row][clo];
        System.out.println();
        for(int i =0; i<row; i++){
          for (int j=0; j<clo; j++) {
              arr[i][j] = in.nextInt();
          }
        }

        for(int matrix[]: arr){
            for(int ele:matrix){
                System.out.print(ele +" ");
            }
            System.out.println(" ");
        }
    }
}
