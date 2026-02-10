package com.interviewQuestion_DSA_Java.Array_3.array2D;

public class WaveForm {
    static void main() {
        int matrix[][] = {
                {3,6,4,2},
                {7,8,11,5},
                {9,3,2,1},
                {17,8,5,9}
        };

        //columns => even( Up - Down )
        //columns => odd ( down - UP )
        int row = matrix.length;
        int col = matrix[0].length;

        for(int j = 0; j < col; j++){
            if(j % 2 == 0){
                // top to bottom (rows increasing)
                for(int i = 0; i < row; i++){
                    System.out.print(matrix[i][j] + " ");
                }
            } else {
                // bottom to top (rows decreasing)
                for(int i = row - 1; i >= 0; i--){
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }

    }
}
