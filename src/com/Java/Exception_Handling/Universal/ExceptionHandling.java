package com.Java.Exception_Handling.Universal;
import java.io.*;
import java.util.Scanner;
import java.io.IOException;
public class ExceptionHandling  {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in); 
        System.out.println("Enter your Name");
       String file = sc.nextLine();
       File f = new File(file);
      if(f.exists()){
          System.err.println("Your file is exist........");
      }
      else
      {
          try{
       f.createNewFile();
              System.err.println("Your File is Created.......");
       }catch(IOException e){
           System.out.println("File Error.........");
       }
      }
    }
}
