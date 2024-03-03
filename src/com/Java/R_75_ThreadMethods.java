package com.Java;
class MyThread1 extends Thread{
    public void run(){
        int i = 0;
        while(i<100) {
            System.out.println("Thanks Rishi singh.");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        int i=0;
        while(i<100) {
            System.out.println("Sorry Rishi singh");
            try{
                Thread.sleep(455);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            i++;
        }
    }
}
public class R_75_ThreadMethods {
    public static void main(String args[]){
     MyThread1 t1 = new MyThread1();
     MyThread2 t2 = new MyThread2();
     t1.start();
     try{
         t1.join();
     }
     catch (Exception e){
         System.out.println(e);
     }
     t2.start();
    }
}
