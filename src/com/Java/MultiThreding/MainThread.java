package com.Java.MultiThreding;

public class MainThread {
	public static void main(String args[]) {
		for(int i=1; i<=10; i++) {
			System.out.println("i="+i);
		}
		System.out.println(Thread.currentThread());  //Thread[main,5,main]
		System.out.println(Thread.currentThread().getName());   //main
		System.out.println(Thread.currentThread().getPriority());  //5
		Thread.currentThread().setPriority(10);   
		System.out.println(Thread.currentThread().getPriority());  // 10
	}
}
