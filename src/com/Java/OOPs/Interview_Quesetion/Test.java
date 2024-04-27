package com.Java.OOPs.Interview_Quesetion;

public class Test {
  /*  Test() {
        System.out.println("Calling default constructor");
    }
    Test(Test test) {
        System.out.println("Calling parameterized constructor");
    }*/
    Test(Object object) {
        System.out.println("Hello");
    }
    Test(Test2 test) {
        System.out.println("World");
    }

    public static void main(String[] args) {
//        Test t = new Test(new Test());
        Test2 t = new Test2(null);

    }
}
//Dry run
/*Let's dry run your code:

1. **Class Definition**:
    ```java
    package com.Java.OOPs.Interview_Quesetion;

    public class Test {
        Test() {
            System.out.println("Calling default constructor");
        }
        Test(Test test) {
            System.out.println("Calling parameterized constructor");
        }

        public static void main(String[] args) {
            Test t = new Test(new Test());
        }
    }
    ```

2. **Explanation**:
    - You have a class named `Test` with two constructors: a default constructor and a parameterized constructor that takes an object of type `Test` as a parameter.
    - In the `main` method:
        - You're creating a new instance of `Test` using the parameterized constructor.
        - Inside the parameterized constructor, another instance of `Test` is being passed.

3. **Dry Run**:
    - `main` method is invoked.
    - A new instance of `Test` is created using the parameterized constructor.
        - This constructor takes another instance of `Test` as its parameter.
    - Inside the parameterized constructor, another instance of `Test` is created using the default constructor.
        - This results in the message "Calling default constructor" being printed.
    - After the inner `Test` object is created and the parameterized constructor completes its execution, the outer `Test` object's creation is also completed.
    - The message "Calling parameterized constructor" is printed.
    - The `main` method completes its execution.

4. **Output**:
    ```
    Calling default constructor
    Calling parameterized constructor
    ```

So, the output of your code will be "Calling default constructor" followed by "Calling parameterized constructor". This happens because the default constructor is invoked for the inner `Test` object, and then the parameterized constructor is invoked for the outer `Test` object.
*/

//Second code
/*Let's dry run your code:

1. **Class Definition**:
    ```java
    public class Test {
        Test(Object object) {
            System.out.println("Hello");
        }
        Test(Test test) {
            System.out.println("World");
        }

        public static void main(String[] args) {
            Test t = new Test(null);
        }
    }
    ```

2. **Explanation**:
    - You have a class named `Test` with two constructors:
        - The first constructor takes an object of type `Object` as a parameter and prints "Hello".
        - The second constructor takes an object of type `Test` as a parameter and prints "World".
    - In the `main` method:
        - You're creating a new instance of `Test` using the constructor that takes an `Object` as a parameter and passing `null` as the argument.

3. **Dry Run**:
    - `main` method is invoked.
    - A new instance of `Test` is created using the constructor that takes an `Object` as a parameter.
        - The message "Hello" is printed.
    - The `main` method completes its execution.

4. **Output**:
    ```
    Hello
    ```

So, the output of your code will be just "Hello". This happens because the constructor that takes an `Object` as a parameter is invoked, and "Hello" is printed. The constructor that takes a `Test` object as a parameter is not invoked because `null` is not an instance of `Test`.
*/