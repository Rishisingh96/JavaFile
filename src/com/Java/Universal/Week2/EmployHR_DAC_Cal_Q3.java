package com.Java.Universal.Week2;

import java.util.Scanner;

public class EmployHR_DAC_Cal_Q3 {
    public static void main(String[] args) {
        int basicSalary, HRA, DA, totalSalary;
        System.out.println("Enter your Basic Salary:");
        Scanner in = new Scanner(System.in);
        basicSalary = in.nextInt();

        if (basicSalary < 1500) {
            HRA = (basicSalary * 10 / 100);
            DA = (basicSalary * 90 / 100);
        } else {
            HRA = 500;
            DA = basicSalary * 98 / 100;
        }
        totalSalary = basicSalary + HRA + DA;
        System.out.println("HRA: " + HRA);
        System.out.println("DA: " + DA);
        System.out.println("Total Salary: " + totalSalary);
    }
}

/*

3. In a company an employee is paid as given below:
1) If basic salary of employee is less than Rs. 1500 , then HRA = 10% of basic
salary and DA = 90 % of basic salary
2) If basic salary is greater tan or equal to Rs. 1500 , then HRA = Rs. 500 and
DA = 98% of basic salary
Accept basic salary as input and calculate HRA , DA AND Total Salary
of employee
*/