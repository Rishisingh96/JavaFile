package com.Java.Polymorphism_interface;
class C1{
	public int x = 5;
	protected int y = 45;
	int z = 6;
	private int a = 78;
	public void meth1(){
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);
	System.out.println(a);
	}
	
} 
public class R_66_access_modifiers{
    public String x;

    public static void main(String[] args) {
        C1 c = new C1();
	   c.meth1();  // we can access all modifiers. private

	   System.out.println("\n\n"+c.x);
	   System.out.println(c.y);
	   System.out.println(c.z);
//	   System.out.println(c.a);// This is a private 
	}
}