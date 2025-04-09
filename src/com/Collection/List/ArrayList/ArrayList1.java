package com.Collection.List.ArrayList;

import java.util.*;

public class ArrayList1 {

    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        ar.add("Ram");
        ar.add("Rishi");
        ar.add("Durgesh");
        ar.add("Rohit");
        ar.add(23);
        ar.add(34.54);

        System.out.println("index = " + ar.get(0));

        // Way of print ArrayList
        // Method 1: Using for-each loop
        System.out.println("Printing using for-each loop:");
        for (Object element : ar) {
            System.out.println(element);
        }

        // Method 2: Using traditional for loop
        System.out.println("\nPrinting using traditional for loop:");
        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));
        }

        // Method 3: Using Java Streams (Java 8 and later)
        System.out.println("\nPrinting using Java Streams:");
        ar.forEach(System.out::println);

        // Method 4: Using Iterator
        System.out.println("\nPrinting using Iterator:");
        Iterator iterator = ar.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
//        5. Using Java 8 Stream API (collecting to a list):
        System.out.println("Using Java 8 Stream API (collecting to a list)");
        ArrayList<String> ar1 = new ArrayList<>();
        ar1.add("Ram");
        ar1.add("Rishi");
        ar1.add("Durgesh");
        ar1.add("Rohit");
        ar1.add("45");
        ar1.add("34.54");
        
        ar1.stream().forEach(System.out :: println);
    }
}

/*
Explanation:
Method 1: Uses a for-each loop to iterate over each element in the ArrayList ar and prints each element.
Method 2: Uses a traditional for loop to iterate over the indices of the ArrayList and uses get(i) to retrieve and print each element.
Method 3: Utilizes the forEach method of Java Streams to iterate over each element and print it using a method reference System.out::println.
Method 4: Uses an Iterator to iterate over the elements of the ArrayList ar and prints each element using the next() method of the iterator.

In Java, there are several ways to print the elements of an `ArrayList` from the Collection framework. Here are the common methods:

### 1. Using a for-each loop (Enhanced for loop):
```java
ArrayList<T> list = new ArrayList<>();
// Add elements to the list...

for (T element : list) {
    System.out.println(element);
}
```
This method iterates over each element in the `ArrayList` using a for-each loop and prints each element to the console.

### 2. Using traditional for loop:
```java
ArrayList<T> list = new ArrayList<>();
// Add elements to the list...

for (int i = 0; i < list.size(); i++) {
    System.out.println(list.get(i));
}
```
This method uses a traditional for loop to iterate over the indices of the `ArrayList` and prints each element using the `get()` method.

### 3. Using Java Streams (Java 8 and later):
```java
ArrayList<T> list = new ArrayList<>();
// Add elements to the list...

list.forEach(System.out::println);
```
This method utilizes the `forEach` method introduced in Java 8 Streams API to print each element of the `ArrayList`.

### 4. Using Iterator:
```java
ArrayList<T> list = new ArrayList<>();
// Add elements to the list...

Iterator<T> iterator = list.iterator();
while (iterator.hasNext()) {
    System.out.println(iterator.next());
}
```
This method uses an `Iterator` to iterate over the elements of the `ArrayList` and prints each element using the `next()` method of the iterator.

### 5. Using Java 8 Stream API (collecting to a list):
```java
ArrayList<T> list = new ArrayList<>();
// Add elements to the list...

list.stream().forEach(System.out::println);
```
This method creates a stream from the `ArrayList` and uses the `forEach` method to print each element.

### Notes.md:
- Each of these methods has its advantages depending on the specific use case and coding style preference.
- The choice of method may depend on factors such as performance requirements, readability, and the version of Java being used (especially when considering Java 8 features like Streams).
- Ensure that the `ArrayList` is properly instantiated and populated with elements before attempting to print its contents.

 */
