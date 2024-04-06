package com.Java.Exception_Handling;
import java.util.Scanner;
public class R_81_HandSpecificE{
    public static void main(String rishi[]){
        Scanner sc = new Scanner(System.in);
        int marks[]= new int[3];
        //int marks[3];

        marks[0] = 10;
        marks[1] = 40;
        marks[2] = 60;

        System.out.println("Enter index number: ");
        int ind = sc.nextInt();

        System.out.println("Enter the value for divide index value: ");
        int num = sc.nextInt();
        try{
            System.out.println("Your index value of marks  = "+ marks[ind]);
            System.out.println("your Divide is = " + marks[ind]/num);
        }
        catch(ArithmeticException e){
            System.out.println("Error : ArithmeticException ");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error : ArrayIndexOutOfBoundsException: ");
            System.out.println(e);

        }

/*
	// Why we are not take InputMismatchException)
        catch(InputMismatchException e){
		 System.out.println("Error:  InputMismatchException ");
		 System.out.println(e);
	}
*/
        catch(Exception e){
            System.out.println("Other Exception occur");
            System.out.println(e);
        }

        System.out.println("\n\nRishi singh");
    }
}
