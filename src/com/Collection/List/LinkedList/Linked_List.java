package com.Collection.List.LinkedList;
import java.util.*;
public class Linked_List {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        ar.add("Ram");
        ar.add("Rishi");
        ar.add("Durgesh");
        ar.add("Rohit");
        ar.add(23);
        ar.add(34.54);

        System.out.println("index = " + ar.get(0));

        // Way of print ArrayList
        // Method 1: Using for-each loop
        System.out.println("Printing using for-each loop:");
        for (Object element : ar) {
            System.out.println(element);
        }

        // Method 2: Using traditional for loop
        System.out.println("\nPrinting using traditional for loop:");
        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));
        }

        // Method 3: Using Java Streams (Java 8 and later)
        System.out.println("\nPrinting using Java Streams:");
        ar.forEach(System.out::println);

        // Method 4: Using Iterator
        System.out.println("\nPrinting using Iterator:");
        Iterator iterator = ar.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
//        5. Using Java 8 Stream API (collecting to a list):
        System.out.println("Using Java 8 Stream API (collecting to a list)");
        ArrayList<String> ar1 = new ArrayList<>();
        ar1.add("Ram");
        ar1.add("Rishi");
        ar1.add("Durgesh");
        ar1.add("Rohit");
        ar1.add("45");
        ar1.add("34.54");
        
        ar1.stream().forEach(System.out :: println);

        //print using while loop
        System.out.println("\nPrinting using while loop:");
        int num = 0;
        while (ar1.size() > num) {
            System.out.println(ar1.get(num));
            num++;
        }
    }
}
