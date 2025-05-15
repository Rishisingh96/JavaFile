package com.Java.IO_Stream_and_File_Handling.StreamClass;

import java.io.FileWriter;
import java.io.IOException;

public class Q23_FileWriter {
    public static void main(String[] args) throws IOException {
        // FileWriter class is used to write character files
        // It inherits Writer class
        // It makes it possible to write data to a file in the form of characters
        // It is used to create a file if it does not exist
        // If the file already exists, it will overwrite the file

       /* // Create a FileWriter object to open the file.
        FileWriter fw = new FileWriter("India/RishiCode.txt");
        // To write text to the file, call write() method inherited from Writer class.
        fw.write("Welcome to Scientech Easy \n"); // Writing text to the file.
        fw.write("I love Java Programming");

        fw.close(); // Closing the file.
        System.out.println("Successfully written...");*/

        //Example 2
        String string[] = {"Hello Rishi How are you", "Print Hello World", "Java is a object Orentend Programming language", "Programming"};

        FileWriter fw1 = new FileWriter("India/RishiCode.txt");
        for (int i = 0; i < string.length; i++) {
            fw1.write(string[i]); // Writing text to the file.
            fw1.write("\n");
        }
        fw1.close(); // Closing the file.
        System.out.println("Successfully written...");
    }
}
