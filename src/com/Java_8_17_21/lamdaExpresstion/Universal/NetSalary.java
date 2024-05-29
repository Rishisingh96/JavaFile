package com.Java_8_17_21.lamdaExpresstion.Universal;

import java.util.Scanner;

interface Sal {
    int netSalary(int BS);
}

public class NetSalary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Basic Salary:");
        int BS1 = in.nextInt();

        Sal obj = (BS) -> {
            int HRA = (BS * 20 / 100);
            int DA = (BS * 10 / 100);
            int PF = (BS * 10 / 100);
            int TotalSalary = BS + (HRA + DA - PF);
            return TotalSalary;
        };

        int totalSalary = obj.netSalary(BS1);
        System.out.println("Total Salary: " + totalSalary);
    }
}
