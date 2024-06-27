package rishi.Java.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Basic {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("banana");
        treeSet.add("apple");
        treeSet.add("cherry");

        // Using Iterator
        Iterator<String> sT = treeSet.iterator();
        while(sT.hasNext()){
            System.out.println(sT.next());
        }
        System.out.println("\n");

        // Using enhanced for-loop (for-each)
        for (String fruit : treeSet) {
            System.out.println(fruit);
        }
        System.out.println("\n");

        // Using forEach() with lambda expression  3. Using forEach() method with Lambda Expression (Java 8+)
      treeSet.forEach(fruits-> System.out.println(fruits));
        System.out.println("\n");

      //Stream Api
      treeSet.forEach(System.out::println);
    }
}
