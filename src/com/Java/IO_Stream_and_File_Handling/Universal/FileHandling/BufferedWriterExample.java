package com.Java.IO_Stream_and_File_Handling.Universal.FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedWriterExample {

    public static void main(String[] args) {
        String fileName = "example.txt";
        String content = "This is a sample text written using BufferedWriter.\n" +
                "BufferedWriter is efficient for writing text data to files.\n" +
                "It buffers the characters to provide efficient writing of single characters, arrays, and strings.";

        // Write content to the file using BufferedWriter
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
            System.out.println("Content written to file successfully.");
        } catch (IOException e) {
            System.err.println("Error while writing to file: " + e.getMessage());
        }

        // Read content from the file to verify
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("\nReading content from file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error while reading from file: " + e.getMessage());
        }
    }
}
