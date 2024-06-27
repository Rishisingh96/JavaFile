package com.Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Q1_Even_Odd_print {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Even number");
        ArrayList<Integer> even = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            int k = sc.nextInt();
//            even.add(k);
//    }
        even.add(2);
        even.add(4);
        even.add(6);
        even.add(8);
        even.add(10);

        System.out.println("Enter Odd number");
        ArrayList<Integer> Odd = new ArrayList<>();
//        for (int j = 0; j < 5; j++) {
//            int k1 = sc.nextInt();
//            Odd.add(k1);
//}
        Odd.add(3);
        Odd.add(5);
        Odd.add(7);
        Odd.add(9);
        Odd.add(13);
        Odd.add(15);

        ArrayList<Integer> al = new ArrayList<>();

        al.addAll(even);
        al.addAll(Odd);

        // Print list3 to verify
        System.out.println("List3 after adding elements from list1 and list2:");
        System.out.println(al);

        // Sort the list using Collections.sort() method
        Collections.sort(al);
        Collections.sort(al, Collections.reverseOrder());

        // Print the sorted list
//        System.out.println("Sorted list: " + al);
        System.out.println("Sorted Decending Order list: " + al);

    }
}
