package com.Java.ImKeyword_Class_Method;

import java.util.ArrayList;
import java.util.List;

public class FinalReferenceVarEx {
    public static void main(String[] args) {
        // Create an object of the list and declare as a final.
        final List<Integer> list = new ArrayList<Integer>();
        // Adding elements in the list.
        list.add(20);
        list.add(30);
        list.add(40);
        // Displaying the list.
        System.out.println("Elements in the list");

        System.out.println(list);
//      list = new ArrayList<Integer>(); // Final local variable 'list' cannot refer to new ArrayList object.

    }
}
