package com.Java.IO_Stream_and_File_Handling.StreamClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q18_InputStreamReader {
    public static void main(String[] args) {
        // InputStreamReader is a bridge from byte streams to character streams
        // It uses the platform's default charset to decode bytes into characters
        // It can be used to read data from byte streams (like FileInputStream) and convert it to character streams

        // Example usage:
       /* try (InputStreamReader reader = new InputStreamReader(System.in)) {
            System.out.println("Enter some text: ");
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        try {
// Create an object of FileInputStream class and pass path of filename.
            FileInputStream fis = new FileInputStream("India/RishiCode.txt");

// Create an object of InputStreamReader class and pass reference variable fis to its constructor.
            InputStreamReader inStream = new InputStreamReader(fis);
            int data = inStream.read(); // Calling to read() method.
            while (data != -1) {
                System.out.print((char) data);
                data = inStream.read();
            }
            inStream.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
