package com.Collection.map.HashMapCode;

import java.util.HashMap;
import java.util.Set;

public class MajorityElementFind {
    /**
     * This method finds the majority element in an array.
     * A majority element is an element that appears more than n/2 times in the array.
     * It uses a HashMap to count the occurrences of each element.
     *
     * @param nums The input array of integers
     * @return The majority element if it exists, otherwise -1
     */

    public static void main(String[] args) {
        int arr[] = {1,3,2,5,1,3,1,5,1};
        HashMap<Integer, Integer> map = new HashMap<>();

        // Optimized way to find majority element
        for(int i =0; i<arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i],0) + 1);
        }
            for (Integer key : map.keySet()) {
                if (map.get(key) > arr.length / 3) {
                    System.out.println("Majority Element: " + key);
                    return;
                }
            }
        }

        //Not optimized way to find majority element

       /* for(int i =0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {
            if(map.get(key) > arr.length/3){
                System.out.println("Majority Element: " + key);
                return;
            }
        }*/

}
