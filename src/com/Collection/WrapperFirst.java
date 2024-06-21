package Wrapper_Class;
public class WrapperFirst {
    public static void main(String args[]) {
//     int a1 = 10;   // This is primtive DataType  UnBoxing
//     Integer I = 10;   // Wrapper class
//     Integer x = I.intValue();
//     Integer I1 = new Integer(10);  //AutoBoxing
//     Integer I3 = new Integer(I.intValue());  //Boxing
//     Integer I2 = new Integer(a);  //AutoBoxing
//     
//     if(a1==I){  // ofter compare I auto convert in UnBoxing
//         System.out.println("Same value");
//     }
//     else{
//         System.out.println("Diffrent value");
//     }
//     
//     if(I==x){
//         System.out.println("Same value");
//     }
//     else{
//         System.out.println("Diffrent value");
//     }
//     
//     if(I1==I3){ // refrence is diffrence
//         System.out.println("Same value");
//     }
//     else{
//         System.out.println("Diffrent value");
//     }
//     if(I1==I2){
//         System.out.println("Same value");
//     }
//     else{
//         System.out.println("Diffrent value");
//     }
//     
//     if(I==I1){
//         System.out.println("Same value");
//     }
//     else{
//         System.out.println("Diffrent value");
//     }
     
     // Using Integer wrapper class
Integer num = new Integer(10); // Wrapping int value 10

int a = num.intValue(); // Unwrapping to get the primitive int value
System.out.println("Value of num: " + num);
System.out.println("Unwrapped value of num: " + a);

// Auto-boxing and unboxing (automatic conversion between primitive and wrapper types)
Integer b = 20; // Auto-boxing: int to Integer
int c = b; // Auto-unboxing: Integer to int

System.out.println("Value of b: " + b);
System.out.println("Value of c: " + c);


Integer x = 5;
x++; // This creates a new Integer object with value 6, x still references the old object.
System.out.println("Value of x: " + x);
    }
    
// 6. Conversion and Parsing:   
 String numStr = "123";
Integer num = Integer.valueOf(numStr); // Convert string to Integer
int parsedNum = Integer.parseInt(numStr); // Parse string to int

}

/*
In Java, a wrapper class is a class that wraps (encapsulates) the primitive data type and provides utility methods for easy manipulation of the data. Essentially, it allows primitive types to be used as objects. The primary reasons for using wrapper classes include:

1. **Object Representation**: Java is an object-oriented programming language where everything is treated as an object. However, primitive data types (like int, float, char, etc.) are not objects. Wrapper classes provide a way to treat them as objects.

2. **Generics**: Generics in Java typically require objects rather than primitives. Wrapper classes are often used when working with collections (like ArrayList, HashMap) or other generic classes that require object types.

3. **Null Values**: Wrapper classes can represent null values, whereas primitive types cannot. This is useful in situations where a value may be absent or unknown.

4. **Methods for Data Manipulation**: Wrapper classes provide methods to parse and convert data, compare values, and perform various utility functions not available directly with primitive types.

### Example Use of Wrapper Classes:

Let's consider the `Integer` wrapper class as an example:

```java
// Using Integer wrapper class
Integer num = new Integer(10); // Wrapping int value 10

int a = num.intValue(); // Unwrapping to get the primitive int value
System.out.println("Value of num: " + num);
System.out.println("Unwrapped value of num: " + a);

// Auto-boxing and unboxing (automatic conversion between primitive and wrapper types)
Integer b = 20; // Auto-boxing: int to Integer
int c = b; // Auto-unboxing: Integer to int

System.out.println("Value of b: " + b);
System.out.println("Value of c: " + c);
```

### Explanation:

- **Wrapper Creation**: `Integer num = new Integer(10);` creates an Integer object wrapping the primitive `int` value 10.
- **Unwrapping**: `int a = num.intValue();` extracts the primitive `int` value from the `Integer` object `num`.
- **Auto-boxing and Unboxing**: Java automatically converts between primitive types and their corresponding wrapper classes when needed (`Integer b = 20;` and `int c = b;`).

### Commonly Used Wrapper Classes:

Java provides a wrapper class for each primitive data type:
- `Integer` for `int`
- `Double` for `double`
- `Boolean` for `boolean`
- `Character` for `char`
- `Byte` for `byte`
- `Short` for `short`
- `Long` for `long`
- `Float` for `float`

These classes are part of the `java.lang` package and are implicitly imported into every Java program, making them readily available.

### Usage in Java:

Wrapper classes are widely used in Java programming whenever there is a need to:
- Store primitive data types in collections that require objects (like `ArrayList<Integer>`).
- Represent nullable values (e.g., when dealing with databases or optional user inputs).
- Utilize methods provided by wrapper classes for data manipulation and comparison.

In summary, wrapper classes in Java facilitate the use of primitive data types as objects and provide additional utility methods, making them essential in various programming scenarios.

*/
