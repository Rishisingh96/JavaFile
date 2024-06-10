package com.Java.Exception_and_File_Handling.Universal;

public class NullPointerEx {
    public static void main(String[] args) {
        String string = null;
//        String string = "Rishi";
        try {
            System.out.println(string.length());
        }catch (NullPointerException e){
            System.out.println("String is not Initialized");
        }
    }
}
