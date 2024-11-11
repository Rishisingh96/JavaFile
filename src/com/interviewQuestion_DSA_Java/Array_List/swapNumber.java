package com.interviewQuestion_DSA_Java.Array_List;

import java.util.ArrayList;

public class swapNumber {
    public static void swap(ArrayList<Integer> list, int indx1, int indx2){
        int temp = list.get(indx1);
        list.set(indx1, list.get(indx2));
        list.set(indx2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> lis = new ArrayList<>();
        lis.add(10);
        lis.add(3);
        lis.add(5);
        lis.add(34);

        int indx1 = 1, indx2=3;
        System.out.println(lis.get(indx1));

        System.out.println(lis);
        swap(lis, indx1,indx2);
        System.out.println(lis);
    }
}
