package com.interviewQuestion_DSA_Java.Array_3.Universal.MDArray;

public class MDArray_forEach {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                            { 5, 6, 7, 8 },
                            { 9, 10, 11, 12 },
                            { 13, 14, 15, 16 } };
        System.out.println("Your Matrix is :");
        for(int[] row : matrix){
            for (int ele : row){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
        System.out.println("Size of array is :" +matrix.length);
        System.out.println("Size of array row 1 is :" +matrix[0].length);
        System.out.println("Size of array row 2 is :" +matrix[1].length);
        System.out.println("Size of array row 3 is :" +matrix[2].length);
        System.out.println("Size of array row 4 is :" +matrix[3].length);


    }
}
