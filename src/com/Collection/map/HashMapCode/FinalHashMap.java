package com.Collection.map.HashMapCode;

import java.util.HashMap;

public class FinalHashMap {
    public static void main(String[] args) {
        // HashMap is a part of Java's collection framework and provides the basic implementation of Map interface.
        // It is used to store key & value pairs, based on the HashMap data structure.
        // It does not guarantee that the order of the map will remain constant over time.
        // It allows null values and one null key.
        // It is non-synchronized and cannot be shared between multiple threads without proper synchronization.
        // It is fast and provides better performance compared to other Map implementations like Hashtable.

        final int a = 10;
        // a = 20; // ❌ Error: cannot assign a value to final variable 'a'

        final HashMap<String, String> myMap = new HashMap<>();
        // ✅ Allowed: You can modify the contents of a final object (adding entries, removing, etc.)
        myMap.put("Rishi", "Rishi");
        myMap.put("Salone", "Salone");
        myMap.put("Mohit", "Mohit");
        myMap.put("Rohan", "Rohan");
        myMap.put("Vijay", "Vijay");

        // myMap = new HashMap<>(); // ❌ Error: cannot assign a new object to final reference 'myMap'
    }
}
/*✅ Key Concepts:
final int a = 10; means a is a constant — you can't reassign it, so a = 20; causes a compile-time error.

final HashMap<String, String> myMap = new HashMap<>(); means you can't reassign myMap to a new object, but you can modify the contents (like .put(), .remove(), etc.).

❌ Compile Errors in Your Code:
a = 20; → ❌ Not allowed (reassignment to final variable).

myMap = new HashMap<>(); → ❌ Not allowed (reassigning a final object reference).

Would you like a version where this concept is demonstrated with mutable vs immutable behavior?*/