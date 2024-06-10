package com.Java.Exception_and_File_Handling.Universal.FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Person_Name {
    public static void main(String[] args) throws IOException {
        // File Write
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your String :");
        String name = in.nextLine();
        byte[] ch = name.getBytes();

        // Create and write to the first file
        FileOutputStream file1 = new FileOutputStream("India/RishiPerson.txt");
        file1.write(ch);
        System.out.println("File is Created and Save....");
        file1.close();

        // Split the string to get the first name
        String[] firstName = name.split(" ");
        System.out.println(firstName.length);
        String firstNameToSave = "";
        if(firstName.length > 0){
            firstNameToSave = firstName[1];
            System.out.println(STR."First Name: \{firstNameToSave}");
        } else {
            System.out.println("No name provided");
        }

        // Write the first name to the second file
        FileOutputStream file2 = new FileOutputStream("India/Indore1/RishiAnsSave2.txt");
        byte[] st = firstNameToSave.getBytes();
        file2.write(st);
        file2.close();
        System.out.println("First name is saved in the file.");
    }
}
