package com.Collection.map.TreeMap;

import java.util.*;

public class TreeMapOperationsExample {
    public static void main(String[] args) {
        // 1. Create a TreeMap of student ID and name
        TreeMap<Integer, String> studentMap = new TreeMap<>();

        // 2. Adding entries
        studentMap.put(102, "Amit");
        studentMap.put(105, "Neha");
        studentMap.put(101, "Ravi");
        studentMap.put(103, "Sneha");
        studentMap.put(104, "Raj");

        System.out.println("Initial TreeMap (sorted by keys):");
        System.out.println(studentMap); // Output sorted by keys

        // 3. Accessing value by key
        System.out.println("\nName of student with ID 103: " + studentMap.get(103));

        // 4. Updating value for a key
        studentMap.put(104, "Raj Sharma"); // update value
        System.out.println("\nUpdated value for ID 104:");
        System.out.println(studentMap);

        // 5. Removing entry by key
        studentMap.remove(105);
        System.out.println("\nAfter removing ID 105:");
        System.out.println(studentMap);

        // 6. Check if map contains a key or value
        System.out.println("\nContains key 102? " + studentMap.containsKey(102));
        System.out.println("Contains value 'Ravi'? " + studentMap.containsValue("Ravi"));

        // 7. Get first and last key
        System.out.println("\nFirst key: " + studentMap.firstKey());
        System.out.println("Last key: " + studentMap.lastKey());

        // 8. Get first and last entry
        System.out.println("First entry: " + studentMap.firstEntry());
        System.out.println("Last entry: " + studentMap.lastEntry());

        // 9. Get headMap (less than given key)
        System.out.println("\nHeadMap (keys < 104): " + studentMap.headMap(104));

        // 10. Get tailMap (keys >= 103)
        System.out.println("TailMap (keys >= 103): " + studentMap.tailMap(103));

        // 11. Get subMap (between 102 and 104)
        System.out.println("SubMap (from 102 to 104): " + studentMap.subMap(102, 104)); // 104 exclusive

        // 12. Iterate using entrySet
        System.out.println("\nIterating using entrySet:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // 13. Iterating in descending order
        System.out.println("\nDescending order:");
        NavigableMap<Integer, String> descendingMap = studentMap.descendingMap();
        for (Map.Entry<Integer, String> entry : descendingMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // 14. Size of TreeMap
        System.out.println("\nSize of TreeMap: " + studentMap.size());

        // 15. Clear the map
        studentMap.clear();
        System.out.println("\nAfter clearing:");
        System.out.println("Is map empty? " + studentMap.isEmpty());
    }
}

/*Here is a complete guide on TreeMap operations in Java, including a long example with all important operations like:

Insertion

Retrieval

Deletion

Iteration (ascending & descending)

HeadMap, TailMap, SubMap

First/Last Entry

Size, Clear, Contains, etc.

✅ What is TreeMap in Java?
A TreeMap in Java is a Map implementation that keeps keys in sorted (natural or custom) order. It is part of the java.util package and uses a Red-Black tree internally.

🧠 Syntax:
java
Copy
Edit
TreeMap<KeyType, ValueType> mapName = new TreeMap<>();
📘 Key Characteristics:
Feature	TreeMap
Order	Keys sorted (ascending)
Null keys allowed?	❌ No null keys
Null values allowed?	✅ Yes
Thread-safe?	❌ Not synchronized
Underlying structure	Red-Black Tree
*/

/*Initial TreeMap (sorted by keys):
{101=Ravi, 102=Amit, 103=Sneha, 104=Raj, 105=Neha}

Name of student with ID 103: Sneha

Updated value for ID 104:
{101=Ravi, 102=Amit, 103=Sneha, 104=Raj Sharma, 105=Neha}

After removing ID 105:
{101=Ravi, 102=Amit, 103=Sneha, 104=Raj Sharma}

Contains key 102? true
Contains value 'Ravi'? true

First key: 101
Last key: 104
First entry: 101=Ravi
Last entry: 104=Raj Sharma

HeadMap (keys < 104): {101=Ravi, 102=Amit, 103=Sneha}
TailMap (keys >= 103): {103=Sneha, 104=Raj Sharma}
SubMap (from 102 to 104): {102=Amit, 103=Sneha}

Iterating using entrySet:
ID: 101, Name: Ravi
ID: 102, Name: Amit
ID: 103, Name: Sneha
ID: 104, Name: Raj Sharma

Descending order:
ID: 104, Name: Raj Sharma
ID: 103, Name: Sneha
ID: 102, Name: Amit
ID: 101, Name: Ravi

Size of TreeMap: 4

After clearing:
Is map empty? true
*/

/*📘 TreeMap Important Methods Table
Method	Description
put(K, V)	Insert key-value pair
get(K)	Get value by key
remove(K)	Remove entry by key
containsKey(K)	Check if key exists
containsValue(V)	Check if value exists
size()	Get number of entries
isEmpty()	Check if map is empty
clear()	Remove all entries
firstKey(), lastKey()	Get smallest/largest key
firstEntry(), lastEntry()	Get first/last key-value pair
headMap(K)	Map of keys < K
tailMap(K)	Map of keys >= K
subMap(K1, K2)	Map of keys from K1 (inclusive) to K2 (exclusive)
descendingMap()	Get reversed view of TreeMap

🚀 Use Cases of TreeMap:
When you need sorted key order automatically.

Navigation-based access (higherKey(), lowerKey(), etc.).

Range queries: Get all keys between A and B.

*/