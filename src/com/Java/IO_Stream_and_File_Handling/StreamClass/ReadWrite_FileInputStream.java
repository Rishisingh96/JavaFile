package com.Java.IO_Stream_and_File_Handling.StreamClass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadWrite_FileInputStream {
    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        String filePath = "India/RishiCode.txt"; // File ka location

        // ================================================
        // ✍️ 1. Writing to File using FileOutputStream
        // ================================================
        try {
            System.out.println("Enter a string to write to the file:");
            String inputText = in.nextLine(); // User se input lena

            byte[] byteArray = inputText.getBytes(); // String ko byte[] mein convert karna

            // FileOutputStream in overwrite mode (purani value hata dega)
            FileOutputStream fos = new FileOutputStream(filePath);

//          FileOutputStream fos = new FileOutputStream(filePath, true); // append mode (purani value ke aage likhega)

            fos.write(byteArray); // File mein likhna
            System.out.println("✅ File written successfully.");
            fos.close(); // Stream band karna
        } catch (Exception e) {
            System.out.println("❌ Error during writing: " + e);
        }

        // ====================================================
        // 📥 2. Reading ONE Byte only using FileInputStream
        // ====================================================
        System.out.println("\n++++++++++ Reading One Byte ++++++++++");
        try {
            FileInputStream fis = new FileInputStream(filePath); // File open for reading

            int singleByte = fis.read(); // Ek byte read karna
            if (singleByte != -1) {
                System.out.println("📦 Byte Value: " + singleByte);
                System.out.println("🔤 Character : " + (char) singleByte);
            } else {
                System.out.println("⚠️ File is empty.");
            }

            fis.close(); // Stream band karna
        } catch (Exception e) {
            System.out.println("❌ Error reading one byte: " + e);
        }

        // ======================================================
        // 📥 3. Reading MULTIPLE Bytes (Character by Character)
        // ======================================================
        System.out.println("\n++++++++++ Reading All Characters ++++++++++");
        try {
            FileInputStream fis = new FileInputStream(filePath); // File open for reading
            int value;

            while ((value = fis.read()) != -1) {
                System.out.print((char) value); // Byte ko character mein convert karke print
            }

            fis.close();
        } catch (Exception e) {
            System.out.println("❌ Error reading file: " + e);
        }

        // ==================================================================
        // 📦 4. Reading Each Byte with its Corresponding Character (Mix)
        // ==================================================================
        System.out.println("\n\n++++++++++ Reading Byte & Char Together ++++++++++");
        try {
            FileInputStream fis = new FileInputStream(filePath); // File open
            int val;

            while ((val = fis.read()) != -1) {
                // Mix output: byte + character dono
                System.out.println("Byte: " + val + " => Char: " + (char) val);
            }

            fis.close();
        } catch (Exception e) {
            System.out.println("❌ Error: " + e);
        }

        in.close(); // Scanner band karna
    }
}
