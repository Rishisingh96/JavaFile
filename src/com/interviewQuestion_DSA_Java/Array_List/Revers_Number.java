package com.interviewQuestion_DSA_Java.Array_List;

import java.util.ArrayList;

public class Revers_Number {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(list.size());
        System.out.println(list.get(5));
        //Reverse print
        for(int i=list.size()-1; i>=0; i--){
            System.out.print(STR."\{list.get(i)} ");
        }
        System.out.println();
    }
}
