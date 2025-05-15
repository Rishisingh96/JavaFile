package com.Java.IO_Stream_and_File_Handling.StreamClass;

import java.io.*;

public class ReaderExample {
    public static void main(String[] args)
    {
        try {

            // Create an object of Reader class and pass path of filename.
            Reader reader = new FileReader("India/RishiPerson.txt");
            int data = reader.read();

            while (data != -1)
            {
                System.out.print((char) data);
                data = reader.read();
            }
            System.out.println("\n");
            System.out.println("Does myfile.txt support mark operation: " +reader.markSupported());
            reader.close(); // Closing reader stream.
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
