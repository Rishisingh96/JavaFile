package com.Java.IO_Stream_and_File_Handling.Universal.FileHandling;
import java.io.*;
public class FolderCreated {
    public static void main(String args[]) {
        // TODO code application logic here
        File file = new File("India");
        File file2 = new File("India/Indore1");
        File file3 = new File("India/Indore1/RishiCode1.txt");
//        try{
//        file.createNewFile();
//        }catch(IOException e){
//            System.err.println("File created........");
//        }
//        System.err.println(file.canWrite());

if(file.exists()){
    if(file2.exists()){
        System.err.println("File is esists.........");
    }
    
    else{
        file2.mkdir();
    }
    
}
else{
        file.mkdir();
    }

if(file3.exists()){
    System.err.println("File is alredy exist......");
}else{
    try{
        file3.createNewFile();
        System.err.println("File is Created.........");
        }catch(IOException e){
            System.err.println("File is Created.........");
        }
}

   }
}

