package com.Java.Universal.Week1;

import java.util.Scanner;

/*4. Program that accepts number of days as integer value and display total
number of years , months and days in it.*/
public class showYear_month_Day {
        public static void main (String[]args){
            Scanner in = new Scanner(System.in);
            System.out.println("Enter your Days:");
            int days = in.nextInt();

            // Calculate years, handling cases where days is less than a year
            int years = days / 365;
            int remainingDays = days % 365;

            // Calculate months, considering remaining days from the year calculation
            int months = remainingDays / 30;
            days = remainingDays % 30; // Update days to reflect remaining days after months

            System.out.println("Your days is :" + days);
            System.out.println("Your years is :" + years);
            System.out.println("Your months is :" + months);



             /*  public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          System.out.println("Enter your Days.");
          int days = in.nextInt();
          int year = days / 365;
          int month = days / 12;
          System.out.println("Your days is :" + days);
          System.out.println("Your years is :" + year);
          System.out.println("Your month is :" + month);
      }*/
        }
    }


