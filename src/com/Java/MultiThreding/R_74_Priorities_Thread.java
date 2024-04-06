package com.Java.MultiThreding;
class MyThread extends Thread{
    public MyThread (String name) {
        super(name);
    }
    public void run(){
        int i = 0;
        while(i<40){
            System.out.println("thank you: "+ this.getName());
            i++;
        }
    }
}
public class R_74_Priorities_Thread {
    public static void main(String args[]){
        MyThread t1 = new MyThread("Rishi singh (most Importent)");
        MyThread t2 = new MyThread("Rishi singh 2");
        MyThread t3 = new MyThread("Rishi singh 3");
        MyThread t4 = new MyThread("Rishi singh 4");
        MyThread t5 = new MyThread("Rishi singh 5");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.NORM_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
       // t5.getPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

       // t5.start();

    }
}
