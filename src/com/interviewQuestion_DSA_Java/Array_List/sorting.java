package com.interviewQuestion_DSA_Java.Array_List;

import java.util.ArrayList;
import java.util.Collections;

public class sorting {
    public static void main(String[] args) {
        //we can all sorting use
        ArrayList<Integer> lis = new ArrayList<>();
        lis.add(10);
        lis.add(3);  //O(1)
        lis.add(5);
        lis.add(34);
        lis.add(54);
        System.out.println(lis);
        Collections.sort(lis);
        System.out.println(lis);

        System.out.println("Decending ");
        Collections.sort(lis, Collections.reverseOrder());  //comparator
        System.out.println(lis);
    }
}
