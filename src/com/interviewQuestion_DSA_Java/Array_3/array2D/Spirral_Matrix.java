package com.interviewQuestion_DSA_Java.Array_3.array2D;

public class Spirral_Matrix {
   public static void printSpiral(int matrix[][]){
       int startRow = 0;
       int startCol = 0;
       int endRow = matrix.length-1;
       int endCol = matrix[0].length-1;

       while (startRow <= endRow && startCol <= endCol){

           //top
           for(int j=startCol; j<=endCol ; j++){
               System.out.print(matrix[startRow][j]+" ");
           }

           //right
           for(int i= startRow+1; i<=endRow; i++){
               System.out.print(matrix[i][endCol]+" ");
           }
           //bottom
           for(int j=endCol-1;j>=startCol; j--){
               if(startRow == endRow){
                   break;
               }
               System.out.print(matrix[endRow][j]+" ");

           }
           //left
           for(int i=endRow-1; i>=startRow+1;i--){
               if(startCol == endCol){
                   break;
               }
               System.out.print(matrix[i][startCol]+" ");
           }
           startCol++;
           startRow++;
           endCol--;
           endRow--;
       }
       System.out.println();
   }
   public static void printSpiralBySir(int[][] matrix){
       int row = matrix.length;
       int col = matrix[0].length;

       int top = 0, bottom = row - 1;
       int left = 0, right = col - 1;

       //print top
       // print right
       // print bottom
       // print left
       //==============================================
       while (top <= bottom && left <= right) {

           // print top row
           for (int j = left; j <= right; j++) {
               System.out.print(matrix[top][j] + " ");
           }
           top++;

           // print right column
           for (int i = top; i <= bottom; i++) {
               System.out.print(matrix[i][right] + " ");
           }
           right--;

           // print bottom row
           if (top <= bottom) {
               for (int j = right; j >= left; j--) {
                   System.out.print(matrix[bottom][j] + " ");
               }
               bottom--;
           }

           // print left column
           if (left <= right) {
               for (int i = bottom; i >= top; i--) {
                   System.out.print(matrix[i][left] + " ");
               }
               left++;
           }
       }
   }
    public static void main(String[] args) {
        int matrix[][] =    {{1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16}};
//        printSpiral(matrix);
        printSpiralBySir(matrix);
//         System.out.print(printSpiral(matrix));
    }
}
