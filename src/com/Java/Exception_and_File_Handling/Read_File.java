package com.Java.Exception_and_File_Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read_File {
    public static void main(String[] args) {
        try {
            // Specify the correct file path
            File file = new File("Teachers.txt");

            // Create a Scanner object to read the file
            Scanner myReader = new Scanner(file);

            // Read and print the lines from the file
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }

            // Close the scanner
            myReader.close();
        } catch (FileNotFoundException e) {
            // Provide a meaningful error message and print stack trace
            System.out.println("File not found. Please check the file path and try again.");
            e.printStackTrace();
        }
    }
}
