package com.company;
import java.util.Scanner;
public class R_13_string {
    public static void main(String[] arg){
        /*
        String name = new String("Rishi");
  //      String name = " Rishi ";
        System.out.print("The name is :");
        System.out.print(name);

        int a = 8;
        float b = 6.545f;
        System.out.printf("The value of a is %d and value of b is %.2f\n",a , b);
        System.out.printf("The value of a is %d and value of b is %8.2f\n",a , b);
        System.out.format("The value of a is %d and value of b is %f",a , b);
*/
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
//          String st = sc.next();   //This is print Rishi one word and all skip
          String st = sc.nextLine();  // print All word
          System.out.println(st);

    }
}
