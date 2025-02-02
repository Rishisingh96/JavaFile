package com.Java.MultiThreding;
class myThread extends Thread{
    public myThread (String name) {
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
        myThread t1 = new myThread("Rishi singh (most Important)");
        myThread t2 = new myThread("Rishi singh 2");
        myThread t3 = new myThread("Rishi singh 3");
        myThread t4 = new myThread("Rishi singh 4");
        myThread t5 = new myThread("Rishi singh 5");
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
