package ProjectEuler;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1;
		int b = 2;
		int c;
		int limit = 4000000;

		long sum=0;
		while (a <= limit)
		{

			if (a%2==0 )
				sum = sum+a;
			c= a+b;
			a = b ;
			b = c;

		}

		System.out.println("Sum is : "+sum);


	}
}
