package com.interviewQuestion_DSA_Java.Searching_4;

/**
 * Linear_Search
 */
public class Linear_Search_indexF {
        public static int linearSearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i]== key){
                return i;
            }
    }
    return -1;
}
    public static void main(String[] args) {
        int numbers[] = {4,7,6,8,11,10,14,18};
        int key = 8;

        int index = linearSearch(numbers, key);
        if(index == -1){
            System.out.println("NOT found");
        }
        else{
            System.out.println("key is at index " + index);
        }
    }
}