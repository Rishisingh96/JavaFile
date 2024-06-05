package com.Java.Universal.Week4;

import java.util.StringJoiner;

public class R_5_StringJoiner {
    public static void main(String[] args) {
        // List of names to be joined
        String[] names = {"Alice", "Bob", "Rohan", "Rishi", "Mohit"};

        // Create a StringJoiner with ", " as delimiter and "[" as prefix and "]" as suffix
        StringJoiner joiner = new StringJoiner(", ", "[", "]");

        // Add each name to the StringJoiner
        for (String name : names) {
            joiner.add(name);
        }

        // Get the final joined string
        String result = joiner.toString();

        // Print the result
        System.out.println("Joined names: " + result);
    }
}
/*
Certainly! The `StringJoiner` class in Java provides a simple way to create a sequence of strings separated by a delimiter, with optional prefix and suffix strings. It's useful for creating concatenated strings from collections of strings or other string sources in a structured manner.

Here's a meaningful program demonstrating the use of the `StringJoiner` class. The program will join a list of names into a single string, with each name separated by a comma and space, and enclosed in square brackets.

```java
import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        // List of names to be joined
        String[] names = {"Alice", "Bob", "Charlie", "Diana", "Edward"};

        // Create a StringJoiner with ", " as delimiter and "[" as prefix and "]" as suffix
        StringJoiner joiner = new StringJoiner(", ", "[", "]");

        // Add each name to the StringJoiner
        for (String name : names) {
            joiner.add(name);
        }

        // Get the final joined string
        String result = joiner.toString();

        // Print the result
        System.out.println("Joined names: " + result);
    }
}
```

### Explanation

1. **Creating the StringJoiner**:
   - We create a `StringJoiner` instance with ", " as the delimiter, "[" as the prefix, and "]" as the suffix.
   ```java
   StringJoiner joiner = new StringJoiner(", ", "[", "]");
   ```

2. **Adding Strings**:
   - We loop through the array of names and add each name to the `StringJoiner` using the `add` method.
   ```java
   for (String name : names) {
       joiner.add(name);
   }
   ```

3. **Getting the Final String**:
   - We convert the `StringJoiner` to a string using the `toString` method and store it in the `result` variable.
   ```java
   String result = joiner.toString();
   ```

4. **Output**:
   - We print the final joined string.
   ```java
   System.out.println("Joined names: " + result);
   ```

### Output

The program will produce the following output:
```
Joined names: [Alice, Bob, Charlie, Diana, Edward]
```

This demonstrates how `StringJoiner` can be used to concatenate strings with a specified delimiter, prefix, and suffix, providing a clean and efficient way to handle such string operations.
*/