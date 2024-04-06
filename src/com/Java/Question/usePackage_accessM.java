package com.Java.Question;

import com.Java.Polymorphism_interface.R_66_access_modifiers;

// java access modifair use in package
// import Rishicode.gym.R_66_access_modifiers;
class  accessModifiers{
	public int x=40;
	protected int y=50;
	int i=5;
	//private z=40;

//	public int meth1(){	// use return stetement
	public void meth1(){
	System.out.println(x);
	System.out.println(y);
	System.out.println(i);
	//System.out.println(z); this is private so we can't access.
	// if we use int than we do use return statement

	}
}

public class usePackage_accessM{
	public static void main(String rishi[]){
	R_66_access_modifiers c = new R_66_access_modifiers();
	//x.meth();
	   System.out.println("\n"+c.x);
	   //System.out.println(c.y);
	   //System.out.println(c.z);
	   //System.out.println(c.a);// This is a private 
	}
}

