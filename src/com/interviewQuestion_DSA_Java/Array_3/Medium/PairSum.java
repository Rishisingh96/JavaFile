package com.interviewQuestion_DSA_Java.Array_3.Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class PairSum {

    // Brute Force method with index info
    public ArrayList<String> pairSum(ArrayList<Integer> arr, int target) {
        ArrayList<String> ans = new ArrayList<>();
        int n = arr.size();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr.get(i) + arr.get(j) == target) {
                    ans.add("Pair: (" + arr.get(i) + ", " + arr.get(j) + ") " + "" +
                            "→ Index: (" + i + ", " + j + ")");
                    // you can return directly if only one pair needed
                    return ans;
                }
            }
        }

        return ans; // empty if no pair found
    }

    // Brute Force method with index info
    public ArrayList<String> pairSumOptimal(ArrayList<Integer> arr, int target) {
        ArrayList<String> ans = new ArrayList<>();
        int n = arr.size();

        int i=0, j=n-1;
        while(i<j){
            int sum = arr.get(i) + arr.get(j);
            if(sum >target){
                j--;
            } else if (sum < target) {
                i++;
            } else {
//                ans.add("Pair: (" + arr.get(i) + ", " + arr.get(j) + ") " + "" +
//                        "→ Index: (" + i + ", " + j + ")");
                ans.add("Pair: "+arr.get(i)+", "+arr.get(j));
                ans.add("Index: "+i+", "+j);
                return ans; // you can return directly if only one pair needed
            }

        }

        return ans; // empty if no pair found
    }

    public static void main(String[] args) {
        ArrayList<Integer> value = new ArrayList<>(Arrays.asList(2, 7, 11, 15));
        int target = 26;

        PairSum obj = new PairSum();
//        ArrayList<String> res = obj.pairSum(value, target);
        ArrayList<String> ans = obj.pairSumOptimal(value, target);


//        if (res.isEmpty()) {
//            System.out.println("No pair found with sum " + target);
//        } else {
//            for (String pair : res) {
//                System.out.println(pair);
//            }
//        }

        if (ans.isEmpty()) {
            System.out.println("No pair found with sum " + target);
        } else {
            for (String pair : ans) {
                System.out.println(pair);
            }
        }
    }
}
