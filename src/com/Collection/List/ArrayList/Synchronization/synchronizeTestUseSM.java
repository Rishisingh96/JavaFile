package com.Collection.List.ArrayList.Synchronization;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class synchronizeTestUseSM {
    public static void main(String[] args) {
        // Synchronization of ArrayList using synchronized method
        // Create an ArrayList object
        ArrayList<String> list = new ArrayList<>();

        // Add elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Synchronize the ArrayList using synchronized method
        List<String> synchronizedList = Collections.synchronizedList(list);

        // Iterate through the synchronized ArrayList
        synchronized (synchronizedList) {
            for (String fruit : synchronizedList) {
                System.out.println(fruit);
            }
        }
    }
}
