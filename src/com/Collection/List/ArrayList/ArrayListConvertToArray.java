package com.Collection.List.ArrayList;

import java.util.*;

public class ArrayListConvertToArray {
    public static void main(String[] args) {
        // Create an ArrayList of Integer type
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Add elements to the ArrayList
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }

        // Convert ArrayList to Array
        Integer[] array = new Integer[arrayList.size()];
        array = arrayList.toArray(array);

        // System.out.println("ArrayList converted to Array:"+array);
        // Print the elements of the Array
        for (Integer element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
        ArrayList<String> list = new ArrayList<String>();
        list.add("John");
        list.add("Bob");
        list.add("Mark");
        list.add("Deep");
// Converting ArrayList into array.
//        String[] array1 = list.toArray(new String[list.size()]);
        String[] array1 = list.toArray(new String[0]);
        // Iterating array.
     /*   for (int i = 0; i < array1.length; i++)
        {
            System.out.print(array1[i]+" ");
        }*/

        // Iterating array.
        for (String s : array1) {
            System.out.print(STR."\{s} ");
        }
    }

}
