package com.Java.Exception_Handling;
import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class File_Exception {
    public static void main(String[] args) throws IOException {
          String name;
          // Write String
         /* Scanner sc  = new Scanner(System.in);
          System.out.println("Enter your name: ");
          name = sc.nextLine();
        
          //FileWriter use for Writing String name
          
          FileWriter file = new FileWriter("Rishi/FileWriter.txt");
          file.write(name);
          file.close();
          System.out.println("Your File is Created.........and Save data..........");
    */
          //FileReader use for Reading files
          FileReader fr = new FileReader("Rishi/FileWriter.txt");
          int st;
          while((st=fr.read())!=-1)
          {
              System.out.println("Your ASCII value is "+ st +" Your charactor = "+ (char)st);
          }  
    }
}
