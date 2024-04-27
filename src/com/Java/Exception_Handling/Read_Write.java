package com.Java.Exception_Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read_Write {
    public static void main(String[] args) {
        try {
            File file = new File("students.txt");
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error.....");
            e.printStackTrace();
        }

    }
}
