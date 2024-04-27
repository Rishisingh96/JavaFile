package com.interviewQuestion_DSA_Java.Recursion_8;

public class P_8_last_occurrence {
    public static int lastOccurrence(int arr[], int key, int i){
       if(i == arr.length){
           return -1;
       }

        int isFound = lastOccurrence(arr,key,i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {8,3,6,5,7,4,7,9,5};
        System.out.println(lastOccurrence(arr,5,0));
    }
}
/*Let's go through the example array [8, 3, 6, 5, 7, 4, 7, 9, 5] and search for the last occurrence of the key 5 using the lastOccurrence method:

Initially, i is 0, which represents the index of the first element in the array.
The method is recursively called with i incremented by 1 each time until i reaches the length of the array.
When i is 8, which is equal to the length of the array, the base case is triggered, and -1 is returned because the key hasn't been found.
During the recursion, if the key is found later in the array (isFound is -1) and the current element matches the key, the current index is returned.
As we unwind the recursion, the method returns the index of the last occurrence of the key 5.
In this example, the output of System.out.println(lastOccurrence(arr, 5, 0)); will be 8, which is the index of the last occurrence of 5 in the array.*/