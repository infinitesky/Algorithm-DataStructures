package ProjectEuler;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	long sum1=0;
	long sum2=0;
	long diff = 0;
	
	for (int i=1; i<=100;i++)
	{
		sum1  =  (long) (sum1 + Math.pow(i, 2)); 
	}
		System.out.println(sum1);
		
		
	for (int j=1;j<=100;j++)
	{
		sum2 = sum2+j;
	}
	sum2 = (long) Math.pow(sum2, 2);
	System.out.println(sum2);
	diff = sum2-sum1;
	
	System.out.println("difference is: "+ diff);
	
	}

	
	
}
