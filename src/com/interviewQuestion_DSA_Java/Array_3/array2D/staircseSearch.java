package com.interviewQuestion_DSA_Java.Array_3.array2D;

public class staircseSearch {
public static boolean staircseSearch1(int matrix[][], int key) {
    int row =0, col = matrix[0].length-1;

    while(row<matrix.length && col>= 0 ){
        if(matrix[row][col] == key){
            System.out.println("found key at(" + row + "," + col + ")");
            return true;

        }
        else if(key < matrix[row][col]){
            col--;
        }
        else{
            row++;
        }
    }
    System.out.println(key +" "+ "key not found!");
    return false;
 }
 public static void main(String[] args) {
    int matrix[][] = { { 1, 2, 3, 4 },
    { 5, 6, 7, 8 },
    { 9, 10, 11, 12 },
    { 13, 14, 15, 16 } };
    // int key = 14;
    int key = 10;
    staircseSearch1(matrix, key);
    // System.out.println(staircseSearch1(matrix));
 }
}
 
