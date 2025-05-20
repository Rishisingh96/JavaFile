package com.Java.MultiThreding;


// I want to print First priority that means I want to that execute program one by one .
class Demo{
	//We use Synchronised block
	synchronized public void show() {
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
	}
}
class MyThread11 extends Thread{
	public void run() {
		Demo D1 = new Demo();
		D1.show();
	}
}
class MyThread21 extends Thread{
	public void run() {
		Demo D2 = new Demo();
		D2.show();
	}
}
public class Synchronized_class {
public static void main(String[] args) {
	MyThread11 n1 = new MyThread11();
	MyThread21 n2 = new MyThread21();
	
	n1.start();
	n2.start();
}
}
