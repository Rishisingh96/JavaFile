package com.Java.Universal.BasicQuestion;

import java.util.Scanner;

class square_cube {
	public static void main(String args[]){
		System.out.println("Enter your number for square:");
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int sq = s*s;
		System.out.println("Enter your number for cube:");
		int c = sc.nextInt();
		int cu = c*c*c;

		System.out.println("Square :"+sq);
		System.out.println("Square :"+cu);
	}
}