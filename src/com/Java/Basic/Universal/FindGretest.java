package com.Java.Basic.Universal;

public class FindGretest{
	public static void main(String args[]){
		if(args.length ==2){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int x = (a > b) ? a: b;
        System.out.println("Gretest number is :" +x);
		}
		else{
			System.out.println("Invalid parameter");
		}
	}
}