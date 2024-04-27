package com.Java.Inheritance;
class Phone1
{
	public void showTime(){
		System.out.println("This is 8 am");
	}

	public void on(){
		System.out.println("Turning on Phone...");
	}
}

class smartPhone2 extends Phone1
{
	public void music(){
		System.out.println("Playing music ... ");
	}
	public void on(){
		System.out.println("Turning on smartPhone....");
	}
}
class R_49_Dynamic_method2
{
	public static void main(String[] args) 
	{
		Phone1 obj = new Phone1();
	}
}
