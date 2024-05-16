package com.interviewQuestion_DSA_Java.Array_3.Universal.MDArray;

public class Jagged_Array {
    public static void main(String[] args) {
        int a[][] ={
                {2,4,5,6,8,9},
                {3,5,7,6},
                {3,7},
                {4,9,1,4,6}
        };
        int sum =0;
        for(int column[]: a){
            for(int row : column){
                System.out.print(row + " ");
                sum = sum+row;
            }
            System.out.print(" total is : "+sum +" ");
            System.out.println(" ");
        }
        System.out.println("\ntotal is : "+sum);
        System.out.println("Size of array is :" +a.length);
        System.out.println("Size of array row 1 is :" +a[0].length);
        System.out.println("Size of array row 2 is :" +a[1].length);
        System.out.println("Size of array row 3 is :" +a[2].length);
        System.out.println("Size of array row 4 is :" +a[3].length);

    }
}
