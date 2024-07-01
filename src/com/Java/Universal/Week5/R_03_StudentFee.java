package com.Java.Universal.Week5;

interface StudentFee {
    void printFees(int fees) throws IllegalArgumentException;
}

class Student implements StudentFee {
    @Override
    public void printFees(int fees) throws IllegalArgumentException {
        if (fees < 0) {
            throw new IllegalArgumentException("Fees cannot be negative.");
        }
        System.out.println(STR."Fees: \{fees}");
    }
}

public class R_03_StudentFee {
    public static void main(String[] args) {
        Student student = new Student();
        try {
            student.printFees(50000); // Valid case
            student.printFees(-1000); // This will throw IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

/*Here is a simplified version of your code to meet the requirements:

```java
package com.Java.Universal.Week5;

interface StudentFee {
    void printFees(int fees) throws IllegalArgumentException;
}

class Student implements StudentFee {
    @Override
    public void printFees(int fees) throws IllegalArgumentException {
        if (fees < 0) {
            throw new IllegalArgumentException("Fees cannot be negative.");
        }
        System.out.println("Fees: " + fees);
    }
}

public class R_03_StudentFee {
    public static void main(String[] args) {
        Student student = new Student();
        try {
            student.printFees(50000); // Valid case
            student.printFees(-1000); // This will throw IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
```

### Explanation:
1. **Interface `StudentFee`**:
   - Declares the method `printFees(int fees)` which can throw an `IllegalArgumentException`.

2. **Class `Student`**:
   - Implements the `StudentFee` interface.
   - Overrides the `printFees` method to check if the `fees` parameter is valid.
   - Throws `IllegalArgumentException` if `fees` are negative.
   - Prints the `fees` if they are valid.

3. **Class `R_03_StudentFee`**:
   - Contains the `main` method where an instance of `Student` is created.
   - Demonstrates a valid `fees` value and an invalid `fees` value, catching and handling the `IllegalArgumentException`.*/