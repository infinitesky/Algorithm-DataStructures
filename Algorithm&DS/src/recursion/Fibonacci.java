package recursion;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inut = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int input = inut.nextInt();
		
		int result = getNthFibonacci(input);
		System.out.println(result);
		
		System.out.println((Integer.MAX_VALUE));
	}
	
	
	public static int getNthFibonacci(int n)
	{
		int x = 0;
		
		if (n ==1)
			return 0;
		if (n==2)
			return 1;
		
		if (n>2){
			
			 x = (getNthFibonacci(n-2) + getNthFibonacci(n-1));
			
		}
		
			return x;
	}
	
	
	

}
