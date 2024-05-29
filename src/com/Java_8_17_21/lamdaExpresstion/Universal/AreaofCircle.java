package com.Java_8_17_21.lamdaExpresstion.Universal;

interface Are {
    double circle(double r);
}

public class AreaofCircle {
    public static void main(String[] args) {
        Are ob = (r) -> 3.14 * r * r;
        double res = ob.circle(8.8);
        System.out.println(res);
    }
}
