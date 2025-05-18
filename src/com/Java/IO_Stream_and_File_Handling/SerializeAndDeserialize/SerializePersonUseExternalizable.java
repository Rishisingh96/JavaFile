package com.Java.IO_Stream_and_File_Handling.SerializeAndDeserialize;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.DoubleSummaryStatistics;

public class SerializePersonUseExternalizable  {
    public static void main(String[] args) throws IOException {
        Person person = new Person();
        person.name = "Shubh";
        person.age = 25;

        File file = new File("India/Java.txt");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(person);
        oos.flush();
        oos.close();
        System.out.println("Serialization is done successfully...");

        // Print the output path of the file.
        System.out.println("Data are written to: " +file.getAbsolutePath());

    }
}
