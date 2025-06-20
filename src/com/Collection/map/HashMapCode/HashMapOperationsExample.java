package com.Collection.map.HashMapCode;

import java.util.*;

public class HashMapOperationsExample {
    public static void main(String[] args) {

        // 1. Create a HashMap to store student ID and Name
        HashMap<Integer, String> studentMap = new HashMap<>();

        // 2. Add key-value pairs using put()
        studentMap.put(101, "Ravi");
        studentMap.put(102, "Neha");
        studentMap.put(103, "Amit");
        studentMap.put(104, "Sneha");

        // Duplicate key (will update the existing key's value)
        studentMap.put(103, "Amit Kumar");

        // Null key and value allowed
        studentMap.put(null, "NoName");
        studentMap.put(105, null);
        studentMap.put(106, null);

        System.out.println("Initial HashMap:");
        System.out.println(studentMap); // Output order is not guaranteed

        // 3. Accessing a value using key
        System.out.println("\nName of student with ID 102: " + studentMap.get(102));

        // 4. Updating an entry
        studentMap.put(104, "Sneha Sharma");
        System.out.println("\nUpdated value for key 104: " + studentMap.get(104));

        // 5. Checking if a key exists
        System.out.println("\nContains key 101? " + studentMap.containsKey(101));

        // 6. Checking if a value exists
        System.out.println("Contains value 'Ravi'? " + studentMap.containsValue("Ravi"));

        // 7. Removing an entry by key
        studentMap.remove(105); // Remove the null value key
        System.out.println("\nAfter removing key 105:");
        System.out.println(studentMap);

        // 8. Size of the map
        System.out.println("\nSize of HashMap: " + studentMap.size());

        // 9. Iterating through keys
        System.out.println("\nIterating using keySet():");
        for (Integer key : studentMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + studentMap.get(key));
        }

        // 10. Iterating through values
        System.out.println("\nIterating using values():");
        for (String value : studentMap.values()) {
            System.out.println("Value: " + value);
        }

        // 11. Iterating through entries
        System.out.println("\nIterating using entrySet():");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // 12. Using getOrDefault() method
        System.out.println("\nGet ID 110 or default: " + studentMap.getOrDefault(110, "Not Found"));

        // 13. Using replace() method
        studentMap.replace(102, "Neha Sharma");
        System.out.println("Replaced value for ID 102: " + studentMap.get(102));

        // 14. Using putIfAbsent() - will NOT overwrite existing value
        studentMap.putIfAbsent(101, "Ravi Singh");
        System.out.println("\nAfter putIfAbsent on key 101 (already exists): " + studentMap.get(101));

        // 15. Clear the map
        studentMap.clear();
        System.out.println("\nAfter clearing the map:");
        System.out.println("Is map empty? " + studentMap.isEmpty());
    }
}

/*Here is a complete explanation of HashMap operations in Java with a long, fully commented example, covering all major operations like:

Creating a HashMap

Adding entries

Accessing, updating, and removing entries

Checking key/value presence

Iterating through the map

Getting size, clearing map

Using keySet(), values(), entrySet()

✅ What is HashMap?
HashMap is a part of Java’s java.util package. It stores data as key-value pairs and allows fast access using keys. It does not maintain insertion order, and allows one null key and multiple null values.

🧠 Syntax:
java
Copy
Edit
HashMap<KeyType, ValueType> mapName = new HashMap<>();
*/

/*Initial HashMap:
{null=NoName, 101=Ravi, 102=Neha, 103=Amit Kumar, 104=Sneha, 105=null, 106=null}

Name of student with ID 102: Neha

Updated value for key 104: Sneha Sharma

Contains key 101? true
Contains value 'Ravi'? true

After removing key 105:
{null=NoName, 101=Ravi, 102=Neha, 103=Amit Kumar, 104=Sneha Sharma, 106=null}

Size of HashMap: 6

Iterating using keySet():
Key: null, Value: NoName
Key: 101, Value: Ravi
Key: 102, Value: Neha
Key: 103, Value: Amit Kumar
Key: 104, Value: Sneha Sharma
Key:
*/

/*📘 Summary Table of Common HashMap Methods:
Method	Description
put(K, V)	Adds or updates a key-value pair
get(K)	Retrieves the value associated with the key
remove(K)	Removes an entry by key
containsKey(K)	Checks if the map contains a key
containsValue(V)	Checks if the map contains a value
size()	Returns number of key-value pairs
clear()	Removes all entries
isEmpty()	Returns true if map is empty
keySet()	Returns a set of all keys
values()	Returns a collection of all values
entrySet()	Returns a set of all key-value pairs
getOrDefault(K, V)	Returns value or default if key is not found
putIfAbsent(K, V)	Adds only if the key is not already present
replace(K, V)	Replaces the value for the specified key

🛠 Use Cases of HashMap:
When you need fast key-based access

Suitable for storing unique keys with values

Used in caching, indexing, data lookups, etc.

*/