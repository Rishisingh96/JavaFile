package com.Collection.set.LinkedHashSet;

import java.util.*;
import java.util.stream.Collectors;
//import com.google.gson.Gson;

public class LinkedHashSetConversionExample {

    public static void main(String[] args) {
        // 1. Create a LinkedHashSet and add elements
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Java");
        linkedHashSet.add("Python");
        linkedHashSet.add("C++");
        linkedHashSet.add("JavaScript");

        System.out.println("Original LinkedHashSet: " + linkedHashSet);

        // 2. Convert LinkedHashSet to Object[]
        Object[] objectArray = linkedHashSet.toArray();
        System.out.println("To Object[]: " + Arrays.toString(objectArray));

        // 3. Convert LinkedHashSet to String[]
        String[] stringArray = linkedHashSet.toArray(new String[0]);
        System.out.println("To String[]: " + Arrays.toString(stringArray));

        // 4. Convert LinkedHashSet to ArrayList
        List<String> arrayList = new ArrayList<>(linkedHashSet);
        System.out.println("To ArrayList: " + arrayList);

        // 5. Convert LinkedHashSet to TreeSet (sorted order)
        TreeSet<String> treeSet = new TreeSet<>(linkedHashSet);
        System.out.println("To TreeSet (sorted): " + treeSet);

        // 6. Convert LinkedHashSet to HashSet
        HashSet<String> hashSet = new HashSet<>(linkedHashSet);
        System.out.println("To HashSet (unordered): " + hashSet);

        // 7. Convert LinkedHashSet to Stream and then List
        List<String> streamToList = linkedHashSet.stream().collect(Collectors.toList());
        System.out.println("Stream to List: " + streamToList);

        // 8. Convert LinkedHashSet to Stream and then Set
        Set<String> streamToSet = linkedHashSet.stream().collect(Collectors.toSet());
        System.out.println("Stream to Set: " + streamToSet);

        // 9. Convert LinkedHashSet to Enumeration (for legacy)
        Enumeration<String> enumeration = Collections.enumeration(linkedHashSet);
        System.out.print("To Enumeration: ");
        while (enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement() + " ");
        }
        System.out.println();

//        // 10. Convert LinkedHashSet to JSON String using Gson
//        Gson gson = new Gson();
//        String json = gson.toJson(linkedHashSet);
//        System.out.println("To JSON: " + json);
//
//        // 11. Reconstruct LinkedHashSet from JSON
//        LinkedHashSet<String> fromJson = gson.fromJson(json, LinkedHashSet.class);
//        System.out.println("From JSON: " + fromJson);

        // 12. Convert LinkedHashSet to comma-separated String
        String commaSeparated = String.join(", ", linkedHashSet);
        System.out.println("Comma-Separated String: " + commaSeparated);
    }
}

