package com.interviewQuestion_DSA_Java.Array_3.array2D;

public class Add2Matrix {
    static void main() {
        int matrix1[][] = {  {1, 2, 3},
                                {4, 5, 6},
                                {7, 8, 9}};
        int matrix2[][] = {  {9, 8, 7},
                                {6, 5, 4},
                                {3, 2, 1}};
        int result[][] = new int[3][3];

        // Adding the two matrices
        for(int i=0; i<matrix1.length; i++){
            for (int j=0; j<matrix1[0].length; j++){
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        for(int i=0; i<result.length; i++){
            for (int j=0; j<result[0].length; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
