package com.interviewQuestion_DSA_Java.Array_3.array2D;

public class SimpleMatrixPrint {

    // Full matrix print
    public static void matrixPrint(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Row-wise print
    public static void rowPrint(int[][] matrix){
        System.out.println("Rows:");
        for(int i=0; i<matrix.length; i++){
            System.out.print("Row " + i + ": ");
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Column-wise print
    public static void columnsPrint(int[][] matrix){
        System.out.println("Columns:");
        for(int j=0; j<matrix[0].length; j++){
            System.out.print("Column " + j + ": ");
            for(int i=0; i<matrix.length; i++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {
                {2,3,4},
                {5,8,3},
                {8,6,1},
                {9,5,3}
        };

        matrixPrint(matrix);
        rowPrint(matrix);
        columnsPrint(matrix);
    }
}
