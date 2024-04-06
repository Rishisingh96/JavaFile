package com.Java.Exception_Handling;

import java.util.Scanner;
import java.util.InputMismatchException;
public class R_81_InputMismatchException {
        public static void main(String rishi[]){
            Scanner sc = new Scanner(System.in);

            try{
                System.out.println("Enter value to get square value : ");
                Integer a = sc.nextInt();
                System.out.println(a*a);
            }

	// Why we are not take InputMismatchException)
        catch(InputMismatchException ex){
		 System.out.println("Error:  InputMismatchException ");
		 System.out.println(ex);
	}

            System.out.println("\n\nRishi singh");
        }
}
