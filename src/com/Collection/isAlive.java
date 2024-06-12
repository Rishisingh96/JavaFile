package Multithreding;
class MyThread extends Thread{
	public void run() {
		int j;
		for(j=1;j<=10; j++) {
			System.out.println("j=" +j);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class isAlive {
public static void main(String[] args) {
	MyThread T1  = new MyThread();
	T1.start();
	for(int i=1;i<=10; i++) {
		System.out.println("i=" +i);
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	if(T1.isAlive())
		System.out.println("User Define Thrad is still running............");
	else
		System.out.println("User Defined Thread Ended.........!!!!!!!!!!!");
	
	
	System.out.println("End of main method...........");
}
}
