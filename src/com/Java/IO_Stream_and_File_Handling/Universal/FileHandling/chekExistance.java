package com.Java.IO_Stream_and_File_Handling.Universal.FileHandling;
import java.io.*;
public class chekExistance {
    public static void main(String args[]) {
        File f1 = new File("Navraj1.txt");
        if(f1.exists())
            System.out.println("File is alredy exist..........");
        else
        {
            try
            {
                f1.createNewFile();
                System.err.println("File Created ........");
                    }catch(IOException e)
                    {
                        System.err.println("File Created.........");
                    }
        }
        }
}
