package com.Java.Exception_and_File_Handling.Universal;

import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class WriteAndReadFile {
    public static void main(String[] args) {
        writeFile();
        readFile();
    }

    // Method to write content to the file
    public static void writeFile() {
        try {
            FileWriter file = new FileWriter("Teachers.txt");
            file.write("This file has information of Teachers\n");
            file.write("Name: Rosy Fernandes, Age: 36\n");
            file.write("Name: Isha Mheta, Age: 29\n");
            file.close();
            System.out.println("File has been written into.");
        } catch (IOException e) {
            System.out.println("Error......");
            e.printStackTrace();
        }
    }

    // Method to read content from the file
    public static void readFile() {
        try {
            FileReader file = new FileReader("Teachers.txt");
            BufferedReader reader = new BufferedReader(file);
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please check the file path and try again.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error reading the file.");
            e.printStackTrace();
        }
    }
}