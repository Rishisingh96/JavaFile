class MyRunnableT1 implements Runnable{
	public void run(){
	int i=0;
	while(i<100)
	{
		System.out.println("I am Runnable Thread 1 ");
		i++;
	}
	}
}
class MyRunnableT2 implements Runnable{
	public void run(){
	int i = 0;
	while(i<100){
		System.out.println("I am Runnable Thread 2 ");
		i++;
	}
	}
}

public class R_71_RunnableI{
	public static void main(String args[]){
	MyRunnableT1 bullet1 = new MyRunnableT1();
	Thread gun1 = new Thread(bullet1);

	MyRunnableT2 bullet2 = new MyRunnableT2();
	Thread gun2 = new Thread(bullet2);
	gun1.start();
	gun2.start();
	}
}