package com.Java.Exception_Handling.Universal;
public class Exception extends Throwable {
    public static void main(String args[]) {
    String st = "60.";
    int result;
    try{
        result = Integer.parseInt(st)*2;
        System.out.println(STR."Result : \{result}");
    }catch(NumberFormatException e){
    System.out.println("String is incorrect.");
    System.out.println("How are you Rishi.");
    System.out.println("I am fine.");
    }
    }
}
