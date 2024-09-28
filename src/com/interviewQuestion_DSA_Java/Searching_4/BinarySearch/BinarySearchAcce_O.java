package com.interviewQuestion_DSA_Java.Searching_4.BinarySearch;

public class BinarySearchAcce_O {
    public static void main(String[] args) {
        int[] arr ={-12,-10,-5,0,2,4,8,10,18,30,55,100};
        int target = 18;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
//    return the index
    //return -1 if it does not exist
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            //find the middle element
//            int mid = (start + end)/2;  // might be possible that (start+end) ex
            int mid = start + (end - start)/2;
            if(target<arr[mid]){
                end = mid-1;
            } else if (target > arr[mid]) {
                start = mid+1;
            }else{
                //ans found
                return mid;
            }
        }
        return -1;
    }
}
