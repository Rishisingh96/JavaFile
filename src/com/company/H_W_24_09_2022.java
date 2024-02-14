package com.company;
import java.util.Scanner;
public class H_W_24_09_2022 {
    static public void main(String args[]){
    // Condition Operator
        System.out.println("Enter your number for check Even Odd");
        Scanner c = new Scanner(System.in);
        int a = c.nextInt();
        String k =(a % 2 ==0)?"Even": "Odd";
    //    String k = (a%2==0)?System.out.println("Even number"):System.out.println("odd number");
        System.out.println(k);
    }

}
