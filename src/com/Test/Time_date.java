package com.Test;

import java.util.Scanner;

public class Time_date {
    public static void main(String[] args) {
      /*  4. Program that accepts number of days as integer value and display total
        number of years , months and days in it.*/

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Days");
         int days = in.nextInt();

        int years = days / 365;
        int remainingDays = days % 365;


        int months = remainingDays / 30;
        days = remainingDays % 30;



        System.out.println("Your Year of Days " + years);
        System.out.println("your Month "+months);
        System.out.println("your A Day "+remainingDays);
    }
}
