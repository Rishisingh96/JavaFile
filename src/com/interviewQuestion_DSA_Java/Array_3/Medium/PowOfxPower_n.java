package com.interviewQuestion_DSA_Java.Array_3.Medium;

public class PowOfxPower_n {
    public static void main(String[] args) {
        double x = 2.00000;
        int n = 10;
        System.out.println(myPow(x, n));
    }

    private static double myPow(double x, int n) {
        long binaryForm = n;

        if (n < 0) {
            x = 1 / x;
            binaryForm = -binaryForm;
        }
        double ans = 1;

        while (binaryForm > 0){
            if(binaryForm % 2 == 1){
                ans = ans * x;
            }
            x = x * x;
            binaryForm = binaryForm / 2;
        }
        return ans;
    }
}
