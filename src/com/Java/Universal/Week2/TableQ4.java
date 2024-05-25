package com.Java.Universal.Week2;

import java.util.Scanner;

public class TableQ4 {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your number.\n");
		int a = in.nextInt();
		for(int i=1; i<=10;i++){
			System.out.println(a+"X"+i+ "="+ a * i );
		}
	}
}