package com.Java.Exception_and_File_Handling.Universal.FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

class upper_lower_useBufferWriter {
    void File1_String() throws IOException {
        File file = new File("Rishi.txt");

        if (file.exists()) {
            System.out.println("File already exists..........");
        } else {
            try {
                if (file.createNewFile()) {
                    System.out.println("File created successfully ........");
                }
            } catch (IOException e) {
                System.err.println("Error while creating file: " + e.getMessage());
            }
        }

        // Using StringWriter to write long character data
        StringWriter sw = new StringWriter();
        sw.write("This is some sample text for StringWriter.\n" +
                "What is Compile time polymorphism (Static polymorphism)?\n" +
                "A polymorphism where object binding with methods happens at compile time is called static polymorphism or compile-time polymorphism.\n" +
                "In static polymorphism, the behavior of the method is decided at compile-time based on the parameters or arguments of the method.\n" +
                "How to achieve or implement static polymorphism in Java?\n" +
                "Static polymorphism can be achieved by method overloading. Other examples of compile time polymorphism are constructor overloading and method hiding.\n");

        System.out.println("\nData in StringWriter: \n" + sw.toString());

        // Writing content of StringWriter to a file using FileWriter
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(sw.toString());
            System.out.println("Data written to the file successfully.");
        } catch (IOException e) {
            System.err.println("Error while writing to file: " + e.getMessage());
        }

        // Convert the content to uppercase
        String upperContent = sw.toString().toUpperCase();
        File f2 = new File("file2_UpperC.txt");
        if (f2.createNewFile()) {
            System.out.println("file2_UpperC.txt created successfully.");
        }

        // Writing the uppercase content to file2_UpperC.txt
        try (FileWriter fwUpper = new FileWriter(f2)) {
            fwUpper.write(upperContent);
            System.out.println("Uppercase content written to file2_UpperC.txt successfully.");
        } catch (IOException e) {
            System.err.println("Error while writing to file2_UpperC.txt: " + e.getMessage());
        }

        System.out.println(upperContent);

        // Convert the content to lowercase
        String toLowerCase = sw.toString().toLowerCase();
        File f3 = new File("file2_LowerCase.txt");
        if (f3.createNewFile()) {
            System.out.println("file2_LowerCase.txt created successfully.");
        }

        // Writing the lowercase content to file2_LowerCase.txt
        try (FileWriter fwLower = new FileWriter(f3)) {
            fwLower.write(toLowerCase);
            System.out.println("Lowercase content written to file2_LowerCase.txt successfully.");
        } catch (IOException e) {
            System.err.println("Error while writing to file2_LowerCase.txt: " + e.getMessage());
        }

        System.out.println(toLowerCase);
    }

    public static void main(String[] args) {
        upper_lower_useBufferWriter fileThread = new upper_lower_useBufferWriter();
        try {
            fileThread.File1_String();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
