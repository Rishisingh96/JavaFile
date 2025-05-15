package com.Java.IO_Stream_and_File_Handling.StreamClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Q25_PrintWriter {
    public static void main(String[] args) {
        // PrintWriter is a subclass of Writer class
        // It is used to write formatted text to a file
        // It is used to write data to a file in a human-readable format
        // It is used to write data to a file in a specific format
        // It is used to write data to a file in a specific encoding
        // It is used to write data to a file in a specific character set
        // It is used to write data to a file in a specific locale

        // Specify the file name and path
        String filePath = "India/FileWriter.txt";
        try {
            // Creating a PrintWriter object for the file.
            // This also creates the file if it doesn't exist.
            PrintWriter writer = new PrintWriter(new File(filePath));
            // Writing some text to the file using println(), which adds a newline at the end.
            writer.println("Hello, this is an example of PrintWriter.");
            // Using print() method, it does not add a newline at the end
            writer.print("This is the same line as before, ");
            writer.println("and now it ends.");
            // Using printf() for formatted text, similar to System.out.printf()
            writer.printf("This is a formatted number: %.2f", 123.456789);
            // It's always important to close the PrintWriter to free resources and flush the output to the file.
            writer.close();
            System.out.println("Writing to the file '" + filePath + "' completed successfully.");
        } catch (FileNotFoundException e) {
            System.err.println("An error occurred while trying to write to the file: " + e.getMessage());
        }

        // Additional example - Append mode: Write without removing previous data
        try {
            // Using FileWriter with append=true
            PrintWriter writer = new PrintWriter(new FileWriter(filePath, true));
            writer.println(); // for line separation
            writer.println("This is appended content using PrintWriter in append mode.");
            writer.println("This line will not overwrite the previous content.");
            writer.close();
            System.out.println("Appending to the file '" + filePath + "' completed successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while trying to append to the file: " + e.getMessage());
        }
    }
}
