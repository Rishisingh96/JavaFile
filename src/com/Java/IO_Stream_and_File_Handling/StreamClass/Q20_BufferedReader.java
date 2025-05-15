package com.Java.IO_Stream_and_File_Handling.StreamClass;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q20_BufferedReader {
    public static void main(String[] args) throws IOException {
        String path = "India/Buffer_Reader.txt";
        // BufferedReader is used to read text from a character input stream
        // It uses a buffer to read data in chunks, which makes it more efficient than reading one character at a time
        // It can be used to read data from character files (like .txt files) and convert it to character streams
        // Example usage:
        FileReader fileReader = new FileReader(path);

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String lineOfText;
        while ((lineOfText = bufferedReader.readLine()) != null) {
            System.out.println(lineOfText);
        }

    }
}
