package com.Java.modifiers;

public class CommandLineArgumentsE {
    public static void main(String[] args) {
        //Check if any command line argument are passed
        if(args.length > 0){
            System.out.println("Command - Line argument are : ");
            for (int i = 0; i<args.length; i++){
                System.out.println("args[" + i + "]: " + args[i]);
            }
        }else {
            System.out.println("No command-line argument passed. ");
        }
    }
}
