package com.Java.IO_Stream_and_File_Handling.StreamClass;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Q22_OutputStreamWriter {
    public static void main(String[] args) {
        // OutputStreamWriter is a bridge from character streams to byte streams
        // It uses the platform's default charset to encode characters into bytes
        // It can be used to write data to byte streams (like FileOutputStream) and convert it to character streams

        // Example usage:
        /*try (OutputStreamWriter writer = new OutputStreamWriter(System.out)) {
            writer.write("Hello, World!");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        String data = "Hello Rishi How are you !";

        try{
            FileOutputStream fos = new FileOutputStream("India/RishiCode.txt");
            // Create an object of OutputStreamWriter class and pass reference variable fos to its constructor.OutStreamWriter
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            osw.write(data); // Calling to write() method.
            osw.flush(); // Calling to flush() method.
            System.out.println("Data written to file successfully.");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
