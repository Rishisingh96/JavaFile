package com.Java.Inheritance_Inferface;
class Base{
	public int x;

	public int getX(){
		return x;
	}
	public void setX(int x){
	System.out.println("I am in base setting x now");
	this.x = x;
	}
	public void printMe(){
		System.out.println("I am a constructor");
	}

}
class Derived extends Base{
	public int y;

	public int getY(){
		return y;
	}

	public void setY(int y){
		this.y = y;
	}
}
public class Rishi{
	public static void main(String[] args){
	// Creating an Object of basic calss
		Base b = new Base();
			b.setX(4);
			System.out.println(b.getX());

// Creating an object of derived class
	Derived d = new Derived();
	d.setY(43);
	System.out.println(d.getY());
	}
}