package com.Java.Collection;
import java.util.*;
public class collectionSet {
    public static void main(String[] args) {
        System.out.println("\n--------------HASHSET-------------");

        HashSet<Double> nms = new HashSet<>();
        //By default set initialCapacity 16 and loadFactor 0.7f
        nms.add(13.38);
        nms.add(133.38);
        nms.add(1323.38);
        nms.add(1423.38);
        nms.add(12.38);
        nms.add(123.38);
       // nms.add(123.38); not print duplicate value
        System.out.println(nms);

        //cwh
        HashSet<Integer> myHashSet = new HashSet<>(6,05f);

        // we can varify initialcapacity and loadFactor ,
        System.out.println("\n--------------TREESET-------------");

        TreeSet<Double> tset = new TreeSet<>();  // For sorting data
        tset.addAll(nms);
        System.out.println(tset);

        System.out.println("\n--------------LINKEDHASSET-------------");

    }
}
