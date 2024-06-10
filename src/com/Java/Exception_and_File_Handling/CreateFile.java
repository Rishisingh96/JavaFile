package com.Java.Exception_and_File_Handling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File myObj = new File("students.txt");
            if (myObj.createNewFile()) {
                System.out.println("Created Successfully: " + myObj.getName());
            } else {
                System.out.println("Sorry, File Exists.");
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
