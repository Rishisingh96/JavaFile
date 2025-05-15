package com.Java.IO_Stream_and_File_Handling.FileHandling;

import java.io.File;
import java.io.IOException;

public class Q28_FileInJava {
    public static void main(String[] args) throws IOException {
        // File class is used to create, delete, and manage files and directories
        // It is part of the java.io package
        // The File class represents a file or directory path in the file system

    /*    // Creating a File object
        java.io.File file = new java.io.File("India/example.txt");

        // Checking if the file exists
        if (file.exists()) {
            System.out.println("File exists.");
        } else {
            System.out.println("File does not exist.");
        }

        // Creating a new file
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (java.io.IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }*/

        File file = new File("India/myfile.txt");
        if(file.exists()){
            System.out.println("File Already Exists.........");
        }
        else{
            try{
                file.createNewFile();
                System.out.println("File Created successfully........");
            }catch(Exception e){
                System.err.println("File Not Created.........");
            }
        }

        // Use File class methods on File object.
        System.out.println("Does myfile.txt exist? " + file.exists());
        System.out.println("File name: " +file.getName());
        System.out.println("File size in bytes: " +file.length());

        System.out.println("Path: " +file.getPath());
        System.out.println("Absolute path: " +file.getAbsolutePath());
        System.out.println("Canonical path: " +file.getCanonicalPath());

        System.out.println("Parent: " +file.getParent());
        System.out.println("Free space: " +file.getFreeSpace());

        System.out.println("Is myfile.txt a file? " + file.isFile());
        System.out.println("Is myfile.txt a directory? " + file.isDirectory());
        System.out.println("Is myfile.txt hidden? " + file.isHidden());

        System.out.println("Can myfile.txt be read? " + file.canRead());
        System.out.println("Can myfile.txt be written? " + file.canWrite());
        System.out.println("Last modified on " +new java.util.Date(file.lastModified()));
    }
}
