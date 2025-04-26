package com.Java.loop.InfiniteLoop;

/*Let’s take an example program based on infinite for loop in Java where we will display the sum of cubes of numbers from 1 to 5.*/

public class SumOfCube {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        //Infinite loop
        for(; ;){
            sum = sum+i*i*i; // i^3 // sum = sum + i^3 //
            i++;
            if(i>=5) break;
        }
        System.out.println("Sum of first 5 cubes is: " + sum);
    }
}
