package com.Collection.List.ArrayList.Synchronization;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class ArrayListSynchronizationTest {
    public static void main(String[] args)
    {
// Create an ArrayList object with initial capacity of 10.
// Non-synchronized ArrayList Object.
        List<String> l = new ArrayList<String>();
// Add elements in the list.
        l.add("Apple");
        l.add("Orange");
        l.add("Banana");
        l.add("Pineapple");
        l.add("Guava");
        // Synchronizing ArrayList in Java.
        List<String> synlist = Collections.synchronizedList( l ); // l is non-synchronized.
        // Here, we will use a synchronized block to avoid the non-deterministic behavior.
        synchronized(synlist)
        {
            // Call iterator() method to iterate the ArrayList.
            Iterator<String> itr = synlist.iterator();
            while(itr.hasNext())
            {
                String str = itr.next();
                System.out.println(str);
            }
        }
    }
}
