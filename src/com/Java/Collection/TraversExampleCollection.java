package com.Java.Collection;
import java.util.*;

public class TraversExampleCollection {
    public static void main(String[] args) {

        System.out.println("++++++++++++++UNDER LIST++++++++++++++");
        ArrayList<String> names = new ArrayList<>();
        names.add("Rishi singh");
        names.add("Durgesh sir");
        names.add("Harry sir");
        names.add("Vandna sin ");
        names.add("Vandna sin");
        names.add("Roshni sin");
        System.out.println(names);

        System.out.println("\n++++++++++++++FOR EACH LOOP++++++++++++++");
        for (String str : names) {
            System.out.print(str + "\t" + str.length() + "\t");
            StringBuffer br = new StringBuffer(str);
            System.out.println(br.reverse());
        }
        System.out.println("\n++++++++++++++ITERATOR++++++++++++++");
        // Travarsing using ITERATOR : Forward traversing
        Iterator<String> itr = names.iterator();
        while (itr.hasNext()) {  //It returns true if the iterator has more elements otherwise it returns false.
            String next = itr.next();
            System.out.println(next);
        }

        System.out.println("\n++++++++++++++LISTITERATOR++++++++++++++");

        //backword traversal of collection LISTITERATOR
        ListIterator<String> litr = names.listIterator(names.size());
        while (litr.hasPrevious()) {
            String previous = litr.previous();
            System.out.println(previous);
        }

        System.out.println("\n++++++++++++++Enumeration++++++++++++++");
        System.out.println("\n++++++++++++++FOR EACH METHOD++++++++++++++");
        names.forEach(str -> {
            System.out.println(str);
        });
        System.out.println("\n------------TreeSet--------------");
        TreeSet<String> set = new TreeSet<>();
        set.addAll(names);
        set.forEach(e -> {
            System.out.println(e);
        });
        //Comparable  - sorting
        //Comparator - customer sorting
    }
}
