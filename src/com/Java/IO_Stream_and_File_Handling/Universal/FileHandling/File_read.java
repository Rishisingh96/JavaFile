
package com.Java.IO_Stream_and_File_Handling.Universal.FileHandling;
import java.io.File;

public class File_read {
    public static void main(String args[]) {
        // TODO code application logic here
        
        File file = new File("Rishicode.txt");
//        if(file.canWrite()){
//            System.err.println("File is Writable.");
//      }else{
//            System.err.println("File is not writable.");
//        }
        if(file.canRead()){
            System.err.println("File is readable.");
        }
        else{
            System.err.println("file is not readable........");
        }
      
    }
}
