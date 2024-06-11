package Multithreding;
class FirstThread extends Thread{
	public void run() {
		int j;
		for(j=1;j<=10; j++) {
			System.out.println("j=" +j);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class multiThredingclass  {
	public static void main(String[] args) {
		FirstThread T1  = new FirstThread();
		T1.start();
		for(int i=1;i<=10; i++) {
			System.out.println("i=" +i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("End of main method...........");
	}
}
