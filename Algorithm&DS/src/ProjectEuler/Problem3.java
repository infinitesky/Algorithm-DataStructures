package ProjectEuler;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long num = 600851475143L;
		long limit = (long) Math.sqrt(num);
		for (long i=1; i<=limit; i++ )
		{
			//System.out.println("Running......");
			if (num%i==0 && isPrime(i))
			{
				//print all the prime factors of number
				System.out.println(i);
			}
		}


	}

	static boolean isPrime(long n) {
		//check if n is a multiple of 2
		if (n%2==0) return false;
		//if not, then just check the odds
		for(long i=3;i*i<=n;i+=2) {
			if(n%i==0)
				return false;
		}
		return true;
	}

}
