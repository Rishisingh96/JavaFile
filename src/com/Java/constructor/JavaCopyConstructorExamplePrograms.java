package com.Java.constructor;

//step : Create a class Number1
class Number1{
    //step2 : Declare instance variables
    int a = 10;
    int b = 20;

    //step3 : Create a default constructor
    Number1(){
        System.out.println("Default constructor");
    }

    // Step 8: Declare a copy constructor.
    Number1(Number1 n){
        System.out.println("Copy constructor");
        a = n.a;
        b = n.b;
    }
}
public class JavaCopyConstructorExamplePrograms {
    public static void main(String[] args) {
        // Step 4: Create an object of the class Number and print the value by calling variable a and b using reference variable.
        // We cannot directly call non-static member in the static region.
        // So we need to create an object of the class Number1 and then call the variable a and b using reference variable.
        Number1 n = new Number1();
        System.out.println("Value of a: " + n.a);
        System.out.println("Value of b: " + n.b);


        // Step 5: Now we are updating values of a and b in the existing object i.e existing memory location.
        n.a = 50;
        n.b = 100;
        System.out.println("Updated value of a: " + n.a);
        System.out.println("Updated value of b: " + n.b);

        // Step 6: But when we create a new object, we will not get updated values of a and b in the new object.
        // Take a look.
        Number1 n2 = new Number1();
        System.out.println("Not getting updated values of a and b in the new object");
        System.out.println("Value of a: " + n2.a);
        System.out.println("Value of b: " + n2.b);

        // Step 7: To get the updated values of a and b, create another new object and pass the reference variable n of an existing object.
        Number1 n3 = new Number1(n);
        System.out.println("Getting updated values of a and b in the new object");
        System.out.println("Value of a: " + n3.a);
        System.out.println("Value of b: " + n3.b);

    }
}
/*Sure! Let’s go through this code step by step, understanding each part and how it works. We will break down the flow of execution and explain what happens at each step.

Step 1: Create a class Number1
The code starts by defining a class Number1. This class will hold some instance variables and constructors.

java
Copy
Edit
class Number1 {
    int a = 10;
    int b = 20;
Instance Variables: a and b are instance variables of the Number1 class.

a is initialized to 10

b is initialized to 20

Step 2: Declare instance variables
In this step, the instance variables a and b are declared and initialized with values 10 and 20, respectively. These variables are accessible from all methods and constructors in the class.

Step 3: Create a default constructor
java
Copy
Edit
Number1() {
    System.out.println("Default constructor");
}
The constructor Number1() is a default constructor because it has no parameters. When an object of Number1 is created using this constructor, the message "Default constructor" will be printed.

Step 4: Create a copy constructor
java
Copy
Edit
Number1(Number1 n) {
    System.out.println("Copy constructor");
    a = n.a;
    b = n.b;
}
The copy constructor Number1(Number1 n) takes an object of type Number1 as an argument and initializes the new object’s a and b to the values of the existing object n.

When this constructor is called, the message "Copy constructor" will be printed.

Step 5: Main method execution
java
Copy
Edit
public class JavaCopyConstructorExamplePrograms {
    public static void main(String[] args) {
The main method is where the execution of the program begins. We will go step by step through the main method:

Step 6: Create an object of class Number1
java
Copy
Edit
Number1 n = new Number1();
System.out.println("Value of a: " + n.a);
System.out.println("Value of b: " + n.b);
Number1 n = new Number1(); creates a new object of type Number1. This calls the default constructor because no arguments are passed to it.

The constructor prints "Default constructor" to the console.

Now, the instance variables a and b in this object n are still set to their initial values: 10 and 20 respectively.

The following lines print:

less
Copy
Edit
Value of a: 10
Value of b: 20
Step 7: Update the values of a and b
java
Copy
Edit
n.a = 50;
n.b = 100;
System.out.println("Updated value of a: " + n.a);
System.out.println("Updated value of b: " + n.b);
Here, the values of a and b for object n are updated to 50 and 100 respectively.

The updated values are printed to the console:

less
Copy
Edit
Updated value of a: 50
Updated value of b: 100
Step 8: Create a new object n2 and print its values
java
Copy
Edit
Number1 n2 = new Number1();
System.out.println("Not getting updated values of a and b in the new object");
System.out.println("Value of a: " + n2.a);
System.out.println("Value of b: " + n2.b);
A new object n2 is created using the default constructor.

This means a new instance of Number1 is created with a = 10 and b = 20, the initial values.

The message "Not getting updated values of a and b in the new object" is printed.

Then, the following values are printed for the new object n2:

less
Copy
Edit
Value of a: 10
Value of b: 20
Explanation: Even though the values of a and b were updated in the previous object n, these updated values do not affect the new object n2. n2 starts with the default values of a = 10 and b = 20.

Step 9: Create another new object n3 using the copy constructor
java
Copy
Edit
Number1 n3 = new Number1(n);
System.out.println("Getting updated values of a and b in the new object");
System.out.println("Value of a: " + n3.a);
System.out.println("Value of b: " + n3.b);
Here, we create a new object n3 using the copy constructor and pass the object n to it. This means n3 will be initialized with the values of a and b from the object n.

The copy constructor prints "Copy constructor" to the console.

Then, a and b from n are copied into n3, so:

a = 50 (updated value from n)

b = 100 (updated value from n)

The following values are printed for n3:

less
Copy
Edit
Getting updated values of a and b in the new object
Value of a: 50
Value of b: 100
Final Flow Recap
First Object (n): Created with default constructor; a = 10, b = 20. Then, a and b are updated to 50 and 100.

Second Object (n2): Created with default constructor; a = 10, b = 20 (no updates from n).

Third Object (n3): Created using the copy constructor; a = 50, b = 100 (copied from n).

Summary of Outputs:
less
Copy
Edit
Default constructor
Value of a: 10
Value of b: 20
Updated value of a: 50
Updated value of b: 100
Default constructor
Not getting updated values of a and b in the new object
Value of a: 10
Value of b: 20
Copy constructor
Getting updated values of a and b in the new object
Value of a: 50
Value of b: 100
This is a detailed dry run of the code. Each step describes what happens and how the constructors interact with the object instances. Let me know if you need more clarifications!*/