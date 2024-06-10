package com.Java.Exception_and_File_Handling.Universal.FileHandling;

import java.io.*;
import java.util.Scanner;

public class count_S_Task2 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        // File Write (Optional: Uncomment if you want to write to the file)
        /*
        System.out.println("Enter your String :");
        String name = in.nextLine();
        byte[] ch = name.getBytes();
        FileOutputStream file1 = new FileOutputStream("India/RishiCode.txt");
        file1.write(ch);
        System.out.println("File is Created and Saved....");
        file1.close();
        */

        // File read
        int st;
        FileInputStream file = null;
        file = new FileInputStream("India/RishiCode.txt");

        int count = 0;
        int totalASCII_V= 0;

        while ((st = file.read()) != -1) {
            count++;
            totalASCII_V+=st;
            System.out.print((char) st);
        }
        file.close();

        // Convert count to a string and then to bytes
//        String countString = "Total Characters: " + count +"\nTotal ASCII Value: " + totalASCII_V;
        String countString = STR."Total Characters: \{count}\nTotal ASCII Value: \{totalASCII_V}";
        byte[] outputBytes = countString.getBytes();

        // Write count to the second file
        FileOutputStream file2 = new FileOutputStream("India/Indore1/RishiAnsSave.txt");
        file2.write(outputBytes);
        System.out.println("\nFile is Created and Count is Saved");
        file2.close();
    }
}


/*The syntax you're referring to looks similar to the string interpolation or templating syntax found in some programming languages such as Python, JavaScript (ES6), and C#. However, in Java, this specific syntax is not natively supported. Instead, Java has its own ways of formatting strings, such as using the `String.format()` method or the `MessageFormat` class.

To achieve similar functionality in Java, you can use `String.format()` or concatenation. Here’s how you can do it:

### Using `String.format()`
```java
String outputString = String.format("Total Characters: %d\nTotal ASCII Value: %d", count, totalASCII_V);
```

### Using Concatenation
```java
String outputString = "Total Characters: " + count + "\nTotal ASCII Value: " + totalASCII_V;
```

### Explanation of STR and \{\}
- **STR**: This isn't a standard Java feature. It might be from a custom library or might be a mistake if you're used to another programming language with such a feature.
- **\{\}**: In many languages, this syntax is used for string interpolation, where the expression inside `{}` is evaluated and included in the string. However, in Java, you would use `String.format` or concatenation as shown above.

### Complete Example

Here's how you can use `String.format()` in your specific context:

```java
package com.Java.Exception_and_File_Handling.Universal.FileHandling;

import java.io.*;

public class CountSTask1 {
    public static void main(String[] args) throws IOException {
        // Ensure directories exist
        new File("India").mkdir();
        new File("India/Indore1").mkdir();

        // File read
        int st;
        FileInputStream file = null;

        file = new FileInputStream("India/RishiCode.txt");

        int count = 0;
        int totalAsciiValue = 0;
        while ((st = file.read()) != -1) {
            count++;
            totalAsciiValue += st;
            System.out.print((char) st);
        }
        file.close();

        // Format the output string
        String outputString = String.format("Total Characters: %d\nTotal ASCII Value: %d", count, totalAsciiValue);
        byte[] outputBytes = outputString.getBytes();

        // Write the count and totalAsciiValue to the second file
        FileOutputStream file2 = new FileOutputStream("India/Indore1/RishiAnsSave.txt");
        file2.write(outputBytes);
        System.out.println("\nFile is Created and Information is Saved");
        file2.close();
    }
}
```

This example uses `String.format()` to construct a formatted string that includes the total number of characters and the total ASCII value. This string is then converted to bytes and written to the output file.
*/