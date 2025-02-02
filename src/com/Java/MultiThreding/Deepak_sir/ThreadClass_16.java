package com.Java.MultiThreding.Deepak_sir;

//1.interrupted() method is use for check wether a thread is interrupted or not.
//isInterrupted() method is used to check wether a thread is interrupted or not
//2.interrupt() method class the interrupted status from true or false

public class ThreadClass_16 extends Thread{
    public void run(){
    try {

    }catch (Exception e){
        System.out.println("Thread interrupt");
    }
    }
    public static void main(String[] args) {
        ThreadClass_16 tc = new ThreadClass_16();
    }
}
