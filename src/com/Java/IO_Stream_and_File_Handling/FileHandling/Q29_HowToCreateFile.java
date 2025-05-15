package com.Java.IO_Stream_and_File_Handling.FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Q29_HowToCreateFile {
    public static void main(String args[]) throws IOException {
       /*Ways to Create a File in Java
    In Java, there are three ways to create a file. They are as follows:
	1. Using File.createNewFile() method
	2. Using FileOutputStream class
	3. By using File.createFile() method
    Let’s understand all ways one by one with the help of example programs.
    */

        // Using 1. File.createNewFile() method
        /*File file = new File("India/Python.txt");
        if (file.exists()) {
            System.out.println("File Already Exists.........");
        } else {
            try {
                file.createNewFile();
                System.out.println("File Created successfully........");
            } catch (Exception e) {
                System.err.println("File Not Created.........");
            }
        }*/

//2nd way
        // Using FileOutputStream class
         /*FileOutputStream fos = new FileOutputStream("India/Python.txt");
         fos.write("Hello World".getBytes());
         fos.close();
         System.out.println("File Created successfully........");*/

         //3rd way  create file Creating Path instance.
        Path path = Paths.get("D:\\javaprogramfile.txt");
        try {
            Path p = Files.createFile(path); // creating a file at specified location.
            System.out.println("File created successfully at location: " +p);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
