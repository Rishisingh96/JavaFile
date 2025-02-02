package com.interviewQuestion_DSA_Java.String_3.leetCode.count;

public class SpaceCount {
    public static void main(String[] args) {
//        String x = "I am giving mock @Universal Informatics ";
        String x = "I am giving mock @Universal Informatics ".trim();
        char[] arr = x.toCharArray();
        int count = 0;
//        for (int i=0; i<arr.length; i++) {
//            if(arr[i]==' '){
//                count++;
//            }
//        }

        //use forEach loop
        for (char value : arr ){
            if(value==' '){
                count++;
            }
        }
        System.out.println("Total space :"+ count);
    }
}
