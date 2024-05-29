package com.Java_8_17_21.lamdaExpresstion.Universal;


@FunctionalInterface
interface intern {
    public void p1();
}

class Demo implements intern {
    public void p1() {
        System.out.println("Hello p1");
    }
}
public class lambdaExpression {
    public static void main(String[] args) {
        // Demo obj = new Demo();
        // intern obj = new Demo(); // This is called as //functional interface. intern
        // is a refrence of interface
        // obj.p1();

        // using lambda expression
        intern obj = () -> System.out.println("lamda expression");
        obj.p1();
    }
}
