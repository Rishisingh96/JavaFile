package com.Collection.set.Sorted_TreeSet;

import java.util.TreeSet;

public class TreeSetOperation {
    public static void main(String[] args) {
        System.out.println("----------------------------------------");
        System.out.println("TreeSetOperation class is ready for implementation.");
        // You can create instances of TreeSet and perform operations here.
        //Ordered Set, which means it will sort the elements in natural order.
        // For example:
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("UP");
        treeSet.add("Delhi");
        treeSet.add("Mumbai");
        treeSet.add("Bangalore");
        treeSet.add("MP");

        System.out.println("TreeSet: Sorted Element -  " + treeSet);
        System.out.println("First Element: " + treeSet.first());

        System.out.println("Last Element: " + treeSet.last());

        // Using methods of SortedSet interface.
        System.out.println("HeadSet Elements: " + treeSet.headSet("Mumbai"));

        // Using tailSet method to get elements from a specific element to the end of the set.
        System.out.println("TailSet Elements: " + treeSet.tailSet("Mumbai"));

        // Using subSet method to get a range of elements.
        System.out.println("SubSet Elements: " + treeSet.subSet("Delhi", "Mumbai"));

        // Displaying the comparator used by the TreeSet.
        System.out.println("Sorted Set Comparator: " + treeSet.comparator()); // It will return null because natural ordering is used.

        // Displaying the size of the TreeSet.
        System.out.println("Size of TreeSet: " + treeSet.size());

        // Checking if the TreeSet is empty.
        System.out.println("Is TreeSet empty? " + treeSet.isEmpty());

        // Checking if a specific element exists in the TreeSet.
        System.out.println("Does TreeSet contain 'Delhi'? " + treeSet.contains("Delhi"));

        // Removing an element from the TreeSet.
        treeSet.remove("Delhi");

        System.out.println("TreeSet after removing 'Delhi': " + treeSet);

        // Clearing the TreeSet.
        treeSet.clear();
    }
}
