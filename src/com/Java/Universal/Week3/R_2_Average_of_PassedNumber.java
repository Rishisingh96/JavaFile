package com.Java.Universal.Week3;

class AverageCode{

    static void calculateAverage(int... a) {
        float sum = 0,count=0;

        for (int ele : a) {
            count++;
            sum = sum + ele;
        }
        if(count!=0){
            System.out.printf("Average: %.3f\n", (sum/count));
        }else {
            System.out.println("No number provides");
        }
       // System.out.println(count);
    }
}
public class R_2_Average_of_PassedNumber {
    public static void main(String[] args) {
        AverageCode.calculateAverage(30, 50, 20, 30);
        AverageCode.calculateAverage(30, 50, 20, 30,90,50,30);
        AverageCode.calculateAverage();
    }
}
