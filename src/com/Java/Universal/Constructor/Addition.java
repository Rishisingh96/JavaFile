package com.Java.Universal.Constructor;

public class Addition {

//    static void add(int...a){
//        int sum=0;
//        for(int ele : a){
//            sum = sum + ele;
//        }
//        System.out.println(sum);
//    }
    static void max(int...a){
        int max=0;
        for(int ele : a){
            if(ele>max){
                max = ele;
            }
        }
        System.out.println(max);
    }
    static void max(double...a){
        double max=0;
        for(double ele : a){
            if(ele>max){
                max = ele;
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
            max(50,40,30);
            max(50,40,30,60,30);
            max(50.23,440,30.67);
    }
}
