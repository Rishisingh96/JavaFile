package com.interviewQuestion_DSA_Java.String_3.All_method;

import java.util.Scanner;

public class PrintFirstName_split {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your full name:");
        String fullName = in.nextLine();

        // Split the full name into parts based on spaces
        String[] nameParts = fullName.split(" ");

        // Print the first part of the name
        if (nameParts.length > 0) {
            System.out.println("First name: " + nameParts[0]);
        } else {
            System.out.println("No name provided");
        }
    }

}
