package com.interviewQuestion_DSA_Java.Array_3;

import java.util.*;
public class ReverseNumber {
    public static void ReverseNumbers(int numbers[]){   
        int first = 0, last = numbers.length-1 ;
        while (first < last){
            //swap
            int temp = numbers[last]; 
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};

        ReverseNumbers(numbers);       
        for (int i = 0; i < numbers.length; i++){
            System.err.print(numbers[i]+" ");
        }
        System.out.println();
    }
}
