package com.Java.Exception_and_File_Handling.Universal.FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

public class Buffer_Read_Write {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = null;

        try {
//            fileReader = new FileReader("India/Buffer_Reader.txt");
//            bufferedReader = new BufferedReader(fileReader);
            bufferedReader = new BufferedReader(new FileReader("India/Buffer_Reader.txt"));

            //Time Write
            Date startTime = new Date();
            Date endTime = new Date(startTime.getTime() + 60 * 1000);
            System.out.println("Test started at " + startTime + "\nThe test will end at " + endTime);

            String line;
            while ((line = bufferedReader.readLine()) !=null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println(STR."File not found : \{e.getMessage()}");
        } catch (IOException e) {
            System.err.println(STR."Error reading file : \{e.getMessage()}");
        } finally {
            bufferedReader.close();
           // fileReader.close();
        }

    }
}
