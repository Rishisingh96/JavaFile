package com.Java.IO_Stream_and_File_Handling;

import java.io.File;

public class File_Deletion {
    public static void main(String[] args) {
        File file = new File("students.txt");
        if (file.delete()) {
            System.out.println("Deleted Successfully: " + file.getName());
        } else {
            System.out.println("Error......");
        }

    }
}
