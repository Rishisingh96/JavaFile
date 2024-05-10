package com.interviewQuestion_DSA_Java.Array_3.Universal;

public class SecondMaxusingfunction {
    public static void secondMax2(int arr[]){
        int i;
        int max = arr[0];
        int s_max = arr[1];
        for(i=1;i< arr.length;i++){
            if(arr[i]>max){
                s_max = max;
                max = arr[i];

            }
            else if(arr[i]<max && arr[i]>s_max){
                s_max=arr[i];
            }
        }
        System.out.println("\nBeggest number is : "+ max);
        System.out.println("second Biggest number is : "+s_max);
    }
    public static int secondMax(int arr[]){
        int i;
        int max = arr[0];
        int s_max = arr[1];
        for(i=1;i< arr.length;i++){
            if(arr[i]>max){
                s_max = max;
                max = arr[i];

            }
            else if(arr[i]<max && arr[i]>s_max){
                s_max=arr[i];
            }
        }
        return s_max;
    }
    public static void main(String[] args) {
        int arr[] = {5,8,10,20,7,66,30,67};
//        int max2 = secondMax(arr);
//        System.out.print("Second Maximum element is = "+ max2);  // when we take int datatype return only one value ,
        System.out.println("Your Array is ");
        for (int ele : arr)
            System.out.print(ele + " ");
        System.out.print("\nYour second max and first max");
        secondMax2(arr);
    }
}
