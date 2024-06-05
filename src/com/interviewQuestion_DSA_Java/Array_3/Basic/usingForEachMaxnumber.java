package com.interviewQuestion_DSA_Java.Array_3.Basic;

public class usingForEachMaxnumber {
    public static void main(String[] args) {
        int arr[] = {6,23,7,9,34,65,2,4};
        int max = arr[0];
        int minimum =arr[0];
        int se_max = arr[1];
        for(int ele : arr){
            if(ele>max){
                se_max = max;
                max = ele;

            }
            else if (ele<max && ele>se_max){
                se_max = ele;
            }
            if(ele<minimum){
                minimum = ele;
            }

          //  System.out.println(ele);
        }
        System.out.println("Maximum = "+max);
        System.out.println("Minimum = "+minimum);
        System.out.println("Second max = "+se_max);
    }
}
