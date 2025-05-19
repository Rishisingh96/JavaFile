package com.Java.IO_Stream_and_File_Handling.SerializeAndDeserialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializePerson {
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        // Create a input file object.
        File file = new File("India/Java.txt");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        // Deserialize or read objects of Person class.
        Person p = (Person)ois.readObject();
        // Displaying objects that are read from file.
        System.out.println("Name: " +p.name);
        System.out.println("Age: " +p.age);
        // Print the input path of the file.
        System.out.println("Data are read from " +file.getAbsolutePath());
    }
}

