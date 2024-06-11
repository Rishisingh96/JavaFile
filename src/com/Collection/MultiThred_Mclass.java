package Multithreding;
class Number1 extends Thread{
	public void run() {
		for(int i =1; i<=5; i++) {
			System.out.println("Number1 "+ i);
		}
	}
}
class Number2 extends Thread{
	public void run() {
		for(int i=1;i<=5; i++) {
			System.out.println("Number2 " +i);
		}
	}
}
public class MultiThred_Mclass {
	public static void main(String[] args) {
		Number1 n1 = new Number1();
		Number2 n2 = new Number2();
		
		n1.start();
		n2.start();
	}
}
