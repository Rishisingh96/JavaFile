package com.Collection.set.LinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetOperation {
    // This class can be used to implement various operations on LinkedHashSet
    // such as adding, removing, and checking elements, as well as iterating over the set.

    // Example methods can be added here for operations like:
    // - addElement(String element)
    // - removeElement(String element)
    // - containsElement(String element)
    // - iterateElements()

    // For now, this class serves as a placeholder for future LinkedHashSet operations.

    public static void main(String[] args){
        // Example usage of HashSet to demonstrate basic operations
        // This is not a LinkedHashSet, but it shows how to use HashSet.
        System.out.println("HashSet Example:");
        HashSet<String> set = new HashSet<>();
        set.add("UP");
        set.add("Delhi");
        set.add("Mumbai");
        set.add("Bangalore");
        set.add("MP");
        System.out.println("HashSet: Onorder Element - " + set);

        System.out.println("----------------------------------------");
        System.out.println("LinkedHashSetOperation class is ready for implementation.");
        // You can create instances of LinkedHashSet and perform operations here.
        // For example:
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("UP");
        linkedHashSet.add("Delhi");
        linkedHashSet.add("Mumbai");
        linkedHashSet.add("Bangalore");
        linkedHashSet.add("MP");
        System.out.println("LinkedHashSet: Order Element -  " + linkedHashSet);

        // You can add more methods to this class to perform specific operations on LinkedHashSet.
        // For example, you can implement methods to add, remove, and check elements in the LinkedHashSet.
        // Example of adding an element
        System.out.println("----------------------------------------");
        linkedHashSet.add("Kolkata");
        System.out.println("After adding Kolkata: " + linkedHashSet);

        System.out.println("----------------------------------------");
        // Example of removing an element
        linkedHashSet.remove("Delhi");

        System.out.println("After removing Delhi: " + linkedHashSet);

        System.out.println("----------------------------------------");
        // Example of checking if an element exists
        if (linkedHashSet.contains("Mumbai")) {
            System.out.println("LinkedHashSet contains Mumbai");
        } else {
            System.out.println("LinkedHashSet does not contain Mumbai");
        }

        System.out.println("----------------------------------------");
        // Example of iterating through the LinkedHashSet
        System.out.println("Iterating through LinkedHashSet:");
        for(String city : linkedHashSet) {
            System.out.println(city);
        }

        System.out.println("----------------------------------------");
        // Example of checking the size of the LinkedHashSet
        System.out.println("Size of LinkedHashSet: " + linkedHashSet.size());

        System.out.println("----------------------------------------");
        // Example of checking if the LinkedHashSet is empty
        if (linkedHashSet.isEmpty()) {
            System.out.println("LinkedHashSet is empty");
        } else {
            System.out.println("LinkedHashSet is not empty");
        }

        //Iterate through the LinkedHashSet using different methods
        System.out.println("----------------------------------------");
        linkedHashSet.forEach(city -> System.out.println("Using forEach method: " + city));


        System.out.println("----------------------------------------");
        linkedHashSet.stream().forEach(System.out::println);
    }
}
