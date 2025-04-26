package com.Java.loop.ForEachLoop;

public class PrintNumber {
    public static void main(String[] args) {
        // Initialize an array of numbers
        int[] numbers = {10,20,30,40,50,60,70,80,90,100};

        for(int number : numbers){
            // Print each number in the array
            System.out.println("Number: " + number);
            if(number>5 && number<40){
                System.out.println("Selected number: " + number);
            }
        }
    }
}
