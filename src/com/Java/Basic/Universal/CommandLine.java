package com.Java.Basic.Universal;

public class CommandLine {
    public static void main(String[] args) {
        if(args.length >= 2) {
            System.out.println("Given No is: " + args[0]);
            System.out.println("Given No is: " + args[1]);
        } else {
            System.out.println("Please provide at least two command-line arguments.");
        }
    }
}
/*PS E:\Universal-Task-assignment\Java\Datatype> javac CommandLine.java
PS E:\Universal-Task-assignment\Java\Datatype> java CommandLine 10 20
Given No is: 10
Given No is: 20
PS E:\Universal-Task-assignment\Java\Datatype>
*/