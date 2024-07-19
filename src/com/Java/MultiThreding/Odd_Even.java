package com.Java.MultiThreding;

class Even extends Thread{
	public void run() {
		int n=9;
		if(n%2==0) {
			System.out.println("Even Number");
		}
	}
}
class Odd extends Thread{
	public void run() {
		int n=9;
		
		if(n%2!=0) {
			System.out.println("Odd Number");
		}
		
	}
}
public class Odd_Even {
public static void main(String[] args) {
	Even e = new Even();
	Odd o = new Odd();
	e.start();
	o.start();
	//e.start(6); // We can not give parameter value for run method
	
	}
}
