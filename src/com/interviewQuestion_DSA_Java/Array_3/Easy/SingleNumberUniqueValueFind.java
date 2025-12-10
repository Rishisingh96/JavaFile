package com.interviewQuestion_DSA_Java.Array_3.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

// leetCode problem 136
public class SingleNumberUniqueValueFind {

    // Using ArrayList
    public int singleNumber(ArrayList<Integer> nums) {
        int ans = 0;
        for (int val : nums) {
            ans ^= val;
        }
        return ans;
    }

    // Using Vector
    public int singleNumber(Vector<Integer> nums) {
        int ans = 0;
        for (int val : nums) {
            ans = ans ^ val;
        }
        return ans;
    }

    public static void main(String[] args) {
        // Using ArrayList
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4, 1, 2, 1, 2));

        // Using Vector
        Vector<Integer> vector = new Vector<>(Arrays.asList(4, 1, 2, 1, 2));

        SingleNumberUniqueValueFind obj = new SingleNumberUniqueValueFind();

        int result1 = obj.singleNumber(list);
        int result2 = obj.singleNumber(vector);

        System.out.println(STR."Unique number using ArrayList: \{result1}");
        System.out.println("Unique number using Vector: " + result2);
    }
}
