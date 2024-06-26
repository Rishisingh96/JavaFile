package com.Collection.List;

import java.util.HashSet;
import java.util.Set;

public class check_Identical {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("Rishi singh");
        set1.add("Ram");
        set1.add("Mohit");

        Set<String> set2 = new HashSet<>();
        set2.add("Rishi singh");
        set2.add("Ram");
        set2.add("Mohit");

        Set<String > identical = new HashSet<>();
        identical.addAll(set1);
        identical.addAll(set2);
        if(set1.equals(set2)){
            identical.add("This is identical");
        }
        else {
            identical.add("This is not identical");
        }
        identical.forEach(System.out::println);
    }
}

/*### What is a Set in Java?

A `Set` in Java is a part of the Java Collections Framework. It is an interface that extends the `Collection` interface and represents a collection that contains no duplicate elements. In other words, each element in a `Set` is unique. The `Set` interface models the mathematical set abstraction and is implemented by various classes, such as `HashSet`, `LinkedHashSet`, and `TreeSet`.

### Uses of Set

1. **Uniqueness**: Ensure that a collection contains no duplicate elements.
2. **Set Operations**: Perform standard set operations like union, intersection, and difference.
3. **Fast Lookup**: Provides fast lookup of elements.
4. **Elimination of Duplicates**: Automatically handles duplicates for you.

### Types of Sets

1. **HashSet**:
   - Does not maintain any order.
   - Provides constant time performance for basic operations like add, remove, and contains.

2. **LinkedHashSet**:
   - Maintains a doubly-linked list of elements in the order in which they were inserted.
   - Provides predictable iteration order.

3. **TreeSet**:
   - Implements the `NavigableSet` interface.
   - Elements are sorted in their natural order or according to a provided comparator.

### Creating and Printing a HashSet

There are several ways to create and print a `HashSet` in the Java Collections Framework.

#### 1. Basic Creation and Printing

```java
import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // Creating a HashSet
        Set<String> set = new HashSet<>();

        // Adding elements to the HashSet
        set.add("apple");
        set.add("banana");
        set.add("cherry");

        // Printing the HashSet
        System.out.println("HashSet: " + set);
    }
}
```

#### 2. Iterating Using a For-Each Loop

```java
import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("cherry");

        System.out.println("Using for-each loop:");
        for (String element : set) {
            System.out.println(element);
        }
    }
}
```

#### 3. Using an Iterator

```java
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("cherry");

        System.out.println("Using iterator:");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
```

#### 4. Using Java Streams

```java
import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("cherry");

        System.out.println("Using streams:");
        set.stream().forEach(System.out::println);
    }
}
```

#### 5. Using Enhanced toString() Method

Java's `HashSet` class provides a `toString()` method that returns a string representation of the set. This can be used to print the contents directly:

```java
import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("cherry");

        // Using the enhanced toString() method
        System.out.println("HashSet: " + set.toString());
    }
}
```

### Summary

- A `Set` is a collection of unique elements.
- `HashSet`, `LinkedHashSet`, and `TreeSet` are primary implementations.
- Various ways to create and print a `HashSet` include using `System.out.println`, for-each loops, iterators, streams, and the `toString` method.

If you need more detailed examples or additional information, feel free to ask!
*/
