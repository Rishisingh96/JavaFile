package com.Java.IO_Stream_and_File_Handling.SerializeAndDeserialize;

import java.io.*;

public class SerializeArray {
    public static void main(String[] args) throws IOException, IOException, ClassNotFoundException
    {
        int[ ] numbers = {10, 20, 30, 40, -50};
        String[ ] strings = {"John", "Shubh", "Deep", "Kim"};
// Create an output stream for file objfile.dat.
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("India/myfile.txt"));

// Write arrays to the object output stream.
        oos.writeObject(numbers); // write serialized array to file.
        oos.writeObject(strings); // write serialized array to file.

        oos.flush(); // flushing object output stream.
        oos.close(); // closing object output stream.

// Create an input stream for file objfile.dat.
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("India/myfile.txt"));
        int[ ] newNumbers = (int[])(ois.readObject()); // Reading array back from the file.
        String[ ] newStrings = (String[])(ois.readObject()); // Reading array back from the file.
        ois.close();
// Display arrays contents.
        for (int i = 0; i < newNumbers.length; i++)
            System.out.print(newNumbers[i] + " "); // Displaying array contents.
        System.out.println();

        for (int i = 0; i < newStrings.length; i++)
            System.out.print(newStrings[i] + " "); // Displaying array contents.
    }
}

