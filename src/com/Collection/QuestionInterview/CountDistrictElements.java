package com.Collection.QuestionInterview;

import java.util.HashSet;

public class CountDistrictElements {
    public static void main(String[] args) {
        int num[] = {4,8,3,7,3,5,6,2,1,9,4,8,3,7,3,5,6,2,1,9};

        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<num.length; i++) {
            set.add(num[i]);
        }
        System.out.println("Number of District Elements: " + set.size());

        // Displaying the distinct elements
        System.out.println("Distinct Elements: " + set);

        // Displaying the original array
        System.out.print("Original Array: ");
        for(int i=0; i<num.length; i++) {
            System.out.print(num[i] + " ");
        }

        System.out.println("ans = " + set.size());
        System.out.println("\n----------------------------------------");

        // Displaying the distinct elements in the original order
        System.out.println("\nDistinct Elements in Original Order: ");
        for(int i=0; i<num.length; i++) {
            if(set.contains(num[i])) {
                System.out.print(num[i] + " ");
                set.remove(num[i]); // Remove to avoid duplicates in output
            }
        }
    }
}
