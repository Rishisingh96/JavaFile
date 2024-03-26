package com.lamdaExpresstion.Multithreding;
//package com.lambdaExpression.Multithreading;

public class ThreadDemo {
    public static void main(String[] args) {
        // Define your thread logic
        java.lang.Runnable thread1 = new java.lang.Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("Value of i is " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        // Create a Thread using the correct implementation of Runnable
        Thread t = new Thread(thread1);
        t.setName("JOHN");
        t.start();

        java.lang.Runnable t2 =()->{
            try {
                for (int i=1;i<=10;i++){
                    System.out.println(i*2);
                    Thread.sleep(2000);
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        };
        Thread t23 = new Thread(t2);
        t23.start();
    }
}
