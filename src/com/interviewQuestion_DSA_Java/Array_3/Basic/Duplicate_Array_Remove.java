package com.interviewQuestion_DSA_Java.Array_3.Basic;

public class Duplicate_Array_Remove {

    public static void main(String[] args) {
//        int arr[] = {21,35,35,47,47,56,68,25,21};
        int arr[] = {21,35,35,47,47,56,68};
        int j=0;
        for(int i=1; i<arr.length; i++) {
            if(arr[i] != arr[j]){
                j++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        for(int i = 0; i<=j; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
/*Let's dry run the code step by step using the given input array {21, 35, 35, 47, 47, 56, 68}.

Initial values:

arr = {21, 35, 35, 47, 47, 56, 68}
j = 0
Loop 1 (i=1):

arr[i] = 35, arr[j] = 21
arr[i] != arr[j], so j++ (j becomes 1)
temp = arr[j] = arr[1] = 35, no swap needed as arr[i] and arr[j] are the same.
Array after Loop 1: {21, 35, 35, 47, 47, 56, 68}

Loop 2 (i=2):

arr[i] = 35, arr[j] = 35
arr[i] == arr[j], so no changes made, just move to the next iteration.
Array after Loop 2: {21, 35, 35, 47, 47, 56, 68}

Loop 3 (i=3):

arr[i] = 47, arr[j] = 35
arr[i] != arr[j], so j++ (j becomes 2)
temp = arr[j] = arr[2] = 35, swap arr[i] and arr[j]: arr[3] and arr[2].
Array after swap: {21, 35, 47, 35, 47, 56, 68}

Loop 4 (i=4):

arr[i] = 47, arr[j] = 47
arr[i] == arr[j], so no changes made, just move to the next iteration.
Array after Loop 4: {21, 35, 47, 35, 47, 56, 68}

Loop 5 (i=5):

arr[i] = 56, arr[j] = 47
arr[i] != arr[j], so j++ (j becomes 3)
temp = arr[j] = arr[3] = 35, swap arr[i] and arr[j]: arr[5] and arr[3].
Array after swap: {21, 35, 47, 56, 47, 35, 68}

Loop 6 (i=6):

arr[i] = 68, arr[j] = 56
arr[i] != arr[j], so j++ (j becomes 4)
temp = arr[j] = arr[4] = 47, swap arr[i] and arr[j]: arr[6] and arr[4].
Array after swap: {21, 35, 47, 56, 68, 35, 47}

Resulting unique elements: arr = {21, 35, 47, 56, 68}

Final values:

j = 4, so we print arr[0] to arr[4].
Output:

Copy
Edit
21
35
47
56
68
The code successfully removes duplicates and prints the unique elements in the array.
*/