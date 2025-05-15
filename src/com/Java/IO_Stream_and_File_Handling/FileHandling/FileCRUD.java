package com.Java.IO_Stream_and_File_Handling.FileHandling;

import java.io.*;
import java.util.*;

public class FileCRUD {
    static final String FILE_NAME = "India/Java.txt";

    // Create - Add a new user record to the file
    public static void createUser(String id, String name) throws IOException {
        FileWriter writer = new FileWriter(FILE_NAME, true); // append mode
        writer.write(id + "," + name + "\n");
        writer.close();
        System.out.println("User added successfully!");
    }

    // Read - Display all user records from the file
    public static void readUsers() throws IOException {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            System.out.println("No records found.");
            return;
        }

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        System.out.println("User Records:");
        while ((line = reader.readLine()) != null) {
            String[] data = line.split(",");
            if (data.length == 2) {
                System.out.println("ID: " + data[0] + ", Name: " + data[1]);
            }
        }
        reader.close();
    }

    // Update - Modify the name of the user with given ID
    public static void updateUser(String id, String newName) throws IOException {
        File inputFile = new File(FILE_NAME);
        File tempFile = new File("temp.txt");

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

        String line;
        boolean updated = false;

        while ((line = reader.readLine()) != null) {
            String[] data = line.split(",");
            if (data.length == 2 && data[0].equals(id)) {
                writer.write(id + "," + newName + "\n");
                updated = true;
            } else {
                writer.write(line + "\n");
            }
        }

        writer.close();
        reader.close();

        inputFile.delete();                // delete original file
        tempFile.renameTo(inputFile);     // rename temp to original

        if (updated) {
            System.out.println("User updated successfully!");
        } else {
            System.out.println("User with ID " + id + " not found.");
        }
    }

    // Delete - Remove a user by ID
    public static void deleteUser(String id) throws IOException {
        File inputFile = new File(FILE_NAME);
        File tempFile = new File("temp.txt");

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

        String line;
        boolean deleted = false;

        while ((line = reader.readLine()) != null) {
            String[] data = line.split(",");
            if (data.length == 2 && data[0].equals(id)) {
                deleted = true; // skip writing this line
                continue;
            }
            writer.write(line + "\n");
        }

        writer.close();
        reader.close();

        inputFile.delete();                // delete original
        tempFile.renameTo(inputFile);     // rename temp file to original

        if (deleted) {
            System.out.println("User deleted successfully!");
        } else {
            System.out.println("User with ID " + id + " not found.");
        }
    }

    // Main method to test CRUD
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- File Handling CRUD Menu ---");
            System.out.println("1. Create User");
            System.out.println("2. Read All Users");
            System.out.println("3. Update User");
            System.out.println("4. Delete User");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter User ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter User Name: ");
                    String name = scanner.nextLine();
                    createUser(id, name);
                    break;
                case 2:
                    readUsers();
                    break;
                case 3:
                    System.out.print("Enter User ID to Update: ");
                    String uid = scanner.nextLine();
                    System.out.print("Enter New Name: ");
                    String newName = scanner.nextLine();
                    updateUser(uid, newName);
                    break;
                case 4:
                    System.out.print("Enter User ID to Delete: ");
                    String did = scanner.nextLine();
                    deleteUser(did);
                    break;
                case 0:
                    System.out.println("Exiting the application...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 0);

        scanner.close();
    }
}

