
package com.Java.Exception_and_File_Handling.Universal.FileHandling;

import java.io.File;
import java.io.IOException;

public class deleteFile {
    public static void main(String args[]) {
        // TODO code application logic here
         File f1 = new File("Navraj1.txt");
        if(f1.exists())
        {
            f1.delete();
            System.out.println("File Deleted.........");
        }
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

