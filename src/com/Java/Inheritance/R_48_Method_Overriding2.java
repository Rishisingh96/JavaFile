package com.Java.Inheritance;
class A{
	public int a;
	public int x;

	public int rishi(){
		return 4;
	}
	public void meth2(){
		System.out.println("This is a methed 2 of class A");	
	}
	public void meth3(int x){
		System.out.println("This is methed 3 of class A");
	}
	private void meth4(){
		System.out.println("This is method 4 of class A , private method");
	}
}
class Derive extends A{
	public void meth2(){
		System.out.println("This is method 2 of class Derive ");
	}

	public void meth3(){
		System.out.println("This is method 3 of class Derive ");
	}

	public void meth4(){
		System.out.println("This is method 4 of class Derive ");
	}
}
class R_48_Method_Overriding{
	public static void main(String arg[]){
	A rishi1 = new A();
	Derive rishi2 = new Derive();
	rishi1.meth2();
	rishi2.meth2();
	
	//rishi1.meth3();  // this is not print becouse method takes argument 
	rishi2.meth3();     // Not a Overriding becouse this one argument and secod is soon.
	
	//rishi1.meth4();  // method is Private  so we can not access of class A. 
	rishi2.meth4();    // Not a Overriding becouse this is private.
	}
}