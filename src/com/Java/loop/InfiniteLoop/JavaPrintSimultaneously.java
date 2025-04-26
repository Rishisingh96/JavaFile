package com.Java.loop.InfiniteLoop;
/* Let’s create a Java program where we will initialize two variables in the for statement and will display numbers from 1 to 5 and 5 to 1 simultaneously. */
public class JavaPrintSimultaneously {
    public static void main(String[] args) {
        int i, j;
        // Initialize i to 1 and j to 5 in the for loop.
        for (i = 1, j = 5; i <= 5; i++, j--) {
            System.out.println(i + "\t" + j);
        }
    }
}
