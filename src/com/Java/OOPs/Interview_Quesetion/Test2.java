package com.Java.OOPs.Interview_Quesetion;

public class Test2  //private class Test2 or protected class Test2 //Modifier 'protected' not allowed here //Modifier 'private' not allowed here
{
    Test2() {
        this(20);
        System.out.println("One");
    }
    Test2(int i) {
        this(null);
        System.out.println("Two");
    }
    Test2(Test2 test) {
        System.out.println("Three");
    }
   public static void main(String[] args)
    {
        new Test2();
    }
}
//Dry run
/*Let's dry run your code:

1. **Class Definition**:
    ```java
    package com.Java.OOPs.Interview_Quesetion;

    public class Test2 {
        Test2() {
            this(20);
            System.out.println("One");
        }
        Test2(int i) {
            this(null);
            System.out.println("Two");
        }
        Test2(Test2 test) {
            System.out.println("Three");
        }
        public static void main(String[] args) {
            new Test2();
        }
    }
    ```

2. **Explanation**:
    - You have a class named `Test2` with three constructors:
        1. The first constructor is a no-argument constructor. Inside this constructor, another constructor with an integer parameter is called (`this(20)`), and then "One" is printed.
        2. The second constructor takes an integer as a parameter. Inside this constructor, another constructor with a `Test2` object as a parameter is called (`this(null)`), and then "Two" is printed.
        3. The third constructor takes a `Test2` object as a parameter and prints "Three".
    - In the `main` method:
        - A new instance of `Test2` is created using the no-argument constructor.

3. **Dry Run**:
    - `main` method is invoked.
    - A new instance of `Test2` is created using the no-argument constructor.
        - Inside the no-argument constructor:
            - The constructor with an integer parameter is called (`this(20)`).
                - Inside this constructor:
                    - The constructor with a `Test2` object as a parameter is called (`this(null)`).
                        - Inside this constructor:
                            - "Three" is printed.
                    - "Two" is printed.
            - "One" is printed.
    - The `main` method completes its execution.

4. **Output**:
    ```
    Three
    Two
    One
    ```

So, the output of your code will be "Three", "Two", and "One" in that order. This happens because constructors are called in a chained manner, starting from the outermost constructor and proceeding to the innermost constructor.
*/