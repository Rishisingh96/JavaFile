class Thread1 extends Thread {
public void run(){
int i=0;
	while(i<500){	
		System.out.println("My Coodking Thread is Running.");
		System.out.println(" I am happy!");
		i  = i+1;
		}
	}
}
class Thread2 extends Thread {
	int i=0;
public void run(){
	while(i<500){
		System.out.println("Thread 2 is chatting with her gf");
		System.out.println("I am sad!");
		i = i+1;
		}
	}
}
public class R_70_multiThreding2{
	public static void main(String args[]){
	Thread1 t1 = new Thread1();
	Thread2 t2 = new Thread2();
	t1.start();
	t2.start();
	}
}