package com.Collection.QuestionInterview;

import java.util.HashSet;

public class Union {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        HashSet<Integer> set = new HashSet<>();
        System.out.println("Union of two arrays:");
//        union(arr1[], arr2[]);


        // Union
        // means all unique elements from both arrays
        for (int i=0; i< arr1.length; i++){
            set.add(arr1[i]);
        }

        for (int i=0; i<arr2.length; i++){
            set.add(arr2[i]);
        }

        System.out.println("Union  = " + set.size());

        //intersection
        // means common elements in both arrays
        HashSet<Integer> intersection = new HashSet<>();
        for(int i=0; i<arr1.length; i++){
            intersection.add(arr1[i]);
        }
        int count = 0;
        for(int i=0; i<arr2.length; i++){
            if(intersection.contains(arr2[i])){
                count++;
                set.remove(arr2[i]);
            }
        }
        System.out.println("Intersection = " + count);

    }
}
