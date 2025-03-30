package com.interviewQuestion_DSA_Java.Queue.Question;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumberCode {

    // Function to generate and print binary numbers from 1 to N
    public static void generateBinaryNumbers(int N) {
        Queue<String> queue = new LinkedList<>();
        queue.add("1");

        // Loop until we generate all binary numbers up to N
        for (int i = 1; i <= N; i++) {
            String binary = queue.poll(); // Get the front of the queue
            System.out.print(binary + " "); // Print the binary number

            // Generate next two binary numbers and add them to the queue
            queue.add(binary + "0");
            queue.add(binary + "1");
        }
    }

    public static void main(String[] args) {
        int N = 5; // Example input
        generateBinaryNumbers(N);
    }
}
