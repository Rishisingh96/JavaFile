package com.company;
import java.util.Scanner;
/*class MismatchInput extends Exception{
    public String toString(){
        return "Mismatch Error";
    }
    public String getMassage(){
        return "Mismatch Error pleas Enter correct value";
    }
}*/
public class R_85_finallyQ1 {

   // public static int FinallyBlock() throws MismatchInput{
    public static int FinallyBlock(){
        // int i;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value");
            int n = sc.nextInt();

            for (int i = 0; i <= n; i++) {
               // System.out.println("En");
                System.out.println(i);
             //   i++;

                if (i == 8) {
                    System.out.println(i);
                    break;
                }
            }
        }
        // 1. We can use Finally key ofter try
        catch (Exception e){
           // System.out.println("MismatchInput Error");
            System.out.println("MismathInput");
            System.out.println(e);
        }
       finally
        {
            System.out.println("Try to Execute using Finally keyword");
        }
        return 0;
    }

    public static void main(String[] args) {
    FinallyBlock();
    }
}
