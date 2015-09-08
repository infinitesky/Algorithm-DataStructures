package Threadtest;

public class ThreadExample extends Thread {

	
		// TODO Auto-generated method stub
		
		
	public static void main (String[] args)
	
	{
		callme();
	}
	
	
	public static void callme()
	{
		
	
		Thread th = new Thread();
		th.start();
		
	//	System.out.println(" this is Main method "+ Thread.currentThread().getName());
		
	
	}
	public  void run (){
		System.out.println(" this is run method"+ Thread.currentThread().getName());
	};

}
