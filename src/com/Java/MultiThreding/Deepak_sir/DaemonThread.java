package com.Java.MultiThreding.Deepak_sir;
//Definition : Which run in the background of anohter thread
//Use - It provide service to the threads
//Eg - Garbage Collector finalizer , Attech Listeners , Single dispatcher etc
//Method : - a- public final void setDaemon(boolean b)
//b- public final boolean isDaemon()
public class DaemonThread extends Thread
{
    public DaemonThread(String name){
        super(name);
    }
    public void run()
    {
       // System.out.println(" demon thread " + Thread.currentThread().isDaemon());
        // Checking whether the thread is Daemon or not
        if(Thread.currentThread().isDaemon())
        {
            System.out.println(" demon thread ");
        }
        else
        {
            System.out.println(" is User thread");
        }
    }
    public static void main(String[] args)
    {
      //  Thread.currentThread().setDaemon(true); //error show
        System.out.println("main thread");
        DaemonThread t1 = new DaemonThread("t1");
        DaemonThread t2 = new DaemonThread("t2");
        DaemonThread t3 = new DaemonThread("t3");
        // Setting user thread t1 to Daemon
     //   t1.setDaemon(true);
        // starting first 2 threads
//        t1.start();
//        t2.start();
        // Setting user thread t3 to Daemon
//        t3.setDaemon(true);
//        t3.start();
        //by deepak sir

        t1.setDaemon(true);
        t1.start();
       // t1.setDaemon(true); // show error
    }
}

//case 1: we have to create daemon thread before starting the thread if we create daemon thread ofter starting it will throw run-time exception eg-IlligalThredException
//case 2 : We cannot create mai Thread of daemon thread
//7. Demon nature : It inherites nature properties from it parent thread
//9. Most of thre time  , Daemon thread low proority but we can chage it priority according to need