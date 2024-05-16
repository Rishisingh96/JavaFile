package com.interviewQuestion_DSA_Java.Array_3.Universal.MDArray;

import java.util.Scanner;

public class MDArray_input_user {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[3][3];
        System.out.println("Enter your number:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println("\nyour number:");
        for(int i = 0; i< 3; i++){
            for (int j = 0; j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
