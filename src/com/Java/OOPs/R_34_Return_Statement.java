package com.Java.OOPs;

public class R_34_Return_Statement {
    //	Program code 1:
    int square(int num) {
        return num * num; // return a square value.
    }

    ///
    // Declare a method with return type int.
    int m1()
    {
        System.out.println("m1 method");
        // If you declare a method to return a value, you must return a value of declared type.
        // Since the return type of m1() method is an integer. So, we will have to return an integer value.
        return 20;
    }
    // Similarly,
    float m2()
    {
        System.out.println("m2 method");
        return 20.5f;
    }
    // Static method.
    static char m3()
    {
        System.out.println("m3 method");
        return 'd';
    }
    public static void main(String[] args)
    {
        // Create an obejct of class Test.
        R_34_Return_Statement t = new R_34_Return_Statement();

        // Call the method using object reference variable.
        // Since the return type of this method is int, we will store it using a variable of type int.
      //  int squareOfNumber = t.square(20);

        // Displaying the result.
      //  System.out.println("Square of 20: " + squareOfNumber);

// Program 2
        // Call m1() method using reference variable s.
        // Since s.m1() is returning an integer value, we will store value by using a variable x with a data type int.
        int x = t.m1();
        // Now print the return value.
        System.out.println("Return value of m1()= " +x);
        // Similarly,
        float y = t.m2();
        System.out.println("Return value of m2()= " +y);
// Call static method using the class name.
        // Since m3() method returns character, we will store a character using a variable ch with type char.
        char ch = R_34_Return_Statement.m3();
        System.out.println("Return value of m3()= " +ch);


    }

}
