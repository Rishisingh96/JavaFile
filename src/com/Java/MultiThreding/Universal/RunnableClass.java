package Multithreding3;

public class RunnableClass implements Runnable {
	public void run() {
		System.out.println("This is mian Class we can Runnable.......");
	}
	
	public static void main(String[] args) {
		RunnableClass rc = new RunnableClass();
		Thread T = new Thread(rc);
		T.start();
	}

}
