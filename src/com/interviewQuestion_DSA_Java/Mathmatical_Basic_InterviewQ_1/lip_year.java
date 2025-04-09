package com.interviewQuestion_DSA_Java.Mathmatical_Basic_InterviewQ_1;

import java.util.Scanner;

public class lip_year {
    public static boolean inLeapYear(int lip){
        // Leap year is divisible by 4, except for years divisible by 100,
        // unless the year is also divisible by 400.
        return (lip % 4==0 && lip % 100!=0)||(lip % 400 ==0);
    }
    public static void main(String[] args) {
        System.out.println("Enter your year");
        Scanner sc = new Scanner(System.in);
        int lip = sc.nextInt();
        if (inLeapYear(lip)){
            System.out.println("this is lep year");
        }
        else {
            System.out.println("not leap year");
        }
    }
}
//Notes.md
/*Certainly! Let's use the example of the year 2023 to explain whether it's a leap year or not according to the rules:

Divisible by 4: We first check if 2023 is divisible by 4. When we divide 2023 by 4, we get a remainder. In this case, 2023 is not divisible by 4, as 2023 ÷ 4 equals 505 with a remainder of 3.

yaml
Copy code
2023 ÷ 4 = 505 remainder 3
Not Divisible by 100: Since 2023 is not divisible by 4, we do not need to proceed further to check for divisibility by 100.

Not Divisible by 400: Similarly, since 2023 is not divisible by 4, we also don't need to check for divisibility by 400.

Based on the rules for leap years, as stated in the program, 2023 is not a leap year because it fails the first condition, being not divisible by 4. Therefore, when you run the program with the input 2023, it will output:

csharp
Copy code
2023 is not a leap year.
This demonstrates how the program works and why it determines that 2023 is not a leap year.*/