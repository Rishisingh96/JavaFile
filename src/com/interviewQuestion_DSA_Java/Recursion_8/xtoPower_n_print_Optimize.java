package com.interviewQuestion_DSA_Java.Recursion_8;

public class xtoPower_n_print_Optimize {
    public static int optimizedPower(int a, int n) {
        if (n == 0) {
            return 1;
        }

        int halfPower = optimizedPower(a,n/2);   // Optimized code
        int halfPowerSq = halfPower * halfPower;    // O(logn)

        //or
        // but not optimized this line -           // O(n)
        //int halfPowerSq = optimizedPower(a, n / 2) * optimizedPower(a, n / 2);  //This code is not optimized because this line

        //n is odd
        if (n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }
        public static void main (String[] args){
            int x = 2;
            int y = 5;
            System.out.println(optimizedPower(x,y));
        }

    }