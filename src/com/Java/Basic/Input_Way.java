package com.Java.Basic;
import java.util.Scanner;
public class Input_Way {
    public static void main(String[] args) {
        // For input boolean
        System.out.println("Taking input from User");// short cut for - sout
        Scanner sc = new Scanner(System.in);
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
    }
}
