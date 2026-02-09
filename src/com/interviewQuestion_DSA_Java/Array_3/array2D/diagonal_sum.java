package com.interviewQuestion_DSA_Java.Array_3.array2D;

public class diagonal_sum {
    public static int digonalSum(int matrix[][]) {
        int sum = 0;
        for(int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                if(i == j){
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    private static void printsumDigonal(int[][] matrix) {
        int first = 0, second = 0;
        //first diagonal sum
        int i=0;
        while(i<matrix.length){
            first += matrix[i][i];
            i++;
        }


        //second diagonal sum
        i=0;
        int j = matrix[0].length-1;
        while (j>=0){
            second += matrix[i][j];
            i++;
            j--;
        }
        System.out.println("First diagonal sum: " + first);
        System.out.println("Second diagonal sum: " + second);
    }
    public static void main (String[]args){
            int matrix[][] = {  {1, 2, 3, 4},
                                {5, 6, 7, 8},
                                {9, 10, 11, 12},
                                {13, 14, 15, 16}};
//            System.out.println(digonalSum(matrix));
            printsumDigonal(matrix);
        }
}
