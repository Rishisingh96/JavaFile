package com.Java.IO_Stream_and_File_Handling.FileHandling;

import java.io.File;

public class DeleteFileExample {
    public static void main(String[] args) {
        // Specify the file path
        File file = new File("India/example.txt");

        // Delete the file
        if (file.delete()) {
            System.out.println("File '" + file.getName() + "' deleted successfully.");
        } else {
            System.out.println("Failed to delete the file. File may not exist or is in use.");
        }
    }
}
