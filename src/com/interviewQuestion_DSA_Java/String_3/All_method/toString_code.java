package com.interviewQuestion_DSA_Java.String_3.All_method;
class Person4 {
    private String name;
    private int age;

    public Person4(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Person[name=" + name + ", age=" + age + "]";
    }
}

public class toString_code {
    public static void main(String[] args) {
        Person4 person = new Person4("John", 30);
        System.out.println(person.toString());
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println(numbers.toString()); // Output: [I@6bc7c054 (this is not very meaningful)
        System.out.println(java.util.Arrays.toString(numbers)); //
    }
}
/*
Certainly! The `toString()` method in Java is a method defined in the `Object` class, which means it's inherited by all other classes in Java. This method returns a string representation of the object.

Here's a simple explanation with multiple examples:

1. **Using `toString()` with Custom Classes**:

   ```java
   class Person {
       private String name;
       private int age;

       public Person(String name, int age) {
           this.name = name;
           this.age = age;
       }

       public String toString() {
           return "Person[name=" + name + ", age=" + age + "]";
       }
   }

   public class Main {
       public static void main(String[] args) {
           Person person = new Person("John", 30);
           System.out.println(person.toString());
       }
   }
   ```

   Output:
   ```
   Person[name=John, age=30]
   ```

2. **Using `toString()` with Built-in Classes**:

   ```java
   public class Main {
       public static void main(String[] args) {
           int[] numbers = {1, 2, 3, 4, 5};
           System.out.println(numbers.toString()); // Output: [I@6bc7c054 (this is not very meaningful)
           System.out.println(java.util.Arrays.toString(numbers)); // Output: [1, 2, 3, 4, 5] (this gives a meaningful output)
       }
   }
   ```

   When you call `toString()` on an array directly, it prints a not very useful representation of the object. However, `Arrays.toString()` provides a more meaningful representation.

3. **Implicit Use of `toString()`**:

   Whenever you concatenate an object with a string using the `+` operator, Java implicitly calls the `toString()` method of that object. For example:

   ```java
   Person person = new Person("Alice", 25);
   System.out.println("Person: " + person); // Output: Person: Person[name=Alice, age=25]
   ```

Using `toString()` can be handy for debugging, logging, or providing meaningful representations of objects when needed. Overriding it in your own classes allows you to define how your objects should be represented as strings.
*/