package com.Java.testingshastraLoginQuestion.ReflectionAPI;

import java.lang.reflect.Constructor;
import java.lang.reflect.*;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException {
        Class c = Demo.class;
        Constructor[] declaredConstructor = new Constructor[]{c.getDeclaredConstructor()};
        int modifiers = declaredConstructor[0].getModifiers();
    }
}
/*The Reflection API in Java allows a program to inspect or modify the runtime behavior of applications. It provides the ability to examine or manipulate the properties, methods, and constructors of classes during runtime, even if the classes are not known at compile time.

Key Use Cases of Reflection:
Inspecting class properties: Get information about class fields, methods, constructors, and annotations.
Dynamically invoking methods: Invoke methods at runtime even if their names are not known beforehand.
Creating new instances: Create instances of a class dynamically.
Changing private fields: Access or modify private variables.
Classes in Java Reflection API:
Class: Represents a class or interface at runtime.
Field: Provides information about, and access to, a single field of a class.
Method: Provides information about, and access to, a single method of a class.
Constructor: Provides information about, and access to, a single constructor.
Modifier: Provides static methods and constants to decode class and member access modifiers.
Example of Using Reflection in Java:
java
Copy code
import java.lang.reflect.*;

class Employee {
    private String name;
    private int salary;

    // Constructor
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    // Public method
    public void display() {
        System.out.println("Employee Name: " + name + ", Salary: " + salary);
    }

    // Private method
    private void incrementSalary(int amount) {
        this.salary += amount;
    }
}

public class ReflectionExample {
    public static void main(String[] args) {
        try {
            // Step 1: Load the class
            Class<?> empClass = Class.forName("Employee");

            // Step 2: Get Constructor and create a new instance
            Constructor<?> constructor = empClass.getConstructor(String.class, int.class);
            Object empInstance = constructor.newInstance("John Doe", 5000);

            // Step 3: Access and invoke public method 'display'
            Method displayMethod = empClass.getMethod("display");
            displayMethod.invoke(empInstance);  // Output: Employee Name: John Doe, Salary: 5000

            // Step 4: Access private field 'salary' and change its value
            Field salaryField = empClass.getDeclaredField("salary");
            salaryField.setAccessible(true);  // Make private field accessible
            salaryField.set(empInstance, 6000);

            // Step 5: Invoke private method 'incrementSalary'
            Method incrementMethod = empClass.getDeclaredMethod("incrementSalary", int.class);
            incrementMethod.setAccessible(true);  // Make private method accessible
            incrementMethod.invoke(empInstance, 1000);

            // Display updated details
            displayMethod.invoke(empInstance);  // Output: Employee Name: John Doe, Salary: 7000

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
Explanation of Code:
Load the class: We use Class.forName("Employee") to load the Employee class.
Constructor and Object Creation: We retrieve the constructor using getConstructor() and create a new instance of Employee using newInstance().
Invoke Public Method: The public display() method is invoked dynamically using Method.invoke().
Access Private Field: We access the private salary field using getDeclaredField() and modify its value.
Invoke Private Method: The private method incrementSalary() is invoked dynamically after making it accessible.
Use Cases of Reflection:
Developing IDEs, debuggers, or frameworks (e.g., Spring, Hibernate).
Working with libraries and frameworks that need to inspect annotations and metadata at runtime.
Caution:
Reflection is a powerful tool but should be used with caution as it can:

Break encapsulation (e.g., accessing private members).
Impact performance as it requires additional computations.
Lead to security vulnerabilities if used improperly.*/