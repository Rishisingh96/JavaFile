package com.Java.Exception_and_File_Handling;

public class R_84_Dividefuc {
     public static int divide(int a, int b) throws ArithmeticException{
            // Made By Rishi
            int result = a/b;
            return result;
        }

        public static void main(String args[]){
         
// Rishi - uses divide function created by Harry
            
/*Q1. how we can input from Scanner for function.
Scanner sc = new Scanner(System.in);
	a = sc.nextInt();
	b = sc.nextInt();

 */
 try {
     int c = divide(6,0);//  ArithmeticException
     //  int c = divide(6,2);
     System.out.println(c);
 }
 catch(Exception e){
     System.out.println("ArithmeticException");
 }
     }
}


