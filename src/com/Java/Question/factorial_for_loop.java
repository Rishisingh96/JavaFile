package com.Java.Question;

import java.util.Scanner;

public class factorial_for_loop {

        public static void main(String args[]) {

            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            input.close();
            // Write your code here
            long fact = 1;
            for(int i=1; i<=n;i++){
                fact *= i;
            }
            System.out.println(fact);

        }
    }

