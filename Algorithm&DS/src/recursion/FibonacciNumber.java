package recursion;

public class FibonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N = 5;
		
		int result = fibonacci(N);
		System.out.println(result);
		
	}
	
	private static int fibonacci(int N){
		
		
		if (N==0)
			return 0;
		else if (N<=2)
			return 1;
						
		else return fibonacci(N-1) + fibonacci(N-2);
		
		
	}

}
