package com.Collection.set.Sorted_TreeSet;

import java.util.*;
import java.util.stream.Collectors;
//import com.google.gson.Gson;

public class TreeSetConversionExample {

    public static void main(String[] args) {
        // 1. Create a TreeSet and add elements
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Mango");
        treeSet.add("Grapes");

        System.out.println("Original TreeSet: " + treeSet);

        // 2. Convert TreeSet to Object[]
        Object[] objectArray = treeSet.toArray();
        System.out.println("TreeSet to Object[]: " + Arrays.toString(objectArray));

        // 3. Convert TreeSet to String[]
        String[] stringArray = treeSet.toArray(new String[0]);
        System.out.println("TreeSet to String[]: " + Arrays.toString(stringArray));

        // 4. Convert TreeSet to ArrayList
        List<String> arrayList = new ArrayList<>(treeSet);
        System.out.println("TreeSet to ArrayList: " + arrayList);

        // 5. Convert TreeSet to HashSet
        HashSet<String> hashSet = new HashSet<>(treeSet);
        System.out.println("TreeSet to HashSet: " + hashSet);

        // 6. Convert TreeSet to LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(treeSet);
        System.out.println("TreeSet to LinkedHashSet: " + linkedHashSet);

        // 7. Convert TreeSet to Stream and collect to List
        List<String> listFromStream = treeSet.stream().collect(Collectors.toList());
        System.out.println("TreeSet to List using Stream: " + listFromStream);

        // 8. Convert TreeSet to Stream and collect to Set
        Set<String> setFromStream = treeSet.stream().collect(Collectors.toSet());
        System.out.println("TreeSet to Set using Stream: " + setFromStream);

        // 9. Convert TreeSet to Enumeration (for legacy compatibility)
        Enumeration<String> enumeration = Collections.enumeration(treeSet);
        System.out.print("TreeSet to Enumeration: ");
        while (enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement() + " ");
        }
        System.out.println();

        // 10. Convert TreeSet to JSON String (using Gson)
//        Gson gson = new Gson();
//        String json = gson.toJson(treeSet);
//        System.out.println("TreeSet to JSON: " + json);

        // 11. Rebuild TreeSet from JSON (for completeness)
//        TreeSet<String> treeSetFromJson = gson.fromJson(json, TreeSet.class);
//        System.out.println("TreeSet from JSON: " + treeSetFromJson);


    }
}
