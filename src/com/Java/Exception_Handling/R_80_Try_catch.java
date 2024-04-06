package com.Java.Exception_Handling;
import java.util.Scanner;
public class R_80_Try_catch {
    public static void main(String args[]){
        System.out.println("I am handling some exception :");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st value :");
        int x = sc.nextInt();
        System.out.print("Enter second value :");
        int y = sc.nextInt();
        try{
            System.out.println("your Divide is = "+ x/y);
        }
        catch(Exception e){
            System.out.println("Some exception Occur ArithmeticException");
            System.out.println(e);
        }
    }
}
