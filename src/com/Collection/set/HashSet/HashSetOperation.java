package com.Collection.set.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetOperation {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2);
        set.add(1);
        set.add(3);

        System.out.println("HashSet: " + set);

        // Check if an element exists
        if(set.contains(2)){
            System.out.println("Set contains 2");
        }if(set.contains(3)) {
            System.out.println("Set contains 3");
        }
        else {
            System.out.println("Set does not contain 2");
        }

        // Remove an element
        set.remove(2);
        System.out.println("After removing 2, HashSet: " + set);

        // Check the size of the HashSet
        System.out.println("Size of HashSet: " + set.size());

        // Check if the HashSet is empty
        if(set.isEmpty()) {
            System.out.println("HashSet is empty");
        } else {
            System.out.println("HashSet is not empty");
        }

        // Clear the HashSet
//                set.clear();
//                System.out.println("After clearing, HashSet: " + set);

        // Iterate through the HashSet
        System.out.println("Iterating through HashSet:");
        for (Integer number : set) {
            System.out.println("Using Advance forEach: " + number);
        }

        System.out.println("----------------------------");
        // Iterate using Iterator
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println("Using Iterator: " + iterator.next());
        }

        System.out.println("----------------------------");
        // Using forEach method
        set.forEach(number -> System.out.println("Using forEach method: " + number));

        //Iterate using lambda expression
        System.out.println("----------------------------");
        set.stream().forEach(number -> System.out.println("Using Stream API: " + number));

        // Iterate using method reference
        System.out.println("----------------------------");
        System.out.println("Using method reference:");
        set.stream().forEach(System.out::println);

        // Iterate using forEachRemaining
        System.out.println("----------------------------");
        System.out.println("Using forEachRemaining:");
        Iterator<Integer> iterator1 = set.iterator();
        iterator1.forEachRemaining(number -> System.out.println("Using forEachRemaining: " + number));


        // If you want to clear the HashSet, uncomment the following lines
        // set.clear();
    }
}
