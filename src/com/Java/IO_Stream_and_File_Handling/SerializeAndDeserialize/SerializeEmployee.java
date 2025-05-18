package com.Java.IO_Stream_and_File_Handling.SerializeAndDeserialize;

import java.io.*;


public class SerializeEmployee {
    public static void main(String[] args) throws IOException {
        // Create an object of Employee class.
        Employee emp = new Employee();
        // Sending values to variables.
        emp.name = "Shubh";
        emp.id = 12345;
        emp.salary = 35000.00f;
        emp.doj = "30-07-2021";
        emp.address = "Dhanbad";
// Create an object of FileOutputStream class to connect objfile.txt file.
        FileOutputStream fos = new FileOutputStream("India/Python.txt" , true);

        // Create an object of ObjectOutputStream class to connect with fos.
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // Call writeObject() method of ObjectOutputStream class.
        oos.writeObject(emp);
        oos.flush();
        oos.close();
        System.out.println("Serialization is done successfully...");

    }
}
