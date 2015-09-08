package Threadtest;

public class ThreadTest extends Thread{

	static int  counter;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ThreadTest a = new ThreadTest();
		ThreadTest b = new ThreadTest();
		Thread abc = new Thread(a);
		Thread z = new Thread(b);
		Thread x = new Thread(a);
		abc.setName("This is generated from abc");
		z.setName("This is generated from z");
		x.setName("THis is thread X");
		abc.start();
		
		z.start();
	//	x.start();
		//abc.wait(5000L);
		//x.notify();
	}
	
	
	public void run (){
		
		synchronized (this) {
			for (int i=0;i<10;i++){
			counter++;
			System.out.println("Value of i=:" + i + " Value of counter = "+counter);
			System.out.println("I am inside run : " + Thread.currentThread());
			try {
				Thread.sleep(1500L);
				Thread.yield();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			//System.out.println("I am inside run : " + Thread.currentThread());
			
		}
		
	}
	
	
	

}
