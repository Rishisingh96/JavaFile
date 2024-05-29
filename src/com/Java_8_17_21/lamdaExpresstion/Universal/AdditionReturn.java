package com.Java_8_17_21.lamdaExpresstion.Universal;
@FunctionalInterface
interface Addc
{
    int add(int a, int b );
}
public class AdditionReturn {
    public static void main(String[] args) {
        Addc ob = (a,b)->(a+b);
        int res = ob.add(56,4);
        System.out.println("sum= "+res);
    }
}
