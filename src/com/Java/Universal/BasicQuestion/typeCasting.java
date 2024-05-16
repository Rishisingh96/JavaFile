package com.Java.Universal.BasicQuestion;

public class typeCasting {
    public static void main(String[] args) {
//    byte b = 200; // overflow size -128 to 127
    byte b = 20;
    int i;
    i=b;  // implicit
        System.out.println("Integer :" +i);
        System.out.println("byte :" +b);

    byte b1;
    int i1 = 60;
    //b1 = i1;  // b1<int so we're doing type cast forcefully set data in byte
    b1 = (byte) i1; //Explicit
        System.out.println(b1);
    }
}
/*In Java, typecasting refers to converting a value of one data type into another. There are two types of typecasting:

1. Implicit Typecasting (Widening Conversion):
   - Implicit typecasting occurs when the destination data type can hold all possible values of the source data type.
   - It is done automatically by the compiler.
   - There is no loss of data during implicit typecasting.

    byte -> short -> int -> long ->float -> double

   Example:
   ```java
   int numInt = 10;
   double numDouble = numInt; // Implicit typecasting from int to double
   System.out.println("numDouble: " + numDouble); // Output: 10.0
   ```

2. Explicit Typecasting (Narrowing Conversion):
   - Explicit typecasting occurs when the destination data type may not be able to hold all possible values of the source data type.
   - It must be done manually by the programmer using a cast operator.
   - There may be a loss of data during explicit typecasting.

    double -> float -> long -> int -> short -> byte

   Example:
   ```java
   double numDouble = 10.5;
   int numInt = (int) numDouble; // Explicit typecasting from double to int
   System.out.println("numInt: " + numInt); // Output: 10
   ```

Note: In explicit typecasting, there is a possibility of losing precision or information, especially when converting from a larger data type to a smaller one. Therefore, it should be used with caution, and the programmer should ensure that data loss is acceptable for the specific use case.
*/