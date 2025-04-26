package com.Java.loop.NestedForLoop;

public class TriangleOfNumber {
    public static void main(String[] args) {
        System.out.println("Displaying triangle of numbers:");
        //Outer loop
        for(int i=1; i<=5; i++){
            //Inner loop
            for (int j = 1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
}
