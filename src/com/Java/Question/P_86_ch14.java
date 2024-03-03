package com.Java.Question;
import java.util.Scanner;
public class P_86_ch14 {
    public static void main(String args[]){
//        problem 1
        // Syntex error - int i = 9
        //Logical Error -
       /* int age = 70;
        int  Born_Date = 2000-79;*/
        // Runtime Error
      //  System.out.println(60/0);  // ArithmeticException

        /*/Problem 2
        try {
            int a = 50;
            int b = 3;
            System.out.println(a/b);
        }
        catch (IllegalArgumentException e){
            System.out.println(" HeHe ");
        }
        catch (ArithmeticException e){
            System.out.println("HaHa");
        }*/

        //Problem 3
        boolean flag = true ;
        int i=0 ;
        int marks [] = new int[3];
        marks[0]= 34;
        marks[1]= 4;
        marks[2]= 44;
        Scanner sc = new Scanner(System.in);
        int index;
        while(flag && i<5){
            try {
                System.out.println("Enter the valid Index : ");
                index = sc.nextInt();
                System.out.println("your number is marks[index] = " + marks[index]);
                break;
            }
            catch (Exception e){
                //System.out.println(e);
                System.out.println("Invalid Input ");
                i++;
            }
            if(i>=5){
                System.out.println("Error");
            }
        }
    }
}
