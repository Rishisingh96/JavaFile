package com.Collection.map.LinkedHashMap;

import java.util.*;
/**/
public class LinkedHashMapOperationsExample {
    public static void main(String[] args) {
        // 1. Creating LinkedHashMap
        LinkedHashMap<Integer, String> students = new LinkedHashMap<>();

        // 2. Adding entries
        students.put(101, "Ravi");
        students.put(102, "Amit");
        students.put(103, "Neha");
        students.put(104, "Sneha");

        System.out.println("Initial LinkedHashMap (insertion order):");
        System.out.println(students);

        // 3. Accessing values by key
        System.out.println("\nStudent with ID 102: " + students.get(102));

        // 4. Updating an existing key
        students.put(103, "Neha Sharma");
        System.out.println("\nUpdated student with ID 103:");
        System.out.println(students);

        // 5. Checking if a key exists
        System.out.println("\nContains key 101? " + students.containsKey(101));

        // 6. Checking if a value exists
        System.out.println("Contains value 'Amit'? " + students.containsValue("Amit"));

        // 7. Removing a key-value pair
        students.remove(104);
        System.out.println("\nAfter removing ID 104:");
        System.out.println(students);

        // 8. Iterating using for-each with entrySet()
        System.out.println("\nIterating using entrySet():");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // 9. Iterating keys only
        System.out.println("\nIterating keys:");
        for (Integer key : students.keySet()) {
            System.out.println("Key: " + key);
        }

        // 10. Iterating values only
        System.out.println("\nIterating values:");
        for (String value : students.values()) {
            System.out.println("Value: " + value);
        }

        // 11. Size of LinkedHashMap
        System.out.println("\nSize of LinkedHashMap: " + students.size());

        // 12. Clearing the map
        students.clear();
        System.out.println("\nAfter clearing:");
        System.out.println("Is empty? " + students.isEmpty());
    }
}
/*Here’s a detailed explanation of LinkedHashMap operations in Java with a long example covering all important operations such as:

Adding elements

Accessing elements

Updating values

Removing entries

Iterating entries

Checking size, key presence, value presence

Clearing the map

Preserving insertion order

Using entrySet(), keySet(), and values()

✅ What is LinkedHashMap in Java?
LinkedHashMap is a subclass of HashMap in Java that maintains a linked list of the entries in insertion order. This means when you iterate through it, entries will appear in the order they were inserted.

It is part of java.util package.

🧠 Syntax:
java
Copy
Edit
LinkedHashMap<KeyType, ValueType> mapName = new LinkedHashMap<>();
*/


/*Initial LinkedHashMap (insertion order):
{101=Ravi, 102=Amit, 103=Neha, 104=Sneha}

Student with ID 102: Amit

Updated student with ID 103:
{101=Ravi, 102=Amit, 103=Neha Sharma, 104=Sneha}

Contains key 101? true
Contains value 'Amit'? true

After removing ID 104:
{101=Ravi, 102=Amit, 103=Neha Sharma}

Iterating using entrySet():
ID: 101, Name: Ravi
ID: 102, Name: Amit
ID: 103, Name: Neha Sharma

Iterating keys:
Key: 101
Key: 102
Key: 103

Iterating values:
Value: Ravi
Value: Amit
Value: Neha Sharma

Size of LinkedHashMap: 3

After clearing:
Is empty? true
*/

/*🧾 Key Features of LinkedHashMap:
Feature	Description
Maintains Insertion Order	Yes
Allows Null Keys & Values	One null key, multiple null values
Thread-Safe	No (use Collections.synchronizedMap() if needed)
Duplicate Keys	No (will overwrite if duplicate key added)
Performance	Similar to HashMap, but slightly slower due to order tracking

🛠 Use Cases:
When you want fast access like a HashMap, but need predictable iteration order.

Ideal for caching, preserving form entry order, or recent access tracking.*/