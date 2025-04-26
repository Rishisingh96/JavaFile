package com.Java.loop.NestedForLoop;

public class PrintCharacterAtoE {
    public static void main(String[] args) {
        System.out.println("Displaying alphabet pattern:");
        //method 1: to display the pattern
        //Outer loop
        for(int i=65; i<=69; i++){
            //Inner loop
            for (int j = 65; j<=i; j++){
                char ch = (char)j;
                System.out.print(ch+" ");
            }
            System.out.println(" ");
        }

       //method 2: to display the pattern


    }
}
