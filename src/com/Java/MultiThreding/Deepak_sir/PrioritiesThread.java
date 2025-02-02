package com.Java.MultiThreding.Deepak_sir;
//1.JVM provide the priority to each Thread to these priorities JVM allocate the processor
//2.Protiry are reprereted in the form of integer value which range from 1-10
//1 -> MIN_PRIORITY
//5->NORM_PRIORITY
//10 ->MAX_PRIORITY
//bellow or not the priority
//0, <1, >10 , Minimum_proroty....
//3.Method: public final void setPririty(int value)  , public final int getPriority()
//4.Nature - Priorities are inherited from
//Defalult : Parent thread
//5: By default main thread priotity is 5
//6: if pririty value is not in b/w 1-10 , then it will throw run thime exception ig. IlligalArgumentException
//8. Priority not support on the window
public class PrioritiesThread  extends Thread{
    public void run(){
        System.out.println("child thread");
        System.out.println("child thread Priority: "+Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        System.out.println("Main Thread old Priority: "+ Thread.currentThread().getPriority());

//        Thread.currentThread().setPriority(10);
        // 1-10 between if we take value ofter 1-10 show error
//        Thread.currentThread().setPriority(MIN_PRIORITY);  //1
//        Thread.currentThread().setPriority(NORM_PRIORITY); //5
        Thread.currentThread().setPriority(MIN_PRIORITY); //10
        System.out.println("Main thread new Priority :  " + Thread.currentThread().getPriority());
        PrioritiesThread pt = new PrioritiesThread();
        pt.start();
    }
}
