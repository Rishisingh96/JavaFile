package com.Java.Universal.BasicQuestion;

public class Table{
	public static void main(String args[]){
		//System.out.println("Enter your number.\n");
		
		int a = Integer.parseInt(args[0]);
		for(int i=1; i<=10;i++){
			System.out.println(a+"X"+i+ "="+ a * i );
		}
	}
}