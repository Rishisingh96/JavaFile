package com.Java.IO_Stream_and_File_Handling.Universal.FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class chekIdenticalorNot {
    public static void main(String[] args) throws IOException {
        // File Write1
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your 1st String :");
        String name = in.nextLine();
        byte[] ch = name.getBytes();

        // Create and write to the first file
        FileOutputStream file1 = new FileOutputStream("India/Rishifirst.txt");
        file1.write(ch);
        System.out.println("File is Created and Save....");
        file1.close();

        // File Write2
        System.out.println("Enter your 1st String :");
        String name2 = in.nextLine();
        byte[] ch2 =name2.getBytes();

        //Create and Write to second file
        FileOutputStream file2 = new FileOutputStream("India/Rishisecond.txt");
        file2.write(ch2);
        System.out.println("File is Created and Save....");
        file2.close();

        //Check 2 file are same or not
        String string = " ";
        if(name.equals(name2)){
            string = "Your content is Equal.............";
        }
        else {
            string = "Your content is not Equal.......";
        }

        byte[] bytes = string.getBytes();

        //Create and Write to third file
        FileOutputStream file3 = new FileOutputStream("India/Indore1/RishiSave.txt");
        file3.write(bytes);
        System.out.println(string);
        file3.close();
    }
}
