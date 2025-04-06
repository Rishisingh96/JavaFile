package com.Java.DurgeshSir100DayCode;

public class printTable_Day36 {
    public static void printTable(int n) throws InterruptedException {
        for(int i=1; i<10; i++){
            System.out.println(n + "*" + i +" = " + n * i);
            Thread.sleep(200);
        }
    }
    public static void main(String[] args) throws InterruptedException {

        Runnable t1 = ()->{
            try {
                printTable(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable t2 = ()->{
            try {
                printTable(4);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        new Thread(t1).start();
        new Thread(t2).start();
//        printTable(3);
//        printTable(4);
        System.out.println(Thread.currentThread().getName());
    }
}
