package com.Java.IO_Stream_and_File_Handling.StreamClass;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Q24_BufferedWriter {
    public static void main(String[] args) throws Exception {
        // Create an object of FileWriter class.
        FileWriter fw = new FileWriter("India/RishiCode.txt");

// Create an object of BufferedWriter class and reference variable fw to its constructor.
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("""
                package javaPackage;
                import java.io.BufferedWriter;
                import java.io.FileWriter;
                import java.io.IOException;
                public class BufferedWriterExample {
                public static void main(String[] args) throws IOException\s
                {
                // Create an object of FileWriter class.	
                   FileWriter fw = new FileWriter("D:\\\\myfile.txt");
                \s
                // Create an object of BufferedWriter class and reference variable fw to its constructor.
                   BufferedWriter bw = new BufferedWriter(fw);
                  \s
                   bw.write("This is an apple");
                   bw.newLine(); // For line separator.
                   bw.write("This is an orange");
                bw.close(); // Closing the stream.
                   System.out.println("File written successfully.");
                 }
                }
                
                """);
        bw.newLine(); // For line separator.
        bw.write("This is Second program");
        bw.newLine(); // For line separator.
        bw.write("package javaPackage;\n" +
                "import java.io.BufferedWriter;\n" +
                "import java.io.FileWriter;\n" +
                "import java.io.IOException;\n" +
                "public class BufferedWriterExample {\n" +
                "public static void main(String[] args) throws IOException \n" +
                "{\n" +
                " String[] strs = {\"New Delhi is the capital of India.\",\n" +
                "\t\t  \"Washington, D.C. is the capital of US.\",\n" +
                "\t\t  \"Canberra is the capital of Australia.\"\n" +
                " };\t\n" +
                "// Create an object of FileWriter class.\t\n" +
                "   FileWriter fw = new FileWriter(\"D:\\\\myfile.txt\");\n" +
                " \n" +
                "// Create an object of BufferedWriter class and reference variable fw to its constructor.\n" +
                "   BufferedWriter bw = new BufferedWriter(fw);\n" +
                "   \n" +
                "   for(int i = 0; i < strs.length; i++)\n" +
                "   {\n" +
                "      bw.write(strs[i]);\n" +
                "      bw.newLine();\n" +
                "   }\n" +
                "   bw.close(); // Closing the stream.\n" +
                "   System.out.println(\"File written successfully.\");\n" +
                " }\n" +
                "}\n");
        bw.close(); // Closing the stream.
        System.out.println("File written successfully.");


    }
}
