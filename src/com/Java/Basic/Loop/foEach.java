package com.Java.Basic.Loop;

public class foEach {
    public static void main(String[] args) {
        /*
        for(data_type variable : array | collection){
                //body of for-each loop
            }
       */

        //declaring an array
        int arr[] = {12, 13, 14, 44};
        //traversing the array with for-each loop
        for (int i : arr) {
            System.out.println(i);
        }


    }
}
