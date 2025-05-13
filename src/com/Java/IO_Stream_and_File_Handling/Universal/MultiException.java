package com.Java.IO_Stream_and_File_Handling.Universal;
import java.util.Scanner;

public class MultiException {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int []st = {4,5,23,65,12};
        int index;
        float n;
        System.out.println("Enter your index : ");
        index = in.nextInt();

        System.out.println("Enter your number: ");
        n = in.nextInt();
        try {
            System.out.println(st[index] / n);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Your index range out or Array");
        }catch (ArithmeticException e){
            System.out.println("Your number divide by Zero please give me valid number");
        }
    }
}
