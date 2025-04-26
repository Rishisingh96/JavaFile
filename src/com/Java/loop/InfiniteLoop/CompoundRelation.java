package com.Java.loop.InfiniteLoop;

public class CompoundRelation {
    public static void main(String[] args) {
        int x = 1, sum = 0;
        // Infinite loop
        for(x = 1; x<20&&sum<20; x++) {
            sum = sum + x;
//            System.out.println("x: " + x + ", sum: " + sum);
        }
        System.out.println("Sum of first 20 numbers is: " + sum);


        /*for(int x = 1; x < 10; x++) {
            System.out.println(x); //  No error.
        }
        System.out.println(x); // Compile time error.
*/
    }
}
