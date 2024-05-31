package com.interviewQuestion_DSA_Java.String_3.All_method;

public class indexOf
{
    public static void main(String[] args) {

        String str = "Hello, world!";

        // Find the index of the first occurrence of 'o'
        int index1 = str.indexOf('o');
        System.out.println("Index of 'o': " + index1); // Output: 4

        // Find the index of the first occurrence of 'o' starting from index 5
        int index2 = str.indexOf('o', 5);
        System.out.println("Index of 'o' starting from index 5: " + index2); // Output: 8

        String str1 = "Hello, world!";

        // Find the index of the first occurrence of "world"
        int index3 = str1.indexOf("world");
        System.out.println("\nIndex of 'world': " + index3); // Output: 7

        // Find the index of the first occurrence of "world" starting from index 8
        int index4 = str1.indexOf("world", 8);
        System.out.println("Index of 'world' starting from index 8: " + index4); // Output: -1
    }
}
