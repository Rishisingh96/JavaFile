package com.Java.IO_Stream_and_File_Handling.StreamClass;

import java.io.FileReader;

public class Q19_FileReader {
    public static void main(String[] args) {
        // FileReader is a subclass of InputStreamReader
        // It is used to read character files
        // It uses the platform's default charset to decode bytes into characters
        // It can be used to read data from character files (like .txt files) and convert it to character streams

        // Example usage:
        /*try (FileReader reader = new FileReader("India/RishiCode.txt")) {
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        try{
            FileReader fr = new FileReader("India/RishiCode.txt");
            int i;
            while ((i=fr.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println("\n");
            fr.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
