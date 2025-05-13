package com.Java.IO_Stream_and_File_Handling.Universal.FileHandling;
import java.io.*;
import java.io.IOException;

public class File_Exception {
    public static void main(String[] args) throws IOException {
          String name;
          // Write String
         /* Scanner sc  = new Scanner(System.in);
          System.out.println("Enter your name: ");
          name = sc.nextLine();

          //FileWriter use for Writing String name

          FileWriter file = new FileWriter("India/FileWriter.txt");
          file.write(name);
          file.close();
          System.out.println("Your File is Created.........and Save data..........");*/

          //FileReader use for Reading files
          FileReader fr = new FileReader("India/FileWriter.txt");
          int ch;
          /*while((ch=fr.read())!=-1)
          {
//              System.out.println("Your ASCII value is "+ ch +" Your charactor = "+ (char)ch);
              System.out.print((char)ch);
          }*/

        while (true){
            ch = fr.read();
            if(ch==-1){
                System.out.println(STR."File readed com.........");
                break;
            }
            if(ch==-1){
                
            }
        }
    }
}
