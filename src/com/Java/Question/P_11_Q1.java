package com.Java.Question;
class MyThread_1 extends Thread{
	public void run(){
		int i  = 0;
		while(i<=100){
			System.out.println( "Good Moring" );
			i++;
		}
	}
}
class MyThread_2 extends Thread{
	public void run(){
	  int i = 0;
	  while(i<=100){
		System.out.println("Welcome");
		i++;
	  }
	}
}
public class P_11_Q1{	
	public static void main(String args[]){	
	MyThread_1 t1 = new MyThread_1();
	MyThread_2 t2 = new MyThread_2();
	t1.start();
	t2.start();
	}
}
