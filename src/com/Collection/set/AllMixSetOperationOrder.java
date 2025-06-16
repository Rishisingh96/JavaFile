package com.Collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class AllMixSetOperationOrder {
    public static void main(String[] args) {
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
    }
}
