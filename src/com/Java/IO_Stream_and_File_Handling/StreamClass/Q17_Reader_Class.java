package com.Java.IO_Stream_and_File_Handling.StreamClass;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Q17_Reader_Class {
    public static void main(String[] args)  {
        try{
            String path = "India/RishiCode.txt";
            Reader reader = new FileReader(path);
            int data = reader.read(); // Read one character at a time
            while(data != -1){
                System.out.println((char)data); // Print the character
                data = reader.read(); // Read the next character
            }
            System.out.println("\n");
            System.out.println("Does RishiCode mark opration:" + reader.markSupported());// check if mark operation is supported MarkSupported is used to check if the mark operation is supported by the reader
            reader.close(); // Close the reader
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
/*
    // Reader class is an abstract class in Java that is used to read character streams.
    // It is part of the java.io package and provides methods for reading characters, arrays, and lines.
    // The Reader class is the superclass of all classes that read character streams.
    // Some of the commonly used subclasses of the Reader class include:
    // 1. FileReader
    // 2. BufferedReader
    // 3. CharArrayReader
    // 4. StringReader
    // 5. PipedReader
    // 6. FilterReader
    // 7. PushbackReader
    // 8. URLReader
    // 9. LineNumberReader
*/