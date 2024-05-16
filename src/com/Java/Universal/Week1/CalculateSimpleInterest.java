package com.Java.Universal.Week1;

import java.util.Scanner;

public class CalculateSimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p, r, t, SI;
  /*..Simple Interest = (P � R � T)/100
  where P = Principal Amount, R = Rate per Annum, T = Time (years)  ..*/
        System.out.println("Enter your number :\nprincipal(P):\nrate of interest(R):\ntime (in Year)(T)\n");
        p = in.nextInt();
        r = in.nextInt();
        t = in.nextInt();
        SI = (p * r * t) / 100;
        System.out.println("Simple interest : " +SI);
    }
}

/*Enter your number :
principal(P):
rate of interest(R):
time (in Year)(T)

70000
10
2
Simple interest : 14000
*/
