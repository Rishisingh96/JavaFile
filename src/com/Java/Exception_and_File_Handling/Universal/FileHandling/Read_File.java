package com.Java.Exception_and_File_Handling.Universal.FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Read_File {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        // File Write
       /* System.out.println("Enter your String :");
        String name = in.nextLine();
        byte[] ch = name.getBytes();
        FileOutputStream file1= null;
//      file1 =new FileOutputStream("India/RishiCode.txt",true); // save previous Value
        file1 =new FileOutputStream("India/RishiCode.txt");
        file1.write(ch);
        System.out.println("File is Created and Save....");
        file1.close();
*/
         // File read
        int st;
        FileInputStream file = null;
        file = new FileInputStream("India/RishiCode.txt");
        /*st = file.read();
        System.out.println((char)st);
*/
        while ((st = file.read())!=-1){
            System.out.print((char) st);
        }
    }
}
