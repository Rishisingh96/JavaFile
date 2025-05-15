package com.Java.IO_Stream_and_File_Handling.StreamClass;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Q21_Writer {
    public static void main(String[] args) throws IOException {
        // Writer is an abstract class that is used to write characters to a stream
        // It is the superclass of all classes that write character streams
        // It provides methods to write characters, arrays, and strings to a stream
        // Example usage:
        /*try (Writer writer = new FileWriter("India/Writer.txt")) {
            writer.write("Hello, World!");
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        Writer writer = new FileWriter("India/RishiCode.txt");
        String data = "Hello, World!";
//        writer.write(data);
        writer.append(data);
        writer.close();

        System.out.println("Data written to file successfully.");
    }
}
/*	1. FileWriter
	2. BufferedWriter
	3. CharArrayWriter
	4. FilterWriter
	5. PrintWriter
	6. StringWriter
	7. PipeWriter
*/